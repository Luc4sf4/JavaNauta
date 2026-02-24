package associacao;

import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> listaFuncionario;

    public Departamento(String nome, List<Funcionario> listaFuncionario) {
        this.nome = nome;
        this.listaFuncionario = listaFuncionario;
    }

    public List<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(List<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarFuncionario(){
        System.out.println("Departamento " + nome);
        listaFuncionario.forEach(funcionario -> System.out.println(funcionario));
    }
}
