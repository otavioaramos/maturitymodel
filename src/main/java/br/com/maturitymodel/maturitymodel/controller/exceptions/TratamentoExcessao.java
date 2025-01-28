package br.com.maturitymodel.maturitymodel.controller.exceptions;

import br.com.maturitymodel.maturitymodel.service.exceptions.ObjetoNaoEncontratoException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class TratamentoExcessao extends RuntimeException {

    @ExceptionHandler(ObjetoNaoEncontratoException.class)
    public ResponseEntity<ErroPadrao> objetoNaoEncontrado (ObjetoNaoEncontratoException exception, HttpServletRequest request) {
        String erro = "Objeto não encontrado";
        HttpStatus status = HttpStatus.NOT_FOUND;

        ErroPadrao erroPadrao = ErroPadrao.builder().timestamp(Instant.now()).status(status.value()).erro(erro).messagem(exception.getMessage()).build();

        return ResponseEntity.status(status).body(erroPadrao);
    };
}
