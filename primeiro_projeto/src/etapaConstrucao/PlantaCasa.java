package etapaConstrucao;

public class PlantaCasa {
    //Atributos
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

    //public -> acessivel em qualquer lugar
    //private -> somente a classe pode acessar
    //protected -> acessivel dentro do mesmo pacote somente

    protected void construir(){
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
