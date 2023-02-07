package enums;

public enum FaixaEtaria {
    CRIANCA("Criança"),
    ADOLESCENTE("Adolescente"),
    ADULTO("Adulto"),
    IDOSO("Idoso");

    private final String descricao;

    FaixaEtaria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
