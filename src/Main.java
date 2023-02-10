import entidades.FolhaPagamento;
import ui.DialogUtils;

public class Main {
    public static void main(String[] args) {
        Double valorHoraTrabalho = DialogUtils.solicitarValorDouble("Digite o valor da hora de trabalho: ");
        Double qtdeHorasTrabalhadas = DialogUtils.solicitarValorDouble("Digite a quantidade de horas trabalhadas: ");
        String relatorioFolhaPagamento = new FolhaPagamento(valorHoraTrabalho, qtdeHorasTrabalhadas).gerarRelatorio();
        DialogUtils.exibirMensagem(relatorioFolhaPagamento);
    }

}
