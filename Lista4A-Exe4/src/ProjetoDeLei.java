
import java.time.LocalDate;

public class ProjetoDeLei {
	private String titulo;
	private LocalDate dataApresentacao;
	private LocalDate dataAprovado;
	private int numeroProjeto;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getDataApresentacao() {
		return dataApresentacao;
	}

	public void setDataApresentacao(LocalDate dataApresentacao) {
		this.dataApresentacao = dataApresentacao;
	}

	public LocalDate getDataAprovado() {
		return dataAprovado;
	}

	public void setDataAprovado(LocalDate dataAprovado) {
		this.dataAprovado = dataAprovado;
	}

	public int getNumeroProjeto() {
		return numeroProjeto;
	}

	public void setNumeroProjeto(int numeroProjeto) {
		this.numeroProjeto = numeroProjeto;
	}

	public String mostrar() {
		return "Projeto de Lei:" 
				+ this.getTitulo()+" - "
				+this.getDataApresentacao() + " - " 
				+ this.getDataAprovado()+ " - " 
				+ this.getNumeroProjeto();
	}

	public boolean estaAprovado() {
		return (this.dataAprovado != null);
	}
}
