package br.com.maturitymodel.maturitymodel.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Document(collection = "aplicacoes")
@Data
@NoArgsConstructor

public class Aplicacoes {

    @Id
    private String _id;
    private String nome;
    private String linguagem;
    private String versao;
    private String techLead;
    private Produto produto;
    private Arquitetura arquitetura;
    private Qualidade qualidade;
    private Devops devops;
    private Resiliencia resiliencia;
    private Observabilidade observabilidade;
    private DataDriven dataDriven;
    private Dados dados;
    private ServicosWeb servicosWeb;
    private Codigo codigo;
    private String dataCriacaoDocumento;
    private String dataAlteracaoDocumento;

}

