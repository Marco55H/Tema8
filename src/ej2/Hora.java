package ej2;

public class Hora {

	protected int hora;

	protected int minuto;

	public Hora(int hora, int minuto) throws NegativeHourException, NegativeMinuteException {
		super();
		if (hora >= 0 && hora < 13) {
			this.hora = hora;
		} else if (hora < 0) {
			throw new NegativeHourException();
		}

		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		} else if (hora < 0) {
			throw new NegativeMinuteException();
		}
	}

	void inc() {
		this.minuto++;

		if (this.minuto >= 60) {
			this.minuto = 0;
			this.hora++;
		}
	}

	public int getHora() {
		return hora;
	}

	public boolean setHora(int hora) throws NegativeHourException {
		boolean cambiado = false;
		if (hora >= 0 && hora < 13) {
			this.hora = hora;
			cambiado = true;
		} else if (hora < 0) {
			throw new NegativeHourException();
		}
		return cambiado;
	}

	public int getMinutos() {
		return minuto;
	}

	public boolean setMinutos(int minutos) throws NegativeMinuteException {
		boolean cambiado = false;
		if (minutos >= 0 && minutos < 60) {
			this.minuto = minutos;
			cambiado = true;
		} else if (minuto < 0) {
			throw new NegativeMinuteException();
		}
		return cambiado;
	}

	@Override
	public String toString() {

		String cadena = "";

		if (this.minuto < 10) {
			cadena = hora + " : 0" + minuto;
		} else {
			cadena = hora + " : " + minuto;
		}
		return cadena;
	}

}
