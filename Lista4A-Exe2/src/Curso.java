import java.io.Serializable;

public class Curso implements Serializable{
    private String nome;
    private String sigla;

    public Curso(String nome, String sigla) {
        setNome(nome);
        setSigla(sigla);
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        if (sigla != null && sigla.length() == 3) {
            this.sigla = sigla.toUpperCase();
        } else {
            throw new IllegalArgumentException("Sigla Inválida");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null &&  nome.length() >= 5) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome Inválido.");
        }
    }

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destrutor de curso:"+this.sigla);
	}
    
	public String toString() {
		return this.sigla;
	}
    
}
