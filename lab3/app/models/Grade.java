package models;

import java.util.ArrayList;
import java.util.List;

public class Grade {

	
	//a grade eh o Expert em saber qual eh a grade do curso e prover para outras classes
	
	private List<Disciplina> grade = new ArrayList<Disciplina>();
	
	public Grade() {
		
		
		Disciplina calcI = new Disciplina("calculo 1", new ArrayList<Disciplina>(), 4);
		Disciplina vetorial = new Disciplina("vetorial", new ArrayList<Disciplina>(), 4);
		Disciplina lpt = new Disciplina("Leitura e producao de textos", new ArrayList<Disciplina>(), 4);
		Disciplina p1 = new Disciplina("Programação I", new ArrayList<Disciplina>(), 4);
		Disciplina ic = new Disciplina("Introdução à Computação", new ArrayList<Disciplina>(), 4);
		Disciplina lp1 = new Disciplina("Laboratório de Programação I", new ArrayList<Disciplina>(), 4);
		Disciplina calcII = new Disciplina("calculo II", new ArrayList<Disciplina>(), 4);
		calcII.addPreRequisito(calcI);
		Disciplina discreta = new Disciplina("Matemática Discreta", new ArrayList<Disciplina>(), 4);
		Disciplina metodologia = new Disciplina("Metodologia Científica", new ArrayList<Disciplina>(), 4);
		Disciplina p2 = new Disciplina("Programação II", new ArrayList<Disciplina>(), 4);
		p2.addPreRequisito(lp1);
		p2.addPreRequisito(p1);
		p2.addPreRequisito(ic);
		Disciplina lp2 = new Disciplina("Laboratório de Programação II", new ArrayList<Disciplina>(), 4);
		lp2.addPreRequisito(lp1);
		lp2.addPreRequisito(p1);
		lp2.addPreRequisito(ic);
		Disciplina grafos = new Disciplina("Teoria dos Grafos", new ArrayList<Disciplina>(), 2);
		grafos.addPreRequisito(lp1);
		grafos.addPreRequisito(p1);
		Disciplina ffc = new Disciplina("Fundamentos de Física Clássica", new ArrayList<Disciplina>(), 4);
		ffc.addPreRequisito(vetorial);
		ffc.addPreRequisito(calcI);
		Disciplina prob = new Disciplina("Probabilidade e Estatística", new ArrayList<Disciplina>(), 4);
		prob.addPreRequisito(calcII);
		Disciplina tc = new Disciplina("Teoria da Computação", new ArrayList<Disciplina>(), 4);
		tc.addPreRequisito(grafos);
		tc.addPreRequisito(ic);
		tc.addPreRequisito(discreta);
		Disciplina eda = new Disciplina("Estruturas de Dados e Algoritmoso", new ArrayList<Disciplina>(), 4);
		eda.addPreRequisito(grafos);
		eda.addPreRequisito(p2);
		eda.addPreRequisito(lp2);
		Disciplina ffm = new Disciplina("Fundamentos de Física Moderna", new ArrayList<Disciplina>(), 4);
		ffm.addPreRequisito(calcII);
		ffm.addPreRequisito(ffc);
		Disciplina gi = new Disciplina("Gerência da Informação", new ArrayList<Disciplina>(), 4);
		Disciplina leda = new Disciplina("Laboratório de Estruturas de Dados e Algoritmos", new ArrayList<Disciplina>(), 4);
		leda.addPreRequisito(grafos);
		leda.addPreRequisito(lp2);
		leda.addPreRequisito(p2);
		Disciplina linear = new Disciplina("Algebra linear", new ArrayList<Disciplina>(), 4);
		linear.addPreRequisito(vetorial);
		Disciplina metodos = new Disciplina("Métodos Estatísticos", new ArrayList<Disciplina>(), 4);
		metodos.addPreRequisito(linear);
		metodos.addPreRequisito(prob);
		Disciplina plp = new Disciplina("Paradigmas de Linguagens de Programação", new ArrayList<Disciplina>(), 2);
		plp.addPreRequisito(eda);
		plp.addPreRequisito(leda);
		plp.addPreRequisito(tc);
		Disciplina logica = new Disciplina("Lógica Matemática", new ArrayList<Disciplina>(), 4);
		logica.addPreRequisito(tc);
		Disciplina oac = new Disciplina("Organização e Arquitetura de Computadores I", new ArrayList<Disciplina>(), 4);
		oac.addPreRequisito(ffm);
		oac.addPreRequisito(eda);
		oac.addPreRequisito(leda);
		Disciplina es = new Disciplina("Engenharia de Software I", new ArrayList<Disciplina>(), 4);
		es.addPreRequisito(lp2);
		es.addPreRequisito(p2);
		es.addPreRequisito(prob);
		Disciplina siI = new Disciplina("Sistemas de Informação I", new ArrayList<Disciplina>(), 4);
		siI.addPreRequisito(gi);
		Disciplina loac = new Disciplina("Laboratório de Organização e Arquitetura de Computadores", new ArrayList<Disciplina>(), 4);
		loac.addPreRequisito(ffm);
		loac.addPreRequisito(eda);
		loac.addPreRequisito(leda);
		Disciplina infosoc = new Disciplina("Informática e Sociedade", new ArrayList<Disciplina>(), 2);
		
		
		grade.add(calcI);
		grade.add(vetorial);
		grade.add(lpt);
		grade.add(p1);
		grade.add(ic);
		grade.add(lp1);
		grade.add(calcII);
		grade.add(discreta);
		grade.add(metodologia);
		grade.add(p2);
		grade.add(grafos);
		grade.add(ffc);
		grade.add(lp2);
		grade.add(prob);
		grade.add(tc);
		grade.add(eda);
		grade.add(ffm);
		grade.add(gi);
		grade.add(leda);
		grade.add(linear);
		grade.add(metodos);
		grade.add(plp);
		grade.add(logica);
		grade.add(oac);
		grade.add(es);
		grade.add(siI);
		grade.add(loac);
		grade.add(infosoc);
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
	
	public Disciplina getDisciplina(String nome){
		for(int i = 0; i < grade.size(); i++){
			if(grade.get(i).getNome().equals(nome)){
				return grade.get(i);
			}
		}
		return null;
	}
	
	
}
