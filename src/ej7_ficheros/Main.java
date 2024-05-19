package ej7_ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opc;
		do {
			Menu();

			while (!sc.hasNextInt()) {
				System.out.println("Por favor, introduce un número válido.");
				sc.next();
			}
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {
			case 1:
				nuevoContacto();
				break;
			case 2:
				buscarNumero();
				break;
			case 3:
				System.out.println("Tu agenda es:");
				Control.mostrarAgenda();
				break;
			case 4:
				System.out.println("Adios");
				break;
			default:
				escribirAgendaEnArchivo();
			}
		} while (opc != 4);

	}

	private static void buscarNumero() {
		String nombre = "";
		System.out.println("El numero de  quien quieres ver");
		nombre = sc.nextLine();
		if (Control.buscarPersona(nombre)) {
			Control.buscarPersona(nombre);
		} else {
			System.out.println("Nombre no válido");
		}
	}

	private static void nuevoContacto() {
		String nombre;
		int numero = 0;
		System.out.println("Añade una persona");
		System.out.println("Nombre");
		nombre = sc.nextLine();
		System.out.println("numero");
		numero = sc.nextInt();
		sc.nextLine();
		if (Control.añadirPersona(nombre, numero)) {
			Control.añadirPersona(nombre, numero);
		} else {
			System.out.println("No se ha podido añadir, ese nombre ya existia");
		}

	}

	private static void Menu() {
		System.out.println("Elige una opción\r\n" + "1-Nuevo contacto.\r\n" + "2-Buscar por nombre.\r\n"
				+ "3-Mostrar todos.\r\n" + "4-Salir.\r\n");
	}

	public static void escribirAgendaEnArchivo() {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("src//ej7_ficheros//agenda.txt"));
			for (Entry<String, Integer> entry : Control.getAgenda().entrySet()) {
				writer.write("Nombre: " + entry.getKey() + ", Número: " + entry.getValue());
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo");
		}

	}
}
