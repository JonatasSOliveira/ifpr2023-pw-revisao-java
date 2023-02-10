package ui;

import javax.swing.*;

public class DialogUtils {

    public static Integer solicitarValorInteger(String mensagem) {
        Integer valor = null;
        boolean ok = false;

        while (!ok) {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
                ok = true;
            } catch (NumberFormatException e) {
                DialogUtils.exibirMensagemAtencao("Valor inválido");
            }
        }

        return valor;
    }

    public static int solicitarOpcao(String mensagem, String[] opcoes) {

        return JOptionPane.showOptionDialog(
                null,
                mensagem,
                "Escolha a opção",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );
    }


    public static void exibirMensagemAtencao(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem,
                "Atenção!", JOptionPane.WARNING_MESSAGE);
    }

    public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
