package abstracao;

public class Client extends Endereco implements Pessoa {
    private String nome;
    private String documento;

    public Client(String rua, String cidade, String estado, String cep, String nome, String documento) {
        super(rua, cidade, estado, cep);
        this.nome = nome;
        this.documento = documento;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }

    public void mostrarEndereco(){
        System.out.println("Endereco do Cliente  " + getRua() +", " + getCidade() + ", " + getEstado() + ", " + getCep());
    }
}
