package lab_banco_digital_oo;

public class Main {

	public static void main(String[] args) {
		
		//Adicionar cliente
		Cliente cliente = new Cliente("Ana Maria");
		Cliente cliente1 = new Cliente("João Gomes");
		
		//Conta corrente
		Conta contaCorrente = new ContaCorrente(cliente);
		Conta contaCorrente1 = new ContaCorrente(cliente1);
		
		//Conta poupanca
		Conta contaPoupanca = new ContaPoupanca(cliente);
		
		System.out.println(contaCorrente.depositar(100));
		System.out.println(contaCorrente.sacar(10));		
		System.out.println(contaCorrente.transferir(50, contaCorrente1));
		System.out.println(contaCorrente.transferir(50, contaPoupanca));		
		System.out.println(contaCorrente.transferir(25, contaPoupanca));		
		System.out.println(contaCorrente.imprimirExtrato());
		System.out.println(contaPoupanca.imprimirExtrato());
		
				
		
		

	}

}
