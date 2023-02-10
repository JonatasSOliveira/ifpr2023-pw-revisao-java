import entidades.Pessoa;
import enums.SexoPessoa;
import ui.DialogUtils;

public class Main {
    public static void main(String[] args) {
        String[] opcoesDescricaoSexo = {SexoPessoa.MASCULINO.getDescricao(), SexoPessoa.FEMININO.getDescricao()};
        SexoPessoa[] sexoPessoas = {SexoPessoa.MASCULINO, SexoPessoa.FEMININO};

        SexoPessoa sexo = sexoPessoas[DialogUtils.solicitarOpcao("Escolha o sexo", opcoesDescricaoSexo)];
        Integer pesoa = DialogUtils.solicitarValorInteger("Digite o peso (em gramas)");
        Integer altura = DialogUtils.solicitarValorInteger("Digite a altura (em centimetros)");
        Pessoa pessoa = new Pessoa(sexo, pesoa, altura);

        DialogUtils.exibirMensagem("Condição de imc: " + pessoa.getCondicaoImc().getDescricao());
    }

}
