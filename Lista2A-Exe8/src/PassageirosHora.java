
public class PassageirosHora {
	private int[][][] matriz = new int[12][30][24]; // 12 meses x 30 dias x 24 horas
	
	// item a
	public void adiciona(int dia, int mes, int hora) {
		this.matriz[mes-1][dia-1][hora]++;
	}
	
	// item b
	public int quantosPassageiros(int dia , int mes) {
		int soma = 0;
		int d= dia-1;
		int m = mes-1;
		for (int h=0; h < matriz[m][d].length; h++) {
			soma += matriz[m][d][h];
		}
		return soma;
	}
	
	// item c
	public int mesMenorFluxo() {
		int mesMenor = 1;  // assumindo janeiro como o menor
		int qtdMenor = this.quantosPassageiros(1);
		for (int mes=2; mes <=12; mes++){ // começando em fevereiro
			int qtde = this.quantosPassageiros(mes);
			if (qtde < qtdMenor) {
				qtdMenor = qtde;
				mesMenor = mes;
			}
		}
		return mesMenor;
	}
	
	public int quantosPassageiros(int mes) {
		int total = 0;
		for (int dia=1; dia <= 30; dia++) {
			total += this.quantosPassageiros(dia, mes);
		}
		return total;
	}
	
	// item d
	public int[] picoTransporte() {
		int diaM, mesM, horaM, qtdeM;
		diaM= mesM= horaM= qtdeM = 0;
		for (int m=0; m < matriz.length; m++) {
			for (int d=0; d < matriz[m].length; d++) {
				for (int h=0; h < matriz[m][d].length; h++) {
					if (matriz[m][d][h] > qtdeM) {
						qtdeM= matriz[m][d][h];
						diaM = d+1; // já ajustado
						mesM = m+1;
						horaM= h;
					}
				}
			}
		}
		int[] retorno = {diaM, mesM, horaM, qtdeM};
		return retorno;
	}
}
