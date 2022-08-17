
public class Contribuinte {
	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;

	
	public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
		super();
		this.setNome(nome);
		this.setCpf(cpf);
		this.setUf(uf);
		this.setRendaAnual(rendaAnual);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf.equals("SC") || uf.equals("RS") || uf.equals("PR")) {
			this.uf = uf;
		}
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		if (rendaAnual >= 0) {
			this.rendaAnual = rendaAnual;
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
}
