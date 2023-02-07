import entidades.Pessoa;
import ui.DialogUtils;


public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(DialogUtils.solicitarNumeroInteiro("Informe a idade da Pessoa"));
        String descricaoFaixaEtaria = "A pessoa é da seguinte faixa etária: " + pessoa.getFaixaEtaria().getDescricao();
        DialogUtils.exibirInformacao(descricaoFaixaEtaria);
    }

}