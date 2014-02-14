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
        	Disciplina calc2 = guia.getGrade().getDisciplina("Cálculo II");
        	guia.addDisciplina(calc2, 2);
        	assertNotNull(guia.getPeriodo(2));
        	assertTrue(guia.getPeriodo(2).contemDisciplina(calc2));
        }
        
        @Test
        public void testeDePreRequisitos(){
            
        	Assert.assertNotNull(guia.getGrade());       	
        }
        
        @Test
        public void deveRemoverDisciplina(){
        	Disciplina calc2 = guia.getGrade().getDisciplina("Cálculo II");
        	guia.addDisciplina(calc2, 2);
        	guia.removeDisciplina(calc2, 2);
        	assertFalse(guia.getPeriodo(2).contemDisciplina(calc2));
        	
        }
        
        @Test
        public void deveRemoverDependentes(){
        	Disciplina calc2 = guia.getGrade().getDisciplina("Cálculo II");
        	Disciplina prob = guia.getGrade().getDisciplina("Probabilidade e Estatística");
        	Disciplina direito = guia.getGrade().getDisciplina("Direito e Cidadania");
        	
        	guia.addDisciplina(calc2, 2);
        	guia.addDisciplina(prob, 3);
        	guia.addDisciplina(direito, 3);
        	
        	assertTrue(guia.getPeriodo(2).contemDisciplina(calc2));
        	assertTrue(guia.getPeriodo(3).contemDisciplina(prob));
        	assertTrue(guia.getPeriodo(3).contemDisciplina(direito));
        	
        	guia.removeDisciplina(calc2, 2);
        	
        	assertFalse(guia.getPeriodo(2).contemDisciplina(calc2));
        	assertFalse(guia.getPeriodo(3).contemDisciplina(prob));
        	assertTrue(guia.getPeriodo(3).contemDisciplina(direito));

        }
        
        

}