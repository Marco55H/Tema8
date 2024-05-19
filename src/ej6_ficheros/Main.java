package ej6_ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero=0;
		ArrayList<Integer> numeros = new ArrayList <Integer>();
		
		try {
			Scanner br = new Scanner (new BufferedReader (new FileReader ("src//ej6_ficheros//Leer.txt")));
			
			while(br.hasNext()) {
				numero=br.nextInt();
				numeros.add(numero);
			}
			
			Collections.sort(numeros);
			
			System.out.println(numeros);
			
		} catch (FileNotFoundException e) {
			System.out.println("No encontrado");
		}
	}
}
