import ui.DialogUtils;
import utils.ListUtils;

import javax.swing.*;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            String[] lista = DialogUtils.solicitarListaStrings("Informe a lista de valores separados por \",\":");
            String mensagem = "Lista original: " + ListUtils.juntarLista(lista)
                    + "\nLista inversa: " + ListUtils.juntarLista(ListUtils.inverterLista(lista));
            DialogUtils.exibirMensagem(mensagem);
        } catch (IOException e) {
            DialogUtils.exibirMensagemAtencao(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            DialogUtils.exibirMensagemAtencao("Erro inesperado!");
        }
    }

}