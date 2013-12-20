package controllers;
import java.util.ArrayList;
import java.util.List;

import play.mvc.Controller;

import dominio.*;

public class GuiaDeCurso extends Controller {
	
	//CREATOR: Porque GuiaDeCurso é responsável por armazenar os períodos
	private List<Periodo> periodos;
	
	
	
	
	public GuiaDeCurso() {
		periodos = new ArrayList<Periodo>();
	}




	public Periodo getPeriodo(int periodo) {
		return periodos.get(periodo - 1);
		
	}




	public void addPeriodo(Periodo primeiroPeriodo) {
		periodos.add(primeiroPeriodo);
	}
	
	

}
