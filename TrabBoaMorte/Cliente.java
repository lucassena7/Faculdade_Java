package br.com.boamorte;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private static int proximaMatricula = 1; //Inicializando a matrícula do Cliente em 1.
	
	private int matricula;
	private String nome;
	private int idade;
	private List<Dependente> dependentes;
	
	public Cliente(String nome, int idade) {
		this.nome = nome != null && !nome.isEmpty() ? nome : "(sem nome)";
		this.idade = idade > 0 ? idade : 66;
		this.matricula = proximaMatricula++;
		this.dependentes = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public boolean adicionarDependente(Dependente dependente) {
        if (dependentes.contains(dependente)) {
            return false;
        } else {
            dependentes.add(dependente);
            return true;
        }
    }
	
	public int getQtdeDependentes() {
		return dependentes.size();
	}
	
	public double getValorMensalidade() {
		double valorMensalidade = 0;
		if (idade <= 30) {
			valorMensalidade = 500;
		} else if (idade <= 40) {
			valorMensalidade = 600;
		} else if (idade <= 65) {
			valorMensalidade = 700;
		} else {
			valorMensalidade = 1500;
		}
		
		for (Dependente dependente : dependentes) {
			valorMensalidade += dependente.getValorMensalidade();
		}
		
		return valorMensalidade;
	}

}
