import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Contas> contas = new HashMap<>();

    public void adicionarConta(Contas conta) {
        contas.put(conta.getNumero(), conta);
    }

    public Contas buscarConta(String numero) {
        return contas.get(numero);
    }

    public boolean transferirEntreContas(String numeroOrigem, String numeroDestino, double valor) {
        Contas origem = buscarConta(numeroOrigem);
        Contas destino = buscarConta(numeroDestino);

        if (origem == null || destino == null) {
            System.out.println("Conta origem ou destino não encontrada.");
            return false;
        }

        return origem.transferir(destino, valor);
    }
}
