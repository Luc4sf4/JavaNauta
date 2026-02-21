package contaBancaria;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Lucas", 500);
        System.out.println("O titular da conta: " + minhaConta.getTitular() + " saldo final " + minhaConta.getSaldo());

        minhaConta.setTitular("Lucas Fernandes");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();;
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titular da conta: " + titularConta + " saldo final " + saldoFinal);

        ContaBancaria contaMinhaMae = new ContaBancaria("Lucila");
        System.out.println("O titular da conta: " + contaMinhaMae.getTitular() + " saldo final " + contaMinhaMae.getSaldo());
    }
}
