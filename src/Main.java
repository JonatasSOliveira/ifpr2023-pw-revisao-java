import entidades.Cliente;
import entidades.Endereco;
import ui.DialogUtils;

public class Main {
    public static void main(String[] args) {
        boolean sistemaFinalizou = false;

        while (!sistemaFinalizou) {
            String nomeCliente = DialogUtils.solicitarValorString("Digite o nome do cliente: ");
            Cliente cliente = new Cliente(nomeCliente);

            boolean adicionandoEndereco = true;
            while (adicionandoEndereco) {
                String logradouro = DialogUtils.solicitarValorString("Digite o logradouro do endereço: ");
                String numero = DialogUtils.solicitarValorString("Digite o numero do endereço: ");
                String bairro = DialogUtils.solicitarValorString("Digite o bairro do endereço: ");
                String cidade = DialogUtils.solicitarValorString("Digite a cidade do endereço: ");
                String estado = DialogUtils.solicitarValorString("Digite o estado do endereço: ");

                cliente.adicionarEndereco(new Endereco(logradouro, numero, bairro, cidade, estado));

                if (DialogUtils.solicitarValorString("Deseja adicionar outro endereço? (S/N): ").equals("N")) {
                    adicionandoEndereco = false;
                }
            }

            System.out.println(cliente);

            if (DialogUtils.solicitarValorString("Deseja finalizar o sistema? (S/N): ").equals("S")) {
                sistemaFinalizou = true;
            }
        }
    }

}
