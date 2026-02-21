package contaBancaria;

public class ContaBancaria {
    //Atributos privado
    private String titular;
    private double saldo;

    //Getter e Setter -> Metodos Padroes para acessar e modificar esses atributos

    //Obter o titular
    public String getTitular() {
        return titular;
    }

    //Modificar o titular
    public void setTitular(String novoTitular) {
        this.titular = novoTitular; // this se usa para se referir ao atributo da classe
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Construtor - com atributos
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    //Construtor sem atributos
    public ContaBancaria(){}

    //Constutor que inicializa com o saldo  0
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0;
    }
}
