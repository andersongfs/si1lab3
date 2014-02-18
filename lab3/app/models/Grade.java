package models;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe que representa a Grade do curso
 */
public class Grade {
	
	//A grade eh o Creator
	
	private List<Disciplina> grade = new ArrayList<Disciplina>();
	
	/**
	 * Construtor da classe Grade
	 */
	public Grade() {
		
		// Criando as disciplinas, 
		// adicionando ao primeiro periodo as do primeiro periodo
		// adicinando pre-requisitos
		Disciplina calcI = new Disciplina("Cálculo I", new ArrayList<Disciplina>(), 4);
		Disciplina vetorial = new Disciplina("Vetorial", new ArrayList<Disciplina>(), 4);
		Disciplina lpt = new Disciplina("Leitura e producao de textos", new ArrayList<Disciplina>(), 4);
		Disciplina p1 = new Disciplina("Programação I", new ArrayList<Disciplina>(), 4);
		Disciplina ic = new Disciplina("Introdução à Computação", new ArrayList<Disciplina>(), 4);
		Disciplina lp1 = new Disciplina("Laboratório de Programação I", new ArrayList<Disciplina>(), 4);
		Disciplina calcII = new Disciplina("Cálculo II", new ArrayList<Disciplina>(), 4);
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
		Disciplina atal = new Disciplina("Análise e Técnicas de Algoritmos", new ArrayList<Disciplina>(), 4);
		atal.addPreRequisito(eda);
		atal.addPreRequisito(leda);
		atal.addPreRequisito(calcII);
		atal.addPreRequisito(logica);
		Disciplina compiladores = new Disciplina("Compiladores", new ArrayList<Disciplina>(), 4);
		compiladores.addPreRequisito(oac);
		compiladores.addPreRequisito(loac);
		compiladores.addPreRequisito(plp);
		Disciplina redes = new Disciplina("Redes de Computadores", new ArrayList<Disciplina>(), 4);
		redes.addPreRequisito(oac);
		redes.addPreRequisito(loac);
		Disciplina bd1 = new Disciplina("Bancos de Dados I", new ArrayList<Disciplina>(), 4);
		bd1.addPreRequisito(siI);
		Disciplina si2 = new Disciplina("Sistemas de Informação II", new ArrayList<Disciplina>(), 4);
		si2.addPreRequisito(siI);
		Disciplina les = new Disciplina("Laboratório de Engenharia de Software", new ArrayList<Disciplina>(), 2);
		les.addPreRequisito(es);
		Disciplina direito = new Disciplina("Direito e Cidadania", new ArrayList<Disciplina>(), 4);
		Disciplina so = new Disciplina("Sistemas Operacionais", new ArrayList<Disciplina>(), 4);
		so.addPreRequisito(oac);
		so.addPreRequisito(loac);
		Disciplina irc = new Disciplina("Interconexão de Redes de Computadores", new ArrayList<Disciplina>(), 2);
		irc.addPreRequisito(redes);
		Disciplina bd2 = new Disciplina("Banco de Dados II", new ArrayList<Disciplina>(), 4);
		bd2.addPreRequisito(bd1);
		bd2.addPreRequisito(si2);
		Disciplina ia1 = new Disciplina("Inteligência Artificial I", new ArrayList<Disciplina>(), 4);
		ia1.addPreRequisito(atal);
		ia1.addPreRequisito(plp);
		ia1.addPreRequisito(metodos);
		Disciplina lirc = new Disciplina("Laboratório de Interconexão de Redes de Computadores", new ArrayList<Disciplina>(), 2);
		lirc.addPreRequisito(redes);
		Disciplina optativa1 = new Disciplina("Optativa 1", new ArrayList<Disciplina>(), 4);
		Disciplina optativa2 = new Disciplina("Optativa 2", new ArrayList<Disciplina>(), 4);
		Disciplina msn = new Disciplina("Métodos e Software Numéricos", new ArrayList<Disciplina>(), 4);
		msn.addPreRequisito(atal);
		msn.addPreRequisito(linear);
		Disciplina adsd = new Disciplina("Avaliação de Desempenho de Sistemas Discretos", new ArrayList<Disciplina>(), 4);
		adsd.addPreRequisito(prob);
		Disciplina proj1 = new Disciplina("Projeto em Computação I", new ArrayList<Disciplina>(), 4);
		proj1.addPreRequisito(les);
		proj1.addPreRequisito(metodologia);
		Disciplina optativa3 = new Disciplina("Optativa 3", new ArrayList<Disciplina>(), 4);
		Disciplina optativa4 = new Disciplina("Optativa 4", new ArrayList<Disciplina>(), 4);
		Disciplina optativa5 = new Disciplina("Optativa 5", new ArrayList<Disciplina>(), 4);
		Disciplina optativa6 = new Disciplina("Optativa 6", new ArrayList<Disciplina>(), 4);
		Disciplina proj2 = new Disciplina("Projeto em Computação II", new ArrayList<Disciplina>(), 6);
		proj2.addPreRequisito(proj1);
		Disciplina optativa7 = new Disciplina("Optativa 7", new ArrayList<Disciplina>(), 4);
		Disciplina optativa8 = new Disciplina("Optativa 8", new ArrayList<Disciplina>(), 4);
		Disciplina optativa9 = new Disciplina("Optativa 9", new ArrayList<Disciplina>(), 4);
		Disciplina optativa10 = new Disciplina("Optativa 10", new ArrayList<Disciplina>(), 4);
		Disciplina optativa11 = new Disciplina("Optativa 11", new ArrayList<Disciplina>(), 2);
		//
		
		
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
		grade.add(atal);
		grade.add(compiladores);
		grade.add(redes);
		grade.add(bd1);
		grade.add(si2);
		grade.add(les);
		grade.add(direito);
		grade.add(so);
		grade.add(irc);
		grade.add(bd2);
		grade.add(ia1);
		grade.add(lirc);
		grade.add(optativa1);
		grade.add(optativa2);
		grade.add(msn);
		grade.add(adsd);
		grade.add(proj1);
		grade.add(optativa3);
		grade.add(optativa4);
		grade.add(optativa5);
		grade.add(optativa6);
		grade.add(proj2);
		grade.add(optativa7);
		grade.add(optativa8);
		grade.add(optativa9);
		grade.add(optativa10);
		grade.add(optativa11);	
	}

	/**
	 * Método de acesso as disciplinas da Grade
	 * @return Uma List contendo as disciplinas alocadas na Grade
	 */
	public List<Disciplina> listaGrade() {
		return grade;
	}
	
	/**
	 * Método que acessa uma disciplina na Grade, pelo nome da disciplina.
	 * @param nome da Disciplina se ela existir.
	 * @return a disciplina. Retorna null se não encontrar a disciplina
	 */
	public Disciplina getDisciplina(String nome){
		for(int i = 0; i < grade.size(); i++){
			if(grade.get(i).getNome().equals(nome)){
				return grade.get(i);
			}
		}
		return null;
	}
}
