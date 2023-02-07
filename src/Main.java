import ui.DialogUtils;

import javax.swing.*;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            String[] lista = DialogUtils.solicitarListaStrings("Informe a lista de valores:");
        } catch (IOException e) {
            DialogUtils.exibirMensagemAtencao(e.getMessage());
        } catch (Exception e) {
            DialogUtils.exibirMensagemAtencao("Erro inesperado!");
        }
    }

}