package models;

import java.util.ArrayList;
import java.util.List;


public class Periodo {
	private List<Disciplina> disciplinas;
	 private final int LIMITE_DE_CREDITOS = 28;
	//CREATOR: a classe disciplina cria uma lista de objetos disciplina
	//Periodo precisa de disciplina para ser criado.
	//Perido agrega disciplina
	
	
	
	
	public Periodo(){
		disciplinas = new ArrayList<Disciplina>();
	}

	public List<Disciplina> getDisciplinas() {
		
		return disciplinas;
	}
	
	public void addDisciplina(Disciplina disc){
		disciplinas.add(disc);
	}

	public int getTotalCreditos() {
		
		int totalCreditos = 0;
		for (Disciplina d : disciplinas) {
			totalCreditos += d.getCreditos();
		}
		
		return totalCreditos;
	}

}