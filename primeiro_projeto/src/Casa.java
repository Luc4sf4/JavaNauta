import etapaConstrucao.PlantaCasa;

public class Casa {
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
    }
}
