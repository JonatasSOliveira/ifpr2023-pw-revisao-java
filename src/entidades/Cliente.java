package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private static Integer ultimoId = 0;
    private Integer id;
    private final String nome;
    private final List<Endereco> enderecos = new ArrayList<>();

    public Cliente(String nome) {
        this.atribuirValorId();
        this.nome = nome;
    }

    private void atribuirValorId() {
        Cliente.ultimoId++;
        this.id = Cliente.ultimoId;
    }

    public String toString() {
        StringBuilder infoCliente = new StringBuilder("id: " + this.id + "\nNome: " + this.nome + "\nEndereços:");

        for (Endereco endereco : this.enderecos) {
            infoCliente.append("\n-").append(endereco.toString());
        }

        return infoCliente.toString();
    }

    public void adicionarEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }
}
