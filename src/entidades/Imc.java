package entidades;

import enums.CondicaoImc;
import enums.SexoPessoa;

public class Imc {

    private static Double calcularImc(Double peso, Double altura) {
        return (peso / (altura * altura)) * 10;
    }

    public static CondicaoImc verificarCondicaoImc(SexoPessoa sexo, Double peso, Double altura) {
        double imc = Imc.calcularImc(peso, altura);

        switch (sexo) {
            case MASCULINO -> {
                if (imc < 19.1) {
                    return CondicaoImc.ABAIXO_PESO;
                }
                if (imc < 25.8) {
                    return CondicaoImc.PESO_NORMAL;
                }
                if (imc < 27.3) {
                    return CondicaoImc.MARGINALMENTE_ACIMA_PESO;
                }
                if (imc < 32.3) {
                    return CondicaoImc.ACIMA_PESO_IDEAL;
                }

                return CondicaoImc.OBESO;
            }

            case FEMININO -> {
                if (imc < 20.7) {
                    return CondicaoImc.ABAIXO_PESO;
                }
                if (imc < 26.4) {
                    return CondicaoImc.PESO_NORMAL;
                }
                if (imc < 27.8) {
                    return CondicaoImc.MARGINALMENTE_ACIMA_PESO;
                }
                if (imc < 31.1) {
                    return CondicaoImc.ACIMA_PESO_IDEAL;
                }

                return CondicaoImc.OBESO;
            }

            default -> throw new IllegalArgumentException("Sexo inválido");
        }
    }

}
