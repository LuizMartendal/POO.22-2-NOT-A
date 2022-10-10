import java.time.LocalDate;

public class TelefoneResidencial extends Telefone{
	private boolean conexaoInternet;

	public boolean getConexaoInternet() {
		return conexaoInternet;
	}

	public void setConexaoInternet(boolean conexaoInternet) {
		this.conexaoInternet = conexaoInternet;
	}


	public float calculaValores() {
		return 15.00f;
	}

	@Override
	public String getInfoPropria() {
		return "Conexão internet:"+this.getConexaoInternet();
	}

}
