package br.com.maturitymodel.maturitymodel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Observabilidade {

    private String metricasTecnicas;
    private String dynatrace;
    private String prometheus;
    private String grafana;
    private String logs;
    private String formato;
    private String tempoVida;

}
