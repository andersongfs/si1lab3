package models;
import java.util.ArrayList;
import java.util.List;


import play.mvc.Controller;

public class GuiaDeCurso extends Controller {
	
	//CREATOR: Porque GuiaDeCurso é responsável por armazenar os períodos
	private List<Periodo> periodos;
	
	
	
	
// o construtor do Guia de curso ja iniciliza com o primeiro periodo preenchido
	public GuiaDeCurso() {
		periodos = new ArrayList<Periodo>();
		criaPrimeiroPeriodo();
	}


	public Periodo getPeriodo(int periodo) {
		return periodos.get(periodo - 1);
		
	}




	public List<Periodo> getPeriodos() {
		return periodos;
	}

	public void addPeriodo(Periodo periodo) { 
		periodos.add(periodo); 
	}

	public void criaPrimeiroPeriodo(){
		Periodo primeiroPeriodo = new Periodo();
		
		Disciplina calc1 = new Disciplina("calculo 1", null, 4);
	    Disciplina vetorial = new Disciplina("vetorial", null, 4);
	    Disciplina lpt = new Disciplina("lpt", null, 4);
	    Disciplina prog1 = new Disciplina("prog1", null, 4);
	    Disciplina labProg1 = new Disciplina("labprog1", null, 4);
	    Disciplina IntroComp = new Disciplina("IntroComp", null, 4);
	    
	    primeiroPeriodo.addDisciplina(calc1);
	    primeiroPeriodo.addDisciplina(vetorial);
	    primeiroPeriodo.addDisciplina(lpt);
	    primeiroPeriodo.addDisciplina(prog1);
	    primeiroPeriodo.addDisciplina(labProg1);
	    primeiroPeriodo.addDisciplina(IntroComp);
	    
	    periodos.add(primeiroPeriodo);
		
	}

}
