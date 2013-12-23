package controllers;

import java.util.List;

import javax.servlet.FilterRegistration.Dynamic;

import models.Periodo;


import play.*;
import play.data.DynamicForm;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	public static GuiaDeCurso meuCurso = new GuiaDeCurso();
	
	
	
    public static Result index() {
    	
    	
        //return ok(index.render("Your new application is ready."));
        return ok(index.render(meuCurso.getPeriodos(),meuCurso.getGrade().listaGrade()));
    }
    
    
    public static Result addDisciplina(){
    	
    	
    	DynamicForm formDisciplina = new DynamicForm();
    	final DynamicForm form = formDisciplina.bindFromRequest();
        final String nome = form.get("nomeDisciplina");
        final int periodo = Integer.parseInt(form.get("periodo"));
        
        
        meuCurso.addDisciplina(nome, periodo);
    	
    	return index();
    	
    }
   
}
