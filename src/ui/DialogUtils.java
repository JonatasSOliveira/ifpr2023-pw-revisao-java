package ui;

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

    public static void exibirMensagemAtencao(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem,
                "Atenção!", JOptionPane.WARNING_MESSAGE);
    }
}
