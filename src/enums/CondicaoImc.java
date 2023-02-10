package enums;

public enum CondicaoImc {
    ABAIXO_PESO("Abaixo do peso"),
    PESO_NORMAL("No peso normal"),
    MARGINALMENTE_ACIMA_PESO("Marginalmente acima do peso"),
    ACIMA_PESO_IDEAL("Acima do peso ideal"),
    OBESO("Obeso");

    private final String descricao;

    CondicaoImc(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
