import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exerc1 {

	public static void main(String[] args) throws IOException {
		// try with resources
		try (FileWriter fw = new FileWriter("ArqTextoExerc1.txt")){
			fw.write("12345");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FileOutputStream fos = new FileOutputStream("ArqBinarioExerc1.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(12345);
		dos.close();
		
		// ler os arquivos como texto
		FileReader fr = new FileReader("ArqTextoExerc1.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		System.out.println("Arquivo texto lido como texto = "+s);
		br.close();
		
		fr = new FileReader("ArqBinarioExerc1.dat");
		br = new BufferedReader(fr);
		s = br.readLine();
		System.out.println("Arquivo binário lido como texto = "+s);
		br.close();

		
		// ler os arquivos como binário
		FileInputStream fis = new FileInputStream("ArqTextoExerc1.txt");
		DataInputStream dis = new DataInputStream(fis);
		int inteiro = dis.readInt();
		System.out.println("Arquivo texto lido como binário = "+inteiro);
		dis.close();

		fis = new FileInputStream("ArqBinarioExerc1.dat");
		dis = new DataInputStream(fis);
		inteiro = dis.readInt();
		System.out.println("Arquivo binário lido como binário = "+inteiro);
		dis.close();

	}

}
