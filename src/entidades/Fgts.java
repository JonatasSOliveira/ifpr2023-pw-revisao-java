package entidades;

import utils.NumbericUtils;

public class Fgts {
    private final Double PORCENTAGEM_DESCONTO_FGTS = 11.0;
    private final Double valor;

    public Fgts(Double salarioBruto) {
        this.valor = salarioBruto * PORCENTAGEM_DESCONTO_FGTS * 0.01;
    }

    public Double getValor() {
        return this.valor;
    }

    public String getPorcentagemDescontoFormatado() {
        return NumbericUtils.formatarDoubleParaDecimal(PORCENTAGEM_DESCONTO_FGTS) + "%";
    }

}
