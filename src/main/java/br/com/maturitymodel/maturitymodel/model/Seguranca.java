package br.com.maturitymodel.maturitymodel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Seguranca {

    private String configuracaoAmbiente;
    private String credenciaisAplicacao;
    private String possuiCertificado;
    private String logAuditoria;
    private String pentest;
    private String autenticacao;
    private String autorizacao;
    private String tempoVidaLogAuditoria;
    private String necessarioAcessoExterno;

}
