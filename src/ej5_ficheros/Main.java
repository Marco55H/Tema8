package ej5_ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int edad = 0;
		System.out.println("Introduce Nombre");
		nombre = sc.nextLine();
		System.out.println("Introduce tu edad " + nombre);
		edad = sc.nextInt();
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter("src\\ej5_ficheros\\Datos.txt"));
			
			br.write(nombre+", "+edad);
		} catch (IOException e) {
			System.out.println("Archivo no encontrado");
			System.out.println("Creándolo...");
		}
		sc.close();
	}
}
