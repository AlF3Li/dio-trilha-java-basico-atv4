public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Contas contaCorrente = new ContaCorrente("123");
        Contas contaPoupanca = new ContaPoupanca("456");

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(500);
        contaPoupanca.depositar(300);

        contaCorrente.sacar(50);
        contaPoupanca.sacar(100);

        banco.transferirEntreContas("123", "456", 100);
    }
}
