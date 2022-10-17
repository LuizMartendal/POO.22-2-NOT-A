import java.time.LocalDate;
import java.time.Period;

public abstract class Aluno implements Comparable<Aluno> {
    private String nome;
    private LocalDate dataNascimento;

    public Aluno(String nome, LocalDate dataNascimento) {
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
    }

    public abstract String mostra();

    public int getIdade(){
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() >= 5) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome precisa possuir no mínimo 5 caracteres e não ser nulo.");
        }
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento != null) {
            this.dataNascimento = dataNascimento;
        } else {
            throw new IllegalArgumentException("Data Inv�lida");
        }
    }

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Passando destrutor de Aluno:"+this.nome);
	}

	@Override
	public int compareTo(Aluno outro) {
		return this.nome.compareTo(outro.getNome());
	}
    
    
}