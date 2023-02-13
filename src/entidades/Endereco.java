package entidades;

public class Endereco {
    private static Integer ultimoId = 0;
    private Integer id;
    private final String logradouro;
    private final String numero;
    private final String bairro;
    private final String cidade;
    private final String estado;

    public Endereco(String logradouro, String numero, String bairro, String cidade, String estado) {
        this.atribuirValorId();
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    private void atribuirValorId() {
        Endereco.ultimoId++;
        this.id = Endereco.ultimoId;
    }

    public String toString() {
        return "id: " + this.id + "\nLogradouro: " + this.logradouro + "\nNumero: " + this.numero
                + "\nBairro: " + this.bairro + "\nCidade: " + this.cidade + "\nEstado: " + this.estado;
    }
}
