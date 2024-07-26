package br.com.maturitymodel.maturitymodel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Codigo {

    private String compartilhado;
    private String readmePadronizado;
    private String gerenciadorPacote;
    private String urlRepositorio;

}
