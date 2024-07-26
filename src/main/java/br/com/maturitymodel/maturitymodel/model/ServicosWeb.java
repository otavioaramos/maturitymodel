package br.com.maturitymodel.maturitymodel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ServicosWeb {

    private String gateway;
    private String autorizacao;
    private String padrao;
    private String swagger;
    private String sincronismo;
    private String tempoRespostaMedio;

}
