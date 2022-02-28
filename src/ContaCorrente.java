
public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente, CartaoCredito cartaoCredito) {
		super(cliente, cartaoCredito);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirConta();
	}

	
}
