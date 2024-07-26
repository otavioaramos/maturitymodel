package br.com.maturitymodel.maturitymodel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Dados {

    private String fazAcessoDiretoOutrosDominios;
    private String barramentoMensagens;
    private String replicacaoDados;
    private String bancoDados;

}
