package br.com.maturitymodel.maturitymodel.service.exceptions;

public class ObjetoNaoEncontratoException extends RuntimeException {

    public ObjetoNaoEncontratoException (Object id) {
        super ("Não foi possível encontrar o registro com o id " + id);
    }

}
