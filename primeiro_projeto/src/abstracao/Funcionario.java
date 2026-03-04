package abstracao;

public class Funcionario extends Endereco implements Pessoa {

    private String nome;
    private String documento;
    private String cargo;

    public Funcionario(String rua, String cidade, String numero, String estado, String cep, String nome,
                       String documento, String cargo) {
        //super -> chama metodos da classe que foi extendida
        super(rua, cidade, numero, estado, cep);
        this.nome = nome;
        this.documento = documento;
        this.cargo = cargo;
    }

    public Funcionario(String nome, String documento, String cargo) {
        this.nome = nome;
        this.documento = documento;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getNome() {
        return "";
    }

    @Override
    public void setNome(String nome) {
    this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return "";
    }

    @Override
    public void setDocumento(String documento) {

    }

    public void mostrarEndereco(){
        System.out.println("Endereco do funcionario  " + getRua() +", " + getCidade() + ", " +
                getNumero() + ", " + getEstado() + ", " + getCep());
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
