package models;

import java.util.List;

/**
 * Classe que representa uma Disciplina
 */
public class Disciplina {
	private String nome;
	private List<Disciplina> preRequisitos;
	private int creditos;
	
	//Expert: tem a informação necessaria para criar uma nova disciplina
	
	/**
	 * Construtor da classe Disciplina
	 * @param cadeira O nome da cadeira
	 * @param preRequisitos Uma lista de Disciplina que representam os pre-requisitos da cadeira.
	 * @param creditos A quantidade de créditos da cadeira.
	 */
	public Disciplina(String cadeira, List<Disciplina> preRequisitos, int creditos){
		this.nome = cadeira;
		this.setPreRequisitos(preRequisitos);
		this.creditos = creditos;
	}

	public int getCreditos() {
		return this.creditos;
	}

	public String getNome() {
		return nome;
	}

	/**
	 * Adiciona uma disciplina à lista de pre-requisitos da cadeira.
	 * @param requisito Uma disciplina
	 */
	public void addPreRequisito(Disciplina requisito){
		preRequisitos.add(requisito);
	}
	
	/**
	 * Método para comparar umam disciplina com outra
	 * @param Disciplina a qual será comparada
	 * @return true se forem iguais, false caso contrário
	 */
	public boolean equals(Disciplina disc){
		if(this.getNome().equals(disc.getNome())){
			return true;
		}
		return false;
	}

	/**
	 * Método que acessa a lista de disciplinas que representa os pre-requisitos da cadeira
	 * @return A lista de pre-requisitos
	 */
	public List<Disciplina> getPreRequisitos() {
		return preRequisitos;
	}

	public void setPreRequisitos(List<Disciplina> preRequisitos) {
		this.preRequisitos = preRequisitos;
	}
}
