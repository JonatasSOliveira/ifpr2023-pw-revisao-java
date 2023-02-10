package entidades;

import utils.DinheiroUtils;
import utils.NumbericUtils;

public class FolhaPagamento {

    private final Double valorHoraTrabalho;
    private final Double qtdHorasTrabalhadas;
    private final Double salarioBruto;
    private final Fgts fgts;
    private final ImpostoRenda impostoRenda;
    private final Sindicato sindicato;
    private  final Double totalValorDesconto;
    private final Double salarioLiquido;

    public FolhaPagamento(Double valorHoraTrabalho, Double qtdeHorasTrabalhadas) {
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.qtdHorasTrabalhadas = qtdeHorasTrabalhadas;
        this.salarioBruto = valorHoraTrabalho * qtdeHorasTrabalhadas;

        this.fgts = new Fgts(this.salarioBruto);
        this.impostoRenda = new ImpostoRenda(this.salarioBruto);
        this.sindicato = new Sindicato(this.salarioBruto);
        this.totalValorDesconto = this.impostoRenda.getValor() + this.sindicato.getValorDesconto();
        this.salarioLiquido = this.salarioBruto - this.totalValorDesconto;
    }

    private String gerarLinhaRelatorio(String label, int qtdePontos, Double valor) {
        String valorFormatado = DinheiroUtils.formatarParaReal(valor);

        return label + ": " + ".".repeat(qtdePontos) + valorFormatado;
    }

    public String gerarRelatorio() {
        String valorHoraTrabalhoFormatado = DinheiroUtils.formatarParaReal(this.valorHoraTrabalho);
        String qtdeHorasTrabalhadasFormatada = NumbericUtils.formatarDoubleParaDecimal(this.qtdHorasTrabalhadas);

        return this.gerarLinhaRelatorio(
                "Salário Bruto(" + valorHoraTrabalhoFormatado + " * "  + qtdeHorasTrabalhadasFormatada + ")",
                3,
                this.salarioBruto
            ) + this.gerarLinhaRelatorio(
                "\n(-) IR (" + this.impostoRenda.getPorcentagemDescontoFormatado() + ")",
                21,
                this.impostoRenda.getValor()
            ) + this.gerarLinhaRelatorio(
                "\n(-) Sindicato (" + this.sindicato.getPorcentagemDescontoFormatado() + ")",
                12,
                this.sindicato.getValorDesconto()
            ) + this.gerarLinhaRelatorio(
                "\nFgts (" + this.fgts.getPorcentagemDescontoFormatado() + ")",
                21,
                this.fgts.getValor()
            ) + this.gerarLinhaRelatorio("\nTotal Desconto ", 18, this.totalValorDesconto)
            + this.gerarLinhaRelatorio("\nSalário Liquido", 19, this.salarioLiquido);

    }

}
