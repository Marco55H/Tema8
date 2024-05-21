package ej8_ficheros;

import java.util.ArrayList;

public class ControlTemperaturas {

	static ArrayList<Temperatura> temperaturas = new ArrayList<>();

	public boolean añadir(String fecha, int minima, int maxima) {
		boolean añadido = true;
		Temperatura t = new Temperatura(fecha, maxima, maxima);

		for (Temperatura objeto : temperaturas) {
			if (objeto.equals(t)) {
				añadido = false;
			}
		}
		if (añadido) {
			temperaturas.add(t);
		}
		return añadido;
	}
}
