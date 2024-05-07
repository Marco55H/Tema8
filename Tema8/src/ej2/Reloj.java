package ej2;

import java.util.Scanner;

public class Reloj {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opc;
		int hora;
		int minuto;
		int segundo;

		menu();
		System.out.println("Elija la opción");
		opc = sc.nextInt();
		sc.nextLine();
		
		switch (opc) {
		case 1:
			System.out.println("Introduce la hora");
			hora = sc.nextInt();
			sc.nextLine();
			System.out.println("Introduce los minutos");
			minuto = sc.nextInt();
			sc.nextLine();

			Hora h = new Hora(hora, minuto);
			System.out.println("Su hora es " + h);

			nuevaHora(h);

			nuevoMinuto(h);

			System.out.println("¿Quiere sumar un minuto?");
			System.out.println("1 Para seguir, en caso negativo cualquier otro número.");
			opc = sc.nextInt();
			sc.nextLine();

			if (opc == 1) {
				h.inc();
				System.out.println("Su nueva hora es " + h);
			}
			break;

		case 2:
			System.out.println("Introduce la hora");
			hora = sc.nextInt();
			sc.nextLine();
			System.out.println("Introduce los minutos");
			minuto = sc.nextInt();
			sc.nextLine();
			System.out.println("Introduce los segundos");
			segundo = sc.nextInt();
			sc.nextLine();

			HoraExacta he = new HoraExacta(hora, minuto, segundo);
			System.out.println("Su hora es " + he);
			nuevaSegundo(he);

			System.out.println("¿Quiere sumar un minuto?");
			System.out.println("1 Para seguir, en caso negativo cualquier otro número.");
			opc = sc.nextInt();
			sc.nextLine();

			if (opc == 1) {
				he.inc();
				System.out.println("Su nueva hora es " + he);
			}

			break;
		}
		System.out.println("");

		sc.close();
	}

	private static void nuevaHora(Hora h) {
		int opc;
		int hora;
		System.out.println("¿Quiere modificar las horas? 1 Para seguir, en caso negativo cualquier otro número.");
		opc = sc.nextInt();
		sc.nextLine();

		if (opc == 1) {
			System.out.println("Introduzca la nueva cantidad de horas");
			hora = sc.nextInt();
			sc.nextLine();
			h.setHora(hora);
		}
	}

	private static void nuevoMinuto(Hora h) {
		int opc;
		int minuto;
		System.out.println("¿Quiere modificar los minutos? 1 Para seguir, en caso negativo cualquier otro número.");
		opc = sc.nextInt();
		sc.nextLine();

		if (opc == 1) {
			System.out.println("Introduzca la nueva cantidad de minutos");
			minuto = sc.nextInt();
			sc.nextLine();
			h.setMinutos(minuto);
		}
	}

	private static void nuevaSegundo(HoraExacta he) {
		int opc;
		int segundo;
		System.out.println("¿Quiere modificar los segundos? 1 Para seguir, en caso negativo cualquier otro número.");
		opc = sc.nextInt();
		sc.nextLine();

		if (opc == 1) {
			System.out.println("Introduzca la nueva cantidad de horas");
			segundo = sc.nextInt();
			sc.nextLine();
			he.setSegundo(segundo);
		}
	}

	private static void menu() {
		System.out.println("Elige entre estas opciones");
		System.out.println("1 para Hora (Minutos y horas)");
		System.out.println("2 para Hora Exacta (Minutos, horas y segundos)");
	}
}
