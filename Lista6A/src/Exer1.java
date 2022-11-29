import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exer1 {  // contribuição do Luiz Henrique
	private static LinkedList<Veiculo> veiculos = new LinkedList<>();
	
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("123", "CeltAÂ´zul", 2022, "Dorivaldo");
		veiculos.add(v1);
		Veiculo v2 = new Veiculo("1234", "Uno", 2021, "Daniel");
		veiculos.add(v2);
		Veiculo v3 = new Veiculo("1235", "Uno", 2021, "Gustavo");
		veiculos.add(v3);
		Veiculo v4 = new Veiculo("1236", "Monza", 2010, "Gabriel");
		veiculos.add(v4);
		Veiculo v5 = new Veiculo("1237", "MarÃ©a", 2021, "Luiz");
		veiculos.add(v5);
		Veiculo v6 = new Veiculo("1238", "Chevette", 2019, "Marcel");
		veiculos.add(v6);
		Veiculo v7 = new Veiculo("1239", "Fusca", 2022, "Julio");
		veiculos.add(v7);
		Veiculo v8 = new Veiculo("1230", "Gol Bola", 2008, "Michael Jackson");
		veiculos.add(v8);
		Veiculo v9 = new Veiculo("12311", "Palio", 2023, "CamaleÃ£o");
		veiculos.add(v9);
		Veiculo v0 = new Veiculo("12312", "Corsa", 2022, "Depraved");
		veiculos.add(v0);
		
		System.out.println(veiculos);
		veiculos.remove(v0);
		veiculos.remove(6);
		System.out.println(veiculos);
		ListIterator<Veiculo> li = veiculos.listIterator(veiculos.size() - 2);
		Veiculo v = li.previous();
		li.remove();
		System.out.println("Após exclusão");
		System.out.println(veiculos);
		
		Collections.shuffle(veiculos);
		System.out.println("Não ordenado");
		System.out.println(veiculos);
		Collections.sort(veiculos);
		System.out.println("Ordenado por placa");
		System.out.println(veiculos);		
		
		// Implementado como outra classe
		ComparaAnoPlaca comparador = new ComparaAnoPlaca();
		//Collections.sort(veiculos, comparador);
		Collections.shuffle(veiculos);
		veiculos.sort(comparador);
		System.out.println("Ordenado por ano+placa");
		System.out.println(veiculos);	
		
		// Implementado como classe interna
		Comparator<Veiculo> comp = new Comparator<Veiculo>() {
			@Override
			public int compare(Veiculo o1, Veiculo o2) {
				int valor = o1.getModelo().compareTo(o2.getModelo());
				if (valor == 0) {
					return comparador.compare(o1,o2);
				}
				else {
					return valor;
				}
			}
		};
		Collections.shuffle(veiculos);
		veiculos.sort(comp);
		System.out.println("Ordenado por modelo+ano+placa");
		System.out.println(veiculos);
		
	}
	
}
