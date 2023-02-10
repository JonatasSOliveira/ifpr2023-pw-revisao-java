package entidades;

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

    public String getRelatorio() {
        return "Salário Bruto(" + this.valorHoraTrabalho + " * "  + this.qtdHorasTrabalhadas + "):..." + this.salarioBruto
                + "\n(-) IR (" + this.impostoRenda.getPorcentagemDesconto() + "%):....................." + this.impostoRenda.getValor()
                + "\n(-) Sindicato (" + this.sindicato.getPorcentagemDesconto() + "%):............" + this.sindicato.getValorDesconto()
                + "\nFGTS (" + fgts.getPorcentagemDesconto() + "%):...................." + this.fgts.getValor()
                + "\nTotal Desconto:................." + this.totalValorDesconto
                + "\nSalário Liquido:................." + this.salarioLiquido;
    }

}
