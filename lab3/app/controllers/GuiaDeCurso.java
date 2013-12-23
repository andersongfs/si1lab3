package controllers;
import java.util.ArrayList;
import java.util.List;

import models.*;
import play.mvc.Controller;


public class GuiaDeCurso extends Controller {
	
	//CREATOR: Porque GuiaDeCurso é responsável por armazenar os períodos
	           //Cria tb a grade, que eh utilizada para apresentar ao usuario as cadeiras que o curso oferece
	private List<Periodo> periodos;
	private Grade grade; 
	private final int NUM_MAX_DE_CREDITOS = 28;
	
	
	
// o construtor do Guia de curso ja inicializa com o primeiro periodo preenchido
	public GuiaDeCurso() {
		grade = new Grade();
		periodos = new ArrayList<Periodo>();
		criaPrimeiroPeriodo();criaDemaisPeriodos();	
		
	}


	public Grade getGrade() {
		return grade;
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
			    
	    primeiroPeriodo.addDisciplina(grade.getDisciplina("Cálculo I"));
	    primeiroPeriodo.addDisciplina(grade.getDisciplina("Vetorial"));
	    primeiroPeriodo.addDisciplina(grade.getDisciplina("Programação I"));
	    primeiroPeriodo.addDisciplina(grade.getDisciplina("Laboratório de Programação I"));
	    primeiroPeriodo.addDisciplina(grade.getDisciplina("Introdução à Computação"));
	    primeiroPeriodo.addDisciplina(grade.getDisciplina("Leitura e producao de textos"));
	    
	    periodos.add(primeiroPeriodo);
		
	}


	private void criaDemaisPeriodos() {
		Periodo segundoPeriodo = new Periodo();
		Periodo terceiroPeriodo = new Periodo();
		Periodo quartoPeriodo = new Periodo();
		Periodo quintoPeriodo = new Periodo();
		Periodo sextoPeriodo = new Periodo();
		Periodo setimoPeriodo = new Periodo();
		Periodo oitavoPeriodo = new Periodo();
		
		this.addPeriodo(segundoPeriodo);
		this.addPeriodo(terceiroPeriodo);
		this.addPeriodo(quartoPeriodo);
		this.addPeriodo(quintoPeriodo);
		this.addPeriodo(sextoPeriodo);
		this.addPeriodo(setimoPeriodo);
		this.addPeriodo(oitavoPeriodo);
		
	}

	public void addDisciplina(String nomeDisc, int periodo) {
		Disciplina disc = grade.getDisciplina(nomeDisc);
		addDisciplina(disc, periodo);
		
	}

	public void addDisciplina(Disciplina disc, int periodo) {
		if(checaPreRequisitos(disc, periodo)){
			if(this.getPeriodo(periodo).getTotalCreditos() + disc.getCreditos() <= NUM_MAX_DE_CREDITOS){
				this.getPeriodo(periodo).addDisciplina(disc);
			}
		}
		
	}
	
	public boolean checaPreRequisitos(Disciplina disc, int periodo){
		boolean controle;
		for (int i = 0; i < disc.getPreRequisitos().size(); i++) {
			controle = false;
			for(int j = 1; j < periodo; j++){
				if(this.getPeriodo(j).contemDisciplina(disc.getPreRequisitos().get(i))){
					controle = true;
				}
			}
			if(controle == false){
				return false;
			}
		}	
		return true;	

	}



	
	

}
