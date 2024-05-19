package ej8_ficheros;

public class Temperatura implements Comparable<Temperatura> {
	int minima;
	int maxima;
	String fecha;

	public Temperatura(int minima, int maxima, String fecha) {
		super();

		this.minima = minima;
		this.maxima = maxima;
		if (fecha != null && !fecha.equals("")) {
			this.fecha = fecha;
		}

	}

	public int getMinima() {
		return minima;
	}

	public void setMinima(int minima) {
		this.minima = minima;
	}

	public int getMaxima() {
		return maxima;
	}

	public void setMaxima(int maxima) {
		this.maxima = maxima;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public int compareTo(Temperatura t) {

		return t.fecha.compareTo(this.fecha);
	}

}
