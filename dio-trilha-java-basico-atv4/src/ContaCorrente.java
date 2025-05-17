public class ContaCorrente extends Contas {
    private static final double TAXA_SAQUE = 1.0;

    public ContaCorrente(String numero) {
        super(numero);
    }

    @Override
    public boolean sacar(double valor) {
        double total = valor + TAXA_SAQUE;
        if (total <= saldo) {
            saldo -= total;
            System.out.println("Saque de " + valor + " realizado com taxa de " + TAXA_SAQUE + ". Saldo atual: " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque e taxa.");
            return false;
        }
    }
}
