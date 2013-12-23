package models;

import java.util.List;

public class Disciplina {
	private String nome;
	private List<Disciplina> preRequisitos;
	private int creditos;
	
	//Expert: tem a informação necessaria para criar uma nova disciplina
	
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

	public List<Disciplina> getPreRequisitos() {
		return preRequisitos;
	}

	public void setPreRequisitos(List<Disciplina> preRequisitos) {
		this.preRequisitos = preRequisitos;
	}
	
	

}
