package br.com.maturitymodel.maturitymodel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Arquitetura {

    private String plataforma;
    private String ambiente;
    private String tecnlogia;
    private String tipoArquitura;
    private String tipoSistema;
    private String documentacao;
    private String possuiDSA;
    private String possuiPaginaConfluence;
    private String possuiBlueprint;
    private String fazParteContexto;

}
