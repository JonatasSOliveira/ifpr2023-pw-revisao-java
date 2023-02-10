package enums;

public enum SexoPessoa {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private final String descricao;

    SexoPessoa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
