package entidades;

public class Sindicato {
    private final Double PORCENTAGEM_DESCONTO_SINDICATO = 3.0;

    private final Double valorDesconto;

    public Sindicato(Double salarioBruto) {
        this.valorDesconto = salarioBruto * PORCENTAGEM_DESCONTO_SINDICATO * 0.01;
    }

    public Double getValorDesconto() {
        return this.valorDesconto;
    }

    public Double getPorcentagemDesconto() {
        return this.PORCENTAGEM_DESCONTO_SINDICATO;
    }


}
