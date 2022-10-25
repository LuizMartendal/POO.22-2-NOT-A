

import java.util.ArrayList;
public class Vereador {
	// atributos
	private String nome;
	private Partido partido;
	private ArrayList<ProjetoDeLei> projetos = new ArrayList<>();

	// construtor
	public Vereador(String nome) {
		super();
		this.setNome(nome);
	}

	 public void addProjetos(ProjetoDeLei projetos) {
	        this.projetos.add(projetos);
	        
	    }
	 
	 public ArrayList<ProjetoDeLei> getProjetos()
	 {
		 return this.projetos;
	 }
	
	// métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public int getQtdProjApres() {
		return this.projetos.size();
	}

	
	public int getQtdProjAprov() {
		int contador=0;
		for (ProjetoDeLei p:this.projetos) {
			if (p.estaAprovado()) {
				contador++;
			}
		}
		return contador;
	}

	
	public double getDesempenho() {
		if (this.getQtdProjApres() == 0) {
			return 0;
		}
		return (this.getQtdProjAprov() / (double)this.getQtdProjApres()) * this.getIndiceTrabalho();
	}

	public double getIndiceTrabalho() {
		if (this.getQtdProjApres() > 17) {
			return 1.22;
		}
		if (this.getQtdProjApres() > 10) {
			return 1.08;
		}
		if (this.getQtdProjApres() > 5) {
			return 1.0;
		}
		if (this.getQtdProjApres() > 0) {
			return 0.8;
		}
		return 0;
	}

}