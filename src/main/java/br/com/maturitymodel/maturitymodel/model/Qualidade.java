package br.com.maturitymodel.maturitymodel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Qualidade {

    private String testesUnitarios;
    private String bdd;
    private String testesAutomatizados;
    private String massaAutomatizada;
    private String testeCarga;
    private String qualityGateway;
    private float qualityGatewayNota;
    private float qualityGatewayBugs;
    private float qualityGatewayCodeSmell;
    private float qualityGatewayCobertura;

}
