package entidades;

import enums.CondicaoImc;
import enums.SexoPessoa;

public class Pessoa {
    private final CondicaoImc condicaoImc;

    public Pessoa(SexoPessoa sexo, Integer peso, Integer altura) {
        this.condicaoImc = Imc.verificarCondicaoImc(sexo, (double) peso, (double) altura);
    }

    public CondicaoImc getCondicaoImc() {
        return condicaoImc;
    }
}
