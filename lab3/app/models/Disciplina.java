package models;

import java.util.List;

public class Disciplina {
	private String nome;
	private List<Disciplina> preRequisitos;
	private int creditos;
	
	//Expert: tem a informação necessaria para criar uma nova disciplina
	
	public Disciplina(String cadeira, List<Disciplina> preRequisitos, int creditos){
		this.nome = cadeira;
		this.preRequisitos = preRequisitos;
		this.creditos = creditos;
	}

	public int getCreditos() {
		return this.creditos;
	}

	public String getNome() {
		return nome;
	}
	
	

}
