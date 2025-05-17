public class ContaPoupanca extends Contas {

    public ContaPoupanca(String numero) {
        super(numero);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
    }
}
