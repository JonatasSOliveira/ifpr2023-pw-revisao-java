package ui;

import javax.swing.*;

public class DialogUtils {
    public static Integer solicitarNumeroInteiro(String mensagem) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensagem));
    }

    public static void exibirInformacao(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
