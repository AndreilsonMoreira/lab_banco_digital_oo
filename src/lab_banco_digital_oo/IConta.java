package lab_banco_digital_oo;

public interface IConta {
	
	String sacar(double valor);
	String depositar(double valor);
	String transferir(double valor, IConta contaDestino);
	String imprimirExtrato();
	String getNomeCliente();

}
