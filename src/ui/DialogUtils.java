package ui;

import javax.swing.*;

public class DialogUtils {

    public static String solicitarValorString(String mensagem) {
        return JOptionPane.showInputDialog(null, mensagem);
    }

//  TODO: Verificar usabilidades
//
//    public static void exibirMensagemAtencao(String mensagem) {
//        JOptionPane.showMessageDialog(null, mensagem,
//                "Atenção!", JOptionPane.WARNING_MESSAGE);
//    }
//
//    public static void exibirMensagem(String mensagem) {
//        JOptionPane.showMessageDialog(null, mensagem);
//    }
}
