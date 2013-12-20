package testes;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import controllers.GuiaDeCurso;
import dominio.Periodo;

public class TesteApp {
        private GuiaDeCurso guia;
        
        @Before        
        public void inicializa(){
                guia = new GuiaDeCurso(); 
        }

        @Test
        public void deveTerPrimeiroPeriodo(){
        	
        	    
        	
                Periodo primeiroPeriodo = guia.getPeriodo(1);
                assertNotNull(primeiroPeriodo);
                assertNotNull(primeiroPeriodo.getDisciplinas());
        }

}