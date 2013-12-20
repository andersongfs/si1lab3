package controllers;
import java.util.List;

import dominio.*;

public class GuiaDeCurso {
	
	private List<Periodo> periodos;
	public GuiaDeCurso(){
		
	}

	public Periodo getPeriodo(int periodo) {
		return periodos.get(periodo - 1);
		
	}
	
	

}
