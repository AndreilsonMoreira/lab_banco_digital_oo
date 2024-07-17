package lab_banco_digital_oo;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public String getNomeCliente() {
		return cliente.getNome();
	}
	
	@Override
	public String imprimirExtrato() {
		System.out.println("=== Saldo conta corrente ===");
		return super.imprimirExtrato();
	}

}
