package dominio;

import java.util.List;

public class Disciplina {
	private String nome;
	private List<Disciplina> preRequisitos;
	private int creditos;
	
	public Disciplina(String nome, List<Disciplina> preRequisitos, int creditos){
		this.nome = nome;
		this.preRequisitos = preRequisitos;
		this.creditos = creditos;
	}

}
