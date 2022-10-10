import java.time.LocalDate;

public class TelefoneComercial extends Telefone {
	private String ramoAtividade;


	public String getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}


	public float calculaValores() {
		float valor = 0;
		// tem acesso ao atributo dataInstalacao pois foi declarado protected		
		if (this.dataInstalacao.isBefore(LocalDate.of(2019, 01, 01))) {
			valor = 25.00f;
		} else {
			valor = 37.50f;
		} 
		return valor;
	}

	@Override
	public String getInfoPropria() {
		return "Ramo de atividade:"+this.ramoAtividade;
	}

}
