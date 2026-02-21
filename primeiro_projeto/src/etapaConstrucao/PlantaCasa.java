package etapaConstrucao;

public class PlantaCasa implements construcao{
    //Atributos
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

    //public -> acessivel em qualquer lugar
    //private -> somente a classe pode acessar
    //protected -> acessivel dentro do mesmo pacote somente

    @Override
    public void construir(){
        System.out.println("A casa foi construida! ");
        System.out.println("Metragem " + metragem);
        System.out.println("Numero de quartos " + numeroQuartos);
        System.out.println("Numero de banheiros " + numeroBanheiros);
        System.out.println("material " + material);

    }

    //Anotacao -> diz que esse metodo vem de uma intercace
    @Override
    public void pintar(String cor) {
        System.out.println("Pintando a casa com a cor " + cor);
    }

    @Override
    public int calcularCustoConstrucao(int custoPorMetro) {
        return metragem + custoPorMetro;
    }

    //void -> nao exige retorno
    public void pintar(){
        System.out.println("A casa foi pintada");
        System.out.println("cor " + cor);
    }

    // se setado um tipo(primitivo ou nao), vai exigir retorno
    public int somarMetragem(){
        return metragem * numeroBanheiros + numeroQuartos;
    }

    public void mudarCorParede(String novaCor){
        cor = novaCor;
        pintar();
    }

    public void alterarCaracteristicas(int metros, int quartos, int banheiro, String mat){
        metragem = metros;
        quartos = numeroQuartos;
        numeroBanheiros = banheiro;
        mat = material;
        construir();

    }

    public static void main(String[] args) {
        //Criando um Objeto
        PlantaCasa casa = new PlantaCasa();

        //Inicializando os atributos
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "cinza";

        casa.construir();
        casa.pintar();

        int resultado = casa.somarMetragem();
        System.out.println(resultado);


        casa.mudarCorParede("Branco");
        casa.alterarCaracteristicas(100, 2, 2, "Madeira");

        PlantaCasa casaVizinho = new PlantaCasa();
        casaVizinho.metragem = 200;
        casaVizinho.material = "Alvenaria";
        casaVizinho.numeroBanheiros = 1;
        casaVizinho.numeroQuartos = 1;
        casaVizinho.cor = "Amarelo";

        casaVizinho.construir();
        casaVizinho.pintar();
    }
}
