import java.time.LocalDate;
import java.util.HashMap;

public class AlunoUniversitario extends Aluno {
	// atributo de classe
	private static HashMap<Character, String> formasIngresso = new HashMap<Character, String>() {
		{
			put('V', "Vestibular");
			put('E', "Enem");
			put('S', "Seletivo especial");
			put('T', "Transferência Externa");
			put('I', "Transferência Interna");
		}
	};
	// atributos (de instância)
	private char formaIngresso;
	private Curso curso;

	public AlunoUniversitario(String nome, LocalDate dataNascimento, char formaIngresso, Curso curso) {
		super(nome, dataNascimento);
		setFormaIngresso(formaIngresso);
		setCurso(curso);
	}

	public String mostra() {
		return this.getNome() + " é aluno universitário do curso de " + this.getSiglaCurso() + " - "
				+ this.getNomeCurso() + ", ingressando por " + formasIngresso.get(this.getFormaIngresso()) + "\n";
	}

	public char getFormaIngresso() {
		return formaIngresso;
	}

	public void setFormaIngresso(char formaIngresso) {
		formaIngresso = Character.toUpperCase(formaIngresso);
		if (formasIngresso.containsKey(formaIngresso)) {
			this.formaIngresso = formaIngresso;
		} else {
			throw new IllegalArgumentException("Forma de Ingresso Inválida");
		}

	}

	public String getNomeCurso() {
		return this.curso.getNome();
	}

	public String getSiglaCurso() {
		return this.curso.getSigla();
	}

	public void setCurso(Curso curso) {
		if (curso != null) {
			this.curso = curso;
		} else {
			throw new IllegalArgumentException("Curso inválido");
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destrutor de AlunoUniversitario:"+this.getNome());
		super.finalize();
	}
}
