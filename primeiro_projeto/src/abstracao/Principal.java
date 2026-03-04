package abstracao;

public class Principal {
    public static void main(String[] args) {

        Funcionario joao = new Funcionario("Rua das Flores","Sao Paulo","153","SP",
                "9854596-000", "Joao Paulo da Silva",  "00025487565", "Vendedor");
        Client yasmim = new Client("Rua das Rosas", "Rio de Janeiro", "RJ", "55487560-00",
                "Joana Almeida", "0005485620");

        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(yasmim);
        yasmim.mostrarEndereco();
    }
}
