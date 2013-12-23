package controllers;

import java.util.List;

import models.GuiaDeCurso;
import models.Periodo;


import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	public static GuiaDeCurso meuCurso = new GuiaDeCurso();
	
	
	
    public static Result index() {
    	
    	
        //return ok(index.render("Your new application is ready."));
        return ok(index.render(meuCurso.getPeriodos(),meuCurso.getGrade().listaGrade()));
    }
   
}
