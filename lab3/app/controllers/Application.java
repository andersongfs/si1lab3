package controllers;

import java.util.List;

import dominio.Periodo;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	private static GuiaDeCurso meuCurso = new GuiaDeCurso();
	
	
	
    public static Result index() {
        return ok(index.render("Your new application is ready."));
        //return ok(index.render(meuCurso.getPeriodos()));
    }
   
}
