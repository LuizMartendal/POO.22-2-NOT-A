import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class Exerc4 {

	public static void main(String args[]) throws IOException {
		ArrayList<ClimaDoDia> lista = new ArrayList<>();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("d/M/y");
		JFileChooser jfc = new JFileChooser(".");
		int retorno = jfc.showOpenDialog(null);
		if (retorno == JFileChooser.APPROVE_OPTION) {
			File arqSelecionado = jfc.getSelectedFile();
			try (FileInputStream fis = new FileInputStream(arqSelecionado);
					DataInputStream dis = new DataInputStream(fis)) {
				while (true) {
					String dataStr = dis.readUTF();
					char ch1 = dis.readChar();
					char ch2 = dis.readChar();
					int velocidade = dis.readInt();
					int indice = dis.readInt();
					double temperatura = dis.readDouble();
					ClimaDoDia cd = new ClimaDoDia(LocalDate.parse(dataStr, df), "" + ch1 + ch2, velocidade, indice,
							temperatura);
					lista.add(cd);
				}
			} catch(EOFException eof) {
				System.out.println("Leu tudo...");
			}
			// faltou dividir em um arquivo de objetos por mês...
			try (FileOutputStream fos = new FileOutputStream("ClimaDoDia - vários.obj");
					ObjectOutputStream oos = new ObjectOutputStream(fos)){
				for (ClimaDoDia cd: lista) {
					oos.writeObject(cd);
				}
			} catch (IOException ioe) {
				System.out.println(ioe);
			}
		}
	}

}
