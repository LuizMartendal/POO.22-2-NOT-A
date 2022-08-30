
public class Principal {

	public static void main(String[] args) {
		VetorDeReais primeiro = new VetorDeReais(5);
		primeiro.setValor(100.5, 0);
		primeiro.setValor(-20.0, 1);
		primeiro.setValor(3.0, 2);
		primeiro.setValor(-6.0, 3);
		primeiro.setValor(45.5, 4);
		
		VetorDeReais segundo = new VetorDeReais(5);
		segundo.setValor(1.0, 0);
		segundo.setValor(2.0, 1);
		segundo.setValor(3.0, 2);
		segundo.setValor(4.0, 3);
		segundo.setValor(5.0, 4);

		System.out.println(primeiro.quantosPares());
		
		VetorDeReais terceiro = primeiro.divide(segundo);
		
		System.out.println(primeiro.exibir());
		System.out.println(segundo.exibir());
		System.out.println(terceiro.exibir());
		
		double resultado = primeiro.multiplica(segundo);
		System.out.println("Multiplicação = "+resultado);
	}

}
