package entidades;

import utils.NumbericUtils;

public class Sindicato {
    private final Double PORCENTAGEM_DESCONTO_SINDICATO = 3.0;

    private final Double valorDesconto;

    public Sindicato(Double salarioBruto) {
        this.valorDesconto = salarioBruto * PORCENTAGEM_DESCONTO_SINDICATO * 0.01;
    }

    public Double getValorDesconto() {
        return this.valorDesconto;
    }
    
    public String getPorcentagemDescontoFormatado() {
        return NumbericUtils.formatarDoubleParaDecimal(PORCENTAGEM_DESCONTO_SINDICATO) + "%";
    }
}
