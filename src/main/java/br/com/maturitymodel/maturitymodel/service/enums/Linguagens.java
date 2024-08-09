package br.com.maturitymodel.maturitymodel.service.enums;

import java.util.Arrays;

public enum Linguagens {
    JAVA("java"),
    COBOL("cobol"),
    VISUALAGE("visualage");

    private String linguagem;
    Linguagens(String linguagem ){
        this.linguagem = linguagem;
    }

    public static Linguagens getLinguagem(String linguagem) {
        return Arrays.stream(values()).filter(status -> status.linguagem.equals(linguagem)).findFirst().orElse(null);
    }

}
