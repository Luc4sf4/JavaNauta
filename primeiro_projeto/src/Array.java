public class Array {
    public static void main(String[] args) {

        //Declarar Array
        int[] numeros = {10, 20, 30, 50, 1};
        String[] frutas;

        //inicializar
        frutas = new String[] {"Maca", "Banana", "Abacaxi"};

        double[] salarios = new double[5];
        salarios[3] = 500;
        salarios[1] = 200;
        salarios[0] = 150;
        salarios[2] = 25;
        salarios[4] = 100;

        //iteracao sob array
        for(int posicao = 0; posicao <salarios.length; posicao++){
            System.out.println(salarios[posicao]);
        }

        for(double salario : salarios){
            System.out.println(salario);
        }

        salarios[2] = 150;
        System.out.println(salarios[2]);


    }
}
