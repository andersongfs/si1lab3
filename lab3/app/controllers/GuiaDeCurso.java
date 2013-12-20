package controllers;
import java.util.List;

import play.mvc.Controller;

import dominio.*;

public class GuiaDeCurso extends Controller {
	
	//CREATOR: Porque GuiaDeCurso é responsável por armazenar os períodos
	private List<Periodo> periodos;
	
	
	
	

	public Periodo getPeriodo(int periodo) {
		return periodos.get(periodo - 1);
		
	}
	
	

}
