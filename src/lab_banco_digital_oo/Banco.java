package lab_banco_digital_oo;

import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	public String getNome() {
		return nome;
	}


}
