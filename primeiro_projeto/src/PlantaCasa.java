public class PlantaCasa {
    //Atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    public void construir(){
        System.out.println("A casa foi construida! ");
        System.out.println("Metragem " + metragem);
        System.out.println("Numero de quartos " + numeroQuartos);
        System.out.println("Numero de banheiros " + numeroBanheiros);
        System.out.println("material " + material);

    }

    public void pintar(){
        System.out.println("A casa foi pintada");
        System.out.println("cor " + cor);
    }
}
