package etapaConstrucao;

public interface construcao {

    //nao se usa modificadores de acesso
    void construir();
    void pintar (String cor);
    int calcularCustoConstrucao(int custoPorMetro);
}
