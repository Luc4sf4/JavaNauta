import java.util.Scanner;

public class EntradaSaidaDeDadados {
    public static void main(String[] args) {

//        System.out.println("Ola eu faco a impressao e pulo a linha");
//        System.out.print("Ola eu faco a impressao na mesma linha");
//        System.out.printf("Ola, eu faco a impressao formatada ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola, digite o seu nome: ");
        String nome = scanner.nextLine(); //trabalhar com Strings
        System.out.println("Nome: " + nome);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt(); // trabalhar com int
        System.out.println("Idade: " + idade);

        System.out.println("Voce esta empregado ? (true ou nao false ) ");
        boolean empregado = scanner.nextBoolean();
        System.out.println("Ola, sou " + nome + " tenho: " + idade + " estou empregado " + empregado );
    }
}
