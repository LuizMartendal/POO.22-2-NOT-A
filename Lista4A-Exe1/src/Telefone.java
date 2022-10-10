import java.time.LocalDate;

public abstract class Telefone {
	private String nome;
	private String numero;
	private String endereco;
	protected LocalDate dataInstalacao; // para exemplificar a diferença com private
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		if (numero.length() == 10) {
			this.numero = numero;
		} else {
			IllegalArgumentException exc;
			exc = new IllegalArgumentException("Telefone invÃ¡lido");
			throw exc;
		}
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public LocalDate getDataInstalacao() {
		return dataInstalacao;
	}
	
	public void setDataInstalacao(LocalDate dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
	}
	
	public abstract float calculaValores() ;

	public abstract String getInfoPropria();
	
}
