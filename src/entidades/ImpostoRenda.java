package entidades;

import enums.DescontoImpostoRenda;
import utils.NumbericUtils;

public class ImpostoRenda {
    private final Double valor;
    private final DescontoImpostoRenda descontoImpostoRenda;

    public ImpostoRenda(Double salarioBruto) {
        this.descontoImpostoRenda = DescontoImpostoRenda.getDescontoImpostoRenda(salarioBruto);
        this.valor = this.calcularValorImpostoRenda(salarioBruto);
    }

    private Double calcularValorImpostoRenda(Double salarioBruto) {
        return salarioBruto * this.descontoImpostoRenda.getPorcentagemDesconto() * 0.01;
    }

    public Double getValor() {
        return this.valor;
    }

    public Double getPorcentagemDesconto() {
        return this.descontoImpostoRenda.getPorcentagemDesconto();
    }

    public String getPorcentagemDescontoFormatado() {
        return NumbericUtils.formatarDoubleParaDecimal(this.getPorcentagemDesconto()) + "%";
    }

}
