import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Exerc2 {
	public static void main(String[] parametros) {
		JFileChooser chooser = new JFileChooser();
		int opcao = chooser.showOpenDialog(null);
		if (opcao == JFileChooser.APPROVE_OPTION) {
			File f = chooser.getSelectedFile();
			String nomeArq = f.getAbsolutePath();
			String nomeSaida = nomeArq+"-saida";
			int chave = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com a chave (1-200)"));
			try {
				FileReader origem = new FileReader(nomeArq);
				FileWriter destino= new FileWriter(nomeSaida);
				
				int lido = origem.read();
				int gravado;
				while (lido != -1) {
					gravado = conversao(lido, chave);
					destino.write(gravado);
					lido = origem.read();
				}
			
				origem.close();
				destino.close();
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null,e.getMessage());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null,e.getMessage());
			}
			
			
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Encerrando o programa por cancelamento");
		}
	}

	private static int conversao(int lido, int chave) {
		int novo = lido + chave;
		if (novo > 255) {
			novo = novo - 256;
		}
		return novo;
	}
}
