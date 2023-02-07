package entidades;

import enums.FaixaEtaria;

public class Pessoa {
    private Integer idade;

    public Pessoa(Integer idade) {
        this.idade = idade;
    }

    public FaixaEtaria getFaixaEtaria() {
        if (idade < 12) {
            return FaixaEtaria.CRIANCA;
        }

        if (idade < 18) {
            return FaixaEtaria.ADOLESCENTE;
        }

        if (idade < 60) {
            return FaixaEtaria.ADULTO;
        }

        return FaixaEtaria.IDOSO;
    }
}
