package br.com.maturitymodel.maturitymodel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Document(collection = "aplicacoes")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor

public class Aplicacoes {

    @Id
    private ObjectId _id;
    private String nome;
    private String techLead;
    private Produto produto;
    private Arquitetura arquitetura;
    private Qualidade qualidade;
    private Devops devops;
    private Resiliencia resiliencia;
    private Observabilidade observabilidade;
    private DataDriven dataDriven;
    private Seguranca seguranca;
    private Dados dados;
    private ServicosWeb servicosWeb;
    private Codigo codigo;
    private String dataCriacaoDocumento;
    private String dataAlteracaoDocumento;

}
