public class While {
    public static void main(String[] args) {

        int contador = 0;

//        while(contador <= 5) {
//            System.out.println("Contador " + contador);
//            contador++;
//        }

        do{
            System.out.println("Contador " + contador);
            contador++;
        }while(contador  > 5);

        for(int cont = 0; cont < 5; cont++){
            System.out.println("Contando o for: " + cont);
        }
    }
}
