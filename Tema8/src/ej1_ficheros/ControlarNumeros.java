package ej1_ficheros;
import java.io.FileReader;
import java.io.IOException;
public class ControlarNumeros {
	public static void main(String[] args) {
		try {
			FileReader in = new FileReader("\\Archivo.txt");
		} catch (IOException  e) {
			e.printStackTrace();
		} 
	}
}
