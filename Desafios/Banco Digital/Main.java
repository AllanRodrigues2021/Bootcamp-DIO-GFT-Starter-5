
public class Main {

    public static void main(String[] args) {
        Cliente Allan = new Cliente();
        Allan.setNome("Allan");

        Conta contaCorente1 = new ContaCorrente(Allan);
        Conta contaPoupanca1 = new ContaPoupanca(Allan);

        contaCorente1.depositar(100);
        contaCorente1.transferir(contaPoupanca1, 100);

        contaCorente1.imprimirExtrato();
        contaPoupanca1.imprimirExtrato();

    }
}