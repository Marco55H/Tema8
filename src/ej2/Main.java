package ej2;

public class Main {
	public static void main(String[] args) {
		try {

			HoraExacta he = new HoraExacta(-2, 8, 8);

		} catch (NegativeHourException e) {
			System.out.println(e);
		} catch (NegativeMinuteException e) {
			System.out.println(e);
		} catch (NegativeSecondException e) {
			System.out.println(e);
		}

		try {
			Hora h = new Hora(2, 8);
		} catch (NegativeHourException e) {
			System.out.println(e);
		} catch (NegativeMinuteException e) {
			System.out.println(e);
		}
	}
}
