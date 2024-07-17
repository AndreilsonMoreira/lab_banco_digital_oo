package lab_banco_digital_oo;

public abstract class Conta implements IConta {

	// Informacoes constantes da conta
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	// Propriedades da conta
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}	

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public String sacar(double valor) {
		if(valor > saldo) {
			return ("Saldo insuficiente!");
		}else {
			saldo -= valor;
			return "Saque de R$"+valor+" realizado com sucesso!";
			
		}		
	}

	@Override
	public String depositar(double valor) {
		saldo += valor;
		return ("Deposito "+valor+" realizado com sucesso!");
	
	}

	@Override
	public String transferir(double valor, IConta contaDestino) {
		
		String sac = null;		
		String dep =null;
		sac = this.sacar(valor);
		
		
		if(sac.equalsIgnoreCase("Saldo insuficiente!")) {
			return("Transferencia de R$"+valor+" para "+contaDestino.getNomeCliente()+" não pode ser realizada!");
		}else {
			contaDestino.depositar(valor);
			return("Transferencia de R$"+valor+" para "+contaDestino.getNomeCliente()+" realizada com sucesso!");
		
		}
		
	}

	@Override
	public String imprimirExtrato() {
		return("Titular: "+ this.cliente.getNome() + "\nAgencia: " + this.agencia +"\nNumero: " + this.numero + "\nSaldo: " + this.saldo);

	}

}
