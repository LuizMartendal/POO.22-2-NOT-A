import java.util.Comparator;

public class ComparaAnoPlaca implements Comparator<Veiculo> {

	@Override
	public int compare(Veiculo v1, Veiculo v2) {
		if (v1.getAno() > v2.getAno()) {
			return 10; // valor positivo
		}
		if (v1.getAno() < v2.getAno()) {
			return -10; // valor negativo
		}
		return v1.compareTo(v2);  // está implementado pela placa
	}

}
