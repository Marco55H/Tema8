package ej1_ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ControlarNumeros {
	public static void main(String[] args) {
		int suma = 0;
		double cont = 0;
		try {
			Scanner sc = new Scanner(new FileReader("//git/Tema8/Tema8/Tema8/src/ej1_ficheros/Archivo.txt"));
			while (sc.hasNext()) {
				suma += sc.nextInt();
				cont++;
			}
			System.out.println(suma/cont);
			System.out.println(suma);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
