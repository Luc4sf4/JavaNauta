public class OperadoresAritmeticos {

    public static void main(String[] args) {
        double pao = 9.5;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.00;
        int totalDiasMes = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDividio = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDiasMes;

        System.out.println("valor total = R$" + valorTotal);
        System.out.println("valor total = R$" + valorTotalComDesconto);
        System.out.println("valor total = R$" + valorTotalDividio);


    }
}
