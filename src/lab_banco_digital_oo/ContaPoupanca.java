package lab_banco_digital_oo;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}
	
	public String getNomeCliente() {
		return cliente.getNome();
	}
	
	public String imprimirExtrato() {
		System.out.println("=== Saldo Conta Poupança ===");
		return super.imprimirExtrato();
	}
	
	
}
