package ej8_ficheros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc = 0;
		String fecha = "";
		int minima = 0;
		int maxima = 0;

		do {
			do {
				Menu();
				try {
					opc = sc.nextInt();
					sc.nextLine();
				} catch (InputMismatchException e) {
					System.out.println("Introduce un número entero");
					sc.nextLine();
				}
			} while (opc > 3 || opc < 1);

			switch (opc) {
			case 1:
				System.out.println("Da la fecha del día");
				System.out.println("Cuidado!!! que no sea repetido");
				try {
				fecha=sc.nextLine();
				validaFecha(fecha);
				}catch(ExcepcionFecha e){
					System.out.println("Añade una fecha válida y con el siguiente formato (dd/mm/aaa)");
				}
				System.out.println("Añada la temperatura minima");
				minima=sc.nextInt();
				sc.nextLine();
				System.out.println("Añada la temperatura máxima");
				maxima=sc.nextInt();
				sc.nextLine();
				
				
				break;
			case 2:
				break;
			case 3:
				System.out.println("Nos vemos");
				break;
			}
		} while (opc == 3);
	}

	private static void validaFecha(String fecha)throws ExcepcionFecha{
		String[] partesFecha = fecha.split("/");
		int dia = Integer.parseInt(partesFecha[0]);
		int mes = Integer.parseInt(partesFecha[1]);
		int año = Integer.parseInt(partesFecha[2]);
		
		if(dia>0 && dia<32 && mes >0 && mes<13 && año>2024 && año<2100) {
			
		}else {
			throw new ExcepcionFecha();
		}
		
		}

	private static void Menu() {

		System.out.println("               Menú");
		System.out.println("----------------------------------");
		System.out.println("1- Registra nueva temperatura.");
		System.out.println("2- Mostrar historial de registros.");
		System.out.println("3- Salir.");
		System.out.println("Intente introducir un valor válido");
	}

}
