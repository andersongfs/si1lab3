package testes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import controllers.GuiaDeCurso;
import dominio.Disciplina;
import dominio.Periodo;

public class TesteApp2 {
        private GuiaDeCurso guia;
        private Periodo primeiroPeriodo;
        
        
        
        @Before        
        public void inicializa(){
                guia = new GuiaDeCurso(); 
                primeiroPeriodo = new Periodo();
        }

        @SuppressWarnings("deprecation")
		@Test
        public void deveTerPrimeiroPeriodo(){
        	
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
        	    
        	    Assert.assertEquals(24, primeiroPeriodo.getTotalCreditos());
        	    
        	    
        	    
        	    //acho que antes do guia retornar algum periodo, este periodo deve ter sido criado e adicionado ao guia
                //Periodo primeiroPeriodo = guia.getPeriodo(1);
        	    
        	    guia.addPeriodo(primeiroPeriodo);
                assertNotNull(primeiroPeriodo);
                assertNotNull(primeiroPeriodo.getDisciplinas());
                assertNotNull(guia.getPeriodo(1));
                
            
        }

}