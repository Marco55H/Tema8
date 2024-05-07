package ejerciciosexcepciones;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un double");
		Utils.readDouble(sc);
		sc.nextLine();
		System.out.println("Introduce un int");
		Utils.readInt(sc);
		sc.close();
	}
}
