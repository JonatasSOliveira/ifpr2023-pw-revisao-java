package ui;

import utils.ListUtils;

import javax.swing.*;
import java.io.IOException;

public class DialogUtils {
    public static String[] solicitarListaStrings(String mensagem) throws IOException {
        String listaNaoTratada = JOptionPane.showInputDialog(mensagem);

        if (listaNaoTratada.isEmpty()) {
            throw new IOException("Nenhum valor informado!");
        }

        if (!listaNaoTratada.contains(",")) {
            throw new IOException("Valor informado incorretamente");
        }

        return listaNaoTratada.split(",");
    }

    public static Integer[] solicitarListaInteiros(String mensagem) throws IOException, NumberFormatException {
        String[] listaStrings = DialogUtils.solicitarListaStrings(mensagem);
        Integer[] listaInteiros = new Integer[][listaStrings.length];

        for (int i = 0; i < listaStrings.length; i++) {
            try {
                listaInteiros[i] = Integer.parseInt(listaStrings[i].trim());
            }  catch (NumberFormatException e) {
                throw new NumberFormatException("Infomardo lista com valores não númericos inteiros");
            }
        }

        return listaInteiros;
    }

    public static void exibirMensagemAtencao(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem,
                "Atenção!", JOptionPane.WARNING_MESSAGE);
    }

    public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
