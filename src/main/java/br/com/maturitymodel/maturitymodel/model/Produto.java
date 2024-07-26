package br.com.maturitymodel.maturitymodel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Produto {

    private String squad;
    private String tribo;
    private String modulo;
    private String status;

}
