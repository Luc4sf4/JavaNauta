package excecao.naoverificada;

import java.util.Scanner;

public class VerificaCPF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu cpf ");
        String verificaCPF = verificaCPF(scanner.nextLine());
        System.out.println(verificaCPF);
    }
    public static String verificaCPF(String cpf){
        try {
            if(cpf.equals("0001234500045")){
                throw new RuntimeException("CPF ja cadastrado " + cpf );
            } else {
                return "Cpf valido, usuario cadastrado";
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("CPF ja cadastrado " + cpf);
        }
    }
}
