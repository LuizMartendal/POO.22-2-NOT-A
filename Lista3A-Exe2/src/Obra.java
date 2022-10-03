
public class Obra { 
	private String autor;
	private String titulo;
	private Parecer[] pareceres = new Parecer[3];
	private int indice;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void addParecer(Parecer p) {
		if (indice < pareceres.length) {
			pareceres[indice] = p;
			indice++;
		}
		else {
			throw new IllegalArgumentException("Quantidade máxima de pareceres alcançada: 3");
		}
	}

	public Parecer getParecer(int pos) {
		return this.pareceres[pos];
	}
	public int getQuantidadePareceres() {
		return this.indice;
	}
	
}
