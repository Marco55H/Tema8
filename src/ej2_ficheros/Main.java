package ej2_ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int suma = 0;
		double cont = 0;
		try {
			Scanner sc = new Scanner(new FileReader("src/ej2_ficheros/Archivo2.txt"));
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
