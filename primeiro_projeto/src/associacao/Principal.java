package associacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //Carro nao existe sem motor
        Carro fusca = new Carro(20);
        fusca.mostrarCilindradas();

        //Departamento de ti existe sem funcionario
        Funcionario joao = new Funcionario("Joao ");
        Funcionario yasmim = new Funcionario("Yasmim");
        Funcionario lucas = new Funcionario("Lucas");
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(joao);
        listaFuncionarios.add(yasmim);
        listaFuncionarios.add(lucas);

        Departamento ti = new Departamento("TI", listaFuncionarios);
        ti.mostrarFuncionario();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostrarFuncionario();

    }
}
