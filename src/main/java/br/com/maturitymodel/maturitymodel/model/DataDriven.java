package br.com.maturitymodel.maturitymodel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class DataDriven {

    private String metricasNegocio;
    private String enviaDadosDatalake;
    private String dashboard;

}
