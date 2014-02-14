package models;

import java.util.ArrayList;
import java.util.List;


public class Periodo {
	private List<Disciplina> disciplinas;
	//CREATOR: a classe disciplina cria uma lista de objetos disciplina
	//Periodo precisa de disciplina para ser criado.
	//Perido agrega disciplina
	
	
	
	/**
	 * Construtor da classe Periodo
	 */
	public Periodo(){
		disciplinas = new ArrayList<Disciplina>();
	}
	
	/**
	 * Método de acesso as disciplinas do período
	 * @return Uma List contendo as disciplinas alocadas no período
	 */
	public List<Disciplina> getDisciplinas() {		
		return disciplinas;
	}
	
	/**
	 * Método para adicionar uma disciplina ao período
	 * @param disciplina a ser adicionada
	 */
	public void addDisciplina(Disciplina disc){
		disciplinas.add(disc);
	}
	
	/**
	 * Método para consultar o total de créditos do período
	 * @return Um total de créditos do tipo int
	 */
	public int getTotalCreditos() {
		
		int totalCreditos = 0;
		for (Disciplina d : disciplinas) {
			totalCreditos += d.getCreditos();
		}
		
		return totalCreditos;
	}
	
	/**
	 * Método para informar se o período contém certa disciplina
	 * @param Disciplina a qual quer consultar se está contida
	 * @return true caso contém a disciplina
	 * 			false caso contrário
	 */
	public boolean contemDisciplina(Disciplina disc){
		for (int i = 0; i < disciplinas.size(); i++) {
			if(disciplinas.get(i).equals(disc)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Método para remover disciplinas de um período do curso
	 * @param disciplina a ser removida
	 * @return true caso seja removida
	 * 			false caso não seja removida
	 */
	public boolean removeDisciplina(Disciplina disc){
		if(this.contemDisciplina(disc)){
			disciplinas.remove(disc);
			return true;
		}
		return false;
	}

}
