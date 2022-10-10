import java.time.LocalDate;

public class TelefoneEspecializado extends Telefone {
	private int qtdOcorrencias;

	public int getQtdOcorrencias() {
		return qtdOcorrencias;
	}

	public void setQtdOcorrencias(int qtdOcorrencias) {
		if (qtdOcorrencias > 0) {
			this.qtdOcorrencias = qtdOcorrencias;
		} else {
			IllegalArgumentException exc;
			exc = new IllegalArgumentException("A quantidade deve ser maior do que zero.");
			throw exc;
		}
	}

	public float calculaValores() {
		float valor = 0;
		if (this.getQtdOcorrencias() > 50000) {
			valor = 187.82f;
		} else if (this.getQtdOcorrencias() > 10000) {
			valor = 123.90f;
		} else if (this.getQtdOcorrencias() > 5000) {
			valor = 98.50f;
		} else if (this.getQtdOcorrencias() > 1000) {
			valor = 67.80f;
		} else {
			valor = 50f;
		}
		return valor;
	}

	@Override
	public String getInfoPropria() {
		return "Qtde ocorrências:"+this.qtdOcorrencias;
	}

}
