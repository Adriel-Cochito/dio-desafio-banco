
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente, CartaoCredito cartaoCredito) {
		super(cliente, cartaoCredito);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirConta();
	}

	
}
