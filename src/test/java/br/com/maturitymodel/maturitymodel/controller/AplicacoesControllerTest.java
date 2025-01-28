package br.com.maturitymodel.maturitymodel.controller;

import br.com.maturitymodel.maturitymodel.model.Aplicacoes;
import br.com.maturitymodel.maturitymodel.service.AplicacoesService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.*;

@SpringBootTest
@AutoConfigureMockMvc

public class AplicacoesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private AplicacoesService aplicacoesService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    };

    @Test
    void listarTodosTest () throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/aplicacoes/listarTodos").contentType(MediaType.APPLICATION_JSON);
        mockMvc.perform(request).andExpect(status().isOk());
    }

    @Test
    void listarPorIdSucessoTest () throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get ( "/aplicacoes/listarPorId/123456789" ).contentType(MediaType.APPLICATION_JSON);
        when(aplicacoesService.findById(anyString())).thenReturn(any());
        mockMvc.perform(request).andExpect(status().isOk());
        //verify(aplicacoesService,times(1)).findById("123456789");
    }

    @Test
    void listarPorIdFalhaTest () throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get ( "/aplicacoes/listarPorId/123456789" ).contentType(MediaType.APPLICATION_JSON);
        when(aplicacoesService.findById(anyString())).thenReturn(null);
        doNothing().when(aplicacoesService).insert(any(Aplicacoes.class));
        mockMvc.perform(request).andExpect(status().isNotFound());
        //verify(aplicacoesService,times(1)).findById("123456789");
    }
}