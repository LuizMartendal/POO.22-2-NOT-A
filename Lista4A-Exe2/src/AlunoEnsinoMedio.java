import java.time.LocalDate;

public class AlunoEnsinoMedio extends Aluno {
    private int ano;

    public AlunoEnsinoMedio(String nome, LocalDate dataNascimento, int ano){
        super(nome, dataNascimento);
        setAno(ano);
    }

    
    public String mostra(){
        return this.getNome() + " está cursando o " + this.getAno() + "o ano do ensino mÃ©dio e tem "
                + this.getIdade() + " anos." + "\n";
    }

    public void setAno(int ano){
        if (ano >=1 && ano <=3){
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("O ano precisa estar entre 1 e 3.");
        }
    }

    public int getAno() {
        return this.ano;
    }


	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destrutor de AlunoEnsinoMedio:"+this.getNome());
		super.finalize();
	}
    
    
}
