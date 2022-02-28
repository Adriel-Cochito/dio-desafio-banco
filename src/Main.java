
public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.setNome("Joao");
		
		CartaoCredito cartao = new CartaoCredito();	
		cartao.setLimite(500);
		cartao.setLimiteDisponivel(500);
		
		Conta cc = new ContaCorrente(joao, cartao);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(joao, cartao);
		
		cc.transferir(10, poupanca);
		

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}