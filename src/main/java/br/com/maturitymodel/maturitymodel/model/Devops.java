package br.com.maturitymodel.maturitymodel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Devops {
    private String pipeline;
    private String helthChecks;
    private String liveNess;
    private String readiness;
    private String estrategiaDeploy;
}
