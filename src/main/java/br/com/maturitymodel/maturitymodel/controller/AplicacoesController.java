package br.com.maturitymodel.maturitymodel.controller;

import br.com.maturitymodel.maturitymodel.model.Aplicacoes;
import br.com.maturitymodel.maturitymodel.service.AplicacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aplicacoes")
public class AplicacoesController {

    @Autowired
    private AplicacoesService aplicacoesService;

    @GetMapping
    public ResponseEntity<List<Aplicacoes>> findAll () {
        return ResponseEntity.ok().body(aplicacoesService.findAll());
    };
}
