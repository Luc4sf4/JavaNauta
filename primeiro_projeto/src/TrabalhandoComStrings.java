public class TrabalhandoComStrings {

    public static void main(String[] args) {
        String nome = "Lucas";
        String nomeDois = "Yasmim";
        String sobrenome = "Fernandes Dias";


        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(nomeDois);

        System.out.println("Ola " + nome.toUpperCase());
        System.out.println("Ola " + nome.toLowerCase() + " seu nome tem " + tamanhoString + " caracteres");
        System.out.println("Os nomes sao iguais ? " + saoIguais);
        System.out.println("Nome completo: " + nome.concat(sobrenome));

    }
}
