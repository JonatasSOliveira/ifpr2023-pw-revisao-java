package enums;

public enum DescontoImpostoRenda {
    ABAIXO_900(0.0),
    ATE_1500(5.0),
    ATE_2500(10.0),
    ACIMA_2500(20.0);

    private final Double porcentagemDesconto;

    DescontoImpostoRenda(Double porcentagemDesconto) {
        this.porcentagemDesconto = porcentagemDesconto;
    }

    public Double getPorcentagemDesconto() {
        return this.porcentagemDesconto;
    }

    public static DescontoImpostoRenda getDescontoImpostoRenda(Double salarioBruto) {
        if (salarioBruto < 900) {
            return DescontoImpostoRenda.ABAIXO_900;
        }
        if (salarioBruto >= 900 && salarioBruto <= 1500) {
            return DescontoImpostoRenda.ATE_1500;
        }
        if (salarioBruto >= 1500 && salarioBruto <= 2500) {
            return DescontoImpostoRenda.ATE_2500;
        }

        return DescontoImpostoRenda.ACIMA_2500;
    }

}
