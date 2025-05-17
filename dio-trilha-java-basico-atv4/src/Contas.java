public abstract class Contas {
    private String numero;
    protected double saldo;

    public Contas(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    public abstract boolean sacar(double valor);

    public boolean transferir(Contas destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de " + valor + " para conta " + destino.getNumero() + " realizada.");
            return true;
        } else {
            System.out.println("Falha na transferência. Saldo insuficiente.");
            return false;
        }
    }
}