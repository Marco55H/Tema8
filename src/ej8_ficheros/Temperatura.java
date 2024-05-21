package ej8_ficheros;

public class Temperatura implements Comparable<Temperatura> {
	int minima;
	int maxima;
	String fecha;

	public Temperatura(String fecha, int minima, int maxima) {
		super();

		this.minima = minima;
		this.maxima = maxima;
		if (fecha != null && !fecha.equals("")) {
			this.fecha = fecha;
		}

	}
	
	
	
	@Override
	public boolean equals(Object obj) {

		Temperatura temp = (Temperatura) obj;

		return this.fecha.equals(temp.fecha);
	}

	
	@Override
	public int compareTo(Temperatura t) {

		return t.fecha.compareTo(this.fecha);
	}



	public int getMinima() {
		return minima;
	}



	public int getMaxima() {
		return maxima;
	}



	public String getFecha() {
		return fecha;
	}




}
