import ui.DialogUtils;
import utils.ListUtils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Integer[] lista = DialogUtils.solicitarListaInteiros("Informe a lista de valores inteiros separados por \",\":");
            String mensagem = "Lista original: " + ListUtils.juntarLista(lista)
                    + "\nLista ordenada: " + ListUtils.juntarLista(ListUtils.ordernarListaInteiros(lista));
            DialogUtils.exibirMensagem(mensagem);
        } catch (IOException | NumberFormatException e) {
            DialogUtils.exibirMensagemAtencao(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            DialogUtils.exibirMensagemAtencao("Erro inesperado!");
        }
    }

}