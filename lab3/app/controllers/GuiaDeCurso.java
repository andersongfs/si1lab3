package controllers;
import java.util.ArrayList;
import java.util.List;

import models.*;
import play.mvc.Controller;

/**
 * Essa classe representa o plano de curso criado pelo usuário
 */
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

	/**
	 * Retorna a grade de disciplinas, ou seja, todas as disciplinas disponiveis.
	 * @return a grade
	 */
	public Grade getGrade() {
		return grade;
	}


	/**
	 * Método que acessa um período específico
	 * @param periodo O número do período
	 * @return O periodo
	 */
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
		Periodo nonoPeriodo = new Periodo();
		Periodo decimoPeriodo = new Periodo();
		
		this.addPeriodo(segundoPeriodo);
		this.addPeriodo(terceiroPeriodo);
		this.addPeriodo(quartoPeriodo);
		this.addPeriodo(quintoPeriodo);
		this.addPeriodo(sextoPeriodo);
		this.addPeriodo(setimoPeriodo);
		this.addPeriodo(oitavoPeriodo);
		this.addPeriodo(nonoPeriodo);
		this.addPeriodo(decimoPeriodo);
		
	}

	
	
	/**
	 * Adiciona uma disciplina a partir do nome
	 * @param nomeDisc Nome da disciplina
	 * @param periodo O periodo onde a disciplina será adicionada
	 */
	public void addDisciplina(String nomeDisc, int periodo) {
		Disciplina disc = grade.getDisciplina(nomeDisc);
		addDisciplina(disc, periodo);
		
	}

	/**
	 * Adiciona uma disciplina
	 * @param nomeDisc A disciplina
	 * @param periodo O periodo onde a disciplina será adicionada
	 */
	public void addDisciplina(Disciplina disc, int periodo) {
		if(checaPreRequisitos(disc, periodo)){
			if(this.getPeriodo(periodo).getTotalCreditos() + disc.getCreditos() <= NUM_MAX_DE_CREDITOS){
				this.getPeriodo(periodo).addDisciplina(disc);
			}
		}
	}
	
	/**
	 * Checa se os pre-requisitos da disciplina disc estão presentes nos periodos anteriores ao passado
	 * @param disc A disciplina
	 * @param periodo O periodo em que a disciplina está presente
	 * @return true se ok
	 */
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
	public void removeDisciplina(String nome, int periodo){
		Disciplina disc = grade.getDisciplina(nome);
		removeDependentes(disc, periodo);
	}
	/**
	 * Remove uma disciplina disc de um periodo
	 * @param disc A disciplina a ser removida
	 * @param periodo O periodo em que a disciplina estar
	 */
	public void removeDisciplina(Disciplina disc, int periodo){
		Periodo periodoDaDisciplina = this.getPeriodo(periodo);
		periodoDaDisciplina.removeDisciplina(disc);
		
		removeDependentes(disc, periodo);
		
		
	}
	
	/**
	 * Remove as disciplinas dependentes da disciplina disc
	 * @param disc A disciplina
	 * @param periodo O periodo em que a disciplina se encontra
	 */
	public void removeDependentes(Disciplina disc, int periodo){
		
		for(int per = periodo; per < this.periodos.size(); per++){
			for(int j = 0; j < this.getPeriodo(per).getDisciplinas().size(); j++){
				if(this.getPeriodo(per).getDisciplinas().get(j).getPreRequisitos().contains(disc)){
					this.removeDisciplina(this.getPeriodo(per).getDisciplinas().get(j), per);
				}
			}
		}
	}
}