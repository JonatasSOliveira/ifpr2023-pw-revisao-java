package ui;

import javax.swing.*;

public class DialogUtils {
    public static Double solicitarValorDouble(String mensagem) {
        Double valor = null;
        boolean ok = false;

        while (!ok) {
            try {
                valor = Double.parseDouble(JOptionPane.showInputDialog(mensagem).replaceAll(",", "."));
                ok = true;
            } catch (NumberFormatException e) {
                DialogUtils.exibirMensagemAtencao("Valor inválido");
            }
        }

        return valor;
    }

    public static void exibirMensagemAtencao(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem,
                "Atenção!", JOptionPane.WARNING_MESSAGE);
    }

    public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
