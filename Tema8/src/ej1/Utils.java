package ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils extends Throwable {

	static double readDouble(Scanner sc) throws InputMismatchException {
		double numero = 0;
		try {
			numero = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("El valor introducido tiene que ser double");
		}
		return numero;

	}

	static int readInt(Scanner sc) throws InputMismatchException {
		int numero = 0;
		try {
			numero = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("El valor introducido tiene que ser int");
		}
		return numero;

	}
}
