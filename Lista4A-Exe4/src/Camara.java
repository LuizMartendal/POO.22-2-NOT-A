

import java.util.ArrayList;

public class Camara { // contribuição do Daniel K
	private ArrayList<Partido> partidos = new ArrayList<>();

	public Camara() {
	}

	public void addPartido(Partido partido) {
		if (partido != null) {
			this.partidos.add(partido);
		}
	}
	
	public Partido getPartido(int numero) {
		for (Partido p: partidos) {
			if (p.getNumero() == numero) {
				return p;
			}
		}
		return null;
	}

	public void addVereador(Vereador vereador, Partido partido) {
		if (vereador != null && partido != null) {
			partido.addVereador(vereador);
		}
	}

	public Vereador getVereadorMenorDesempenho() {
		double menorDesempenho = Double.MAX_VALUE;
		Vereador vereadorMenorDesempenho = null;

		for (Partido partido : this.partidos) {
			Vereador vereadorMenorDesempenhoPartido = partido.getVereadorMenorDesempenho();
			if (vereadorMenorDesempenhoPartido != null
					&& vereadorMenorDesempenhoPartido.getDesempenho() < menorDesempenho) {
				menorDesempenho = vereadorMenorDesempenhoPartido.getDesempenho();
				vereadorMenorDesempenho = vereadorMenorDesempenhoPartido;
			}
		}
		return vereadorMenorDesempenho;
	}

	public int getTotalProjApres() {
		int totalProjApres = 0;

		for (Partido partido : this.partidos) {
			totalProjApres += partido.getTotalProjetosApresentados();
		}
		return totalProjApres;
	}

	public int getTotalProjAprov() {
		int totalProjAprov = 0;

		for (Partido partido : this.partidos) {
			totalProjAprov += partido.getTotalProjetosAprovados();
		}
		return totalProjAprov;
	}

	// estratégia de pedir a lista de vereadores e trabalhar diretamente com
	// Vereador
	public Vereador getVereadorMaisProjAprov() {
		int projetosAprov = 0;
		Vereador vereadorMaisProjAprov = null;

		for (Partido partido : this.partidos) {
			ArrayList<Vereador> lista = partido.getVereadores();
			for (Vereador v : lista) {
				if (v.getQtdProjAprov() > projetosAprov) {
					projetosAprov = v.getQtdProjAprov();
					vereadorMaisProjAprov = v;
				}
			}
		}
		return vereadorMaisProjAprov;
	}

	public int getQtdPartidos() {
		return this.partidos.size();
	}

	public double getDesempenhoMedioCamara() {
		double somaMediaPartidos = 0;
		int conta = 0;

		if (this.getQtdPartidos() == 0) {
			return 0;
		}

		for (Partido partido : this.partidos) {
			somaMediaPartidos += partido.getMediaDesempenho()*partido.getTotalVereadores();
			conta += partido.getTotalVereadores();
		}
		return somaMediaPartidos / conta;
	}

	public ArrayList<Vereador> getVereadoresAcimaMedia() {
		ArrayList<Vereador> vereadoresAcimaMediaCamara = new ArrayList<>();
		double mediaCamara = this.getDesempenhoMedioCamara();

		for (Partido partido : this.partidos) {
			ArrayList<Vereador> vereadoresAcimaMediaPartido = partido.getVereadoresAcima(mediaCamara);
			vereadoresAcimaMediaCamara.addAll(vereadoresAcimaMediaPartido);
		}
		return vereadoresAcimaMediaCamara;
	}
}