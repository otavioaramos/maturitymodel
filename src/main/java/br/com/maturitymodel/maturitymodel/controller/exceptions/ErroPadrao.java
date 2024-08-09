package br.com.maturitymodel.maturitymodel.controller.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@AllArgsConstructor
@Data
@Builder
public class ErroPadrao {

    private Instant timestamp;
    private int status;
    private String erro;
    private String messagem;


}
