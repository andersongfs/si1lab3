package testes;

import static org.junit.Assert.*;



import models.*;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controllers.GuiaDeCurso;


public class TesteApp {
        private GuiaDeCurso guia;       
        
        @Before        
        public void inicializa(){
        	guia = new GuiaDeCurso(); 
        }

        @SuppressWarnings("deprecation")
		@Test
        public void deveTerPrimeiroPeriodo(){
        	// O sistema já é inicializado com o primeiro período
        	assertNotNull(guia.getPeriodo(1));        	    
    	    Assert.assertEquals(24, guia.getPeriodo(1).getTotalCreditos());               
            
        }
        
        @Test
        public void deveAddDisciplinaNoSegundoPeriodo(){
        	Disciplina calc2 = guia.getGrade().getDisciplina("calculo II");
        	guia.addDisciplina(calc2, 2);
        	assertNotNull(guia.getPeriodo(2));
        	assertTrue(guia.getPeriodo(2).contemDisciplina(calc2));
        }

}