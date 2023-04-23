package br.com.boamorte;

public class Dependente {
	
	private String nome;
	private int idade;
	
	public Dependente(String nome, int idade) {
		this.nome = nome != null && !nome.isEmpty() ? nome : "(sem nome)";
		this.idade = idade > 0 ? idade : 66;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getValorMensalidade() {
		return idade < 18 ? 100 : 150;
	}

}
