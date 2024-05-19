package ej7_ficheros;

import java.util.TreeMap;

public class Control {
	protected static TreeMap<String, Integer> agenda = new TreeMap<>();

	public static boolean añadirPersona(String nombre, int numero) {
		boolean añadido = false;

		if (agenda.size() < 20 && !agenda.containsKey(nombre)) {
			agenda.put(nombre, numero);
			añadido = true;
		}

		return añadido;
	}

	public static boolean buscarPersona(String nombre) {
		boolean encontrado = false;

		if (agenda.containsKey(nombre)) {
			System.out.println("El numero de " + nombre + " es " + agenda.get(nombre));
			encontrado = true;
		}

		return encontrado;
	}

	public static void mostrarAgenda() {

		System.out.println(agenda);
		;

	}

	public static TreeMap<String, Integer> getAgenda() {
		// TODO Auto-generated method stub
		return agenda;
	}
}
