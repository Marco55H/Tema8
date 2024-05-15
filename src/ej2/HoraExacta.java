package ej2;

public class HoraExacta extends Hora {

	private int segundo;

	public HoraExacta(int hora, int minuto, int segundo) throws NegativeHourException,NegativeMinuteException, NegativeSecondException {
		super(hora, minuto);
		this.segundo = segundo;
	}

	void inc() {
		this.segundo++;

		if (this.segundo >= 60) {
			this.segundo = 0;
			this.minuto++;
			if (this.minuto >= 60) {
				this.minuto = 0;
				this.hora++;
			}
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public boolean setSegundo(int segundo) throws NegativeSecondException{
		boolean cambiado = false;
		if (segundo >= 0 && segundo < 60) {
			this.minuto = segundo;
			cambiado = true;
		} else if (hora < 0) {
			throw new NegativeSecondException();
		}
		return cambiado;
	}

	@Override
	public String toString() {
		
		return super.toString()+": + segundo";
	}
	
	

}
