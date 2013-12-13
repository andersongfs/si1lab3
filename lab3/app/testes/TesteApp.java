package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import controllers.GuiaDeCurso;

public class TesteApp {

	@Test
	public void deveExistirDisciplinasDoPeriodo1() {
		GuiaDeCurso guia = new GuiaDeCurso();
		guia.getPeriodo();
	}

}
