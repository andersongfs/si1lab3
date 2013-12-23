package models;

import java.util.ArrayList;
import java.util.List;

public class Grade {

	
	//a grade eh o Expert em saber qual eh a grade do curso e prover para outras classes
	
	private List<Disciplina> grade = new ArrayList<Disciplina>();
	
	public Grade() {
		
		
		grade.add(new Disciplina("calculo 1", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("vetorial", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Leitura e producao de textos", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Programação I", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Introdução à Computação", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Laboratório de Programação I", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("calculo II", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Matemática Discreta", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Metodologia Científica", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Programação II", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Teoria dos Grafos", new ArrayList<Disciplina>(), 2));
		grade.add(new Disciplina("Fundamentos de Física Clássica", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Laboratório de Programação II", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Probabilidade e Estatística", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Teoria da Computação", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Estruturas de Dados e Algoritmoso", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Fundamentos de Física Moderna", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Gerência da Informação", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Laboratório de Estruturas de Dados e Algoritmos", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Métodos Estatísticos", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Paradigmas de Linguagens de Programação", new ArrayList<Disciplina>(), 2));
		grade.add(new Disciplina("Lógica Matemática", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Organização e Arquitetura de Computadores I", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Engenharia de Software I", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Sistemas de Informação I", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Laboratório de Organização e Arquitetura de Computadores", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Informática e Sociedade", new ArrayList<Disciplina>(), 2));
		grade.add(new Disciplina("Análise e Técnicas de Algoritmos", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Compiladores", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Redes de Computadores", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Bancos de Dados I", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Sistemas de Informação II", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Laboratório de Engenharia de Software", new ArrayList<Disciplina>(), 2));
		grade.add(new Disciplina("Direito e Cidadania", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Sistemas Operacionais", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Interconexão de Redes de Computadores", new ArrayList<Disciplina>(), 2));
		grade.add(new Disciplina("Banco de Dados II", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Inteligência Artificial I", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Laboratório de Interconexão de Redes de Computadores", new ArrayList<Disciplina>(), 2));
		grade.add(new Disciplina("Inteligência Artificial I", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Optativa 1", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Optativa 2", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Métodos e Software Numéricos", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Avaliação de Desempenho de Sistemas Discretos", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Projeto em Computação I", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Optativa 3", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Optativa 4", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Optativa 5", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Optativa 6", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Projeto em Computação II", new ArrayList<Disciplina>(), 6));
		grade.add(new Disciplina("Optativa 7", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Optativa 8", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Optativa 9", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Optativa 10", new ArrayList<Disciplina>(), 4));
		grade.add(new Disciplina("Optativa 11", new ArrayList<Disciplina>(), 2));	
	}

	public List<Disciplina> listaGrade() {
		return grade;
	}
	
	
	
}
