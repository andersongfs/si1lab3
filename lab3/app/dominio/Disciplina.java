package dominio;

import java.util.List;

public class Disciplina {
	private String cadeira;
	private List<Disciplina> preRequisitos;
	private int creditos;
	
	//Expert: tem a informação necessaria para criar uma nova disciplina
	
	public Disciplina(String cadeira, List<Disciplina> preRequisitos, int creditos){
		this.cadeira = cadeira;
		this.preRequisitos = preRequisitos;
		this.creditos = creditos;
	}

	public int getCredito() {
		return this.creditos;
	}

}
