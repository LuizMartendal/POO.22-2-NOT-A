

public class ProjetoDeLeiComplementar extends ProjetoDeLei {
	private String artigoLO;
	private int qtdVotosFavoraveis;
	
	public String getArtigoLO() {
		return artigoLO;
	}
	public void setArtigoLO(String artigoLO) {
		this.artigoLO = artigoLO;
	}
	public int getQtdVotosFavoraveis() {
		return qtdVotosFavoraveis;
	}
	public void setQtdVotosFavoraveis(int qtdVotosFavoraveis) {
		this.qtdVotosFavoraveis = qtdVotosFavoraveis;
	}
	
	public String mostrar()
	{
		return super.mostrar()+" - "
		+this.getArtigoLO()+ " - "
		+this.getQtdVotosFavoraveis();
	}
	
	
}
