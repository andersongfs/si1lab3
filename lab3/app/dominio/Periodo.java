package dominio;

import java.util.ArrayList;
import java.util.List;

public class Periodo {
	private List<Disciplina> disciplinas;
	
	public Periodo(){
		disciplinas = new ArrayList<Disciplina>();
	}

	public List<Disciplina> getDisciplinas() {
		
		return disciplinas;
	}
	
	public boolean addDisciplina(Disciplina disc){
		disciplinas.add(disc);
		return true;
	}

}
