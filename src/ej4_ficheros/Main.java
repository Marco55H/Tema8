package ej4_ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String escrito="";
			BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ej4_ficheros\\Prueba.txt"));
			
			while(!escrito.equalsIgnoreCase("fin")) {
				System.out.println("Escriba en el archivo");
				escrito=sc.next();
				bw.write(escrito);
			}
			sc.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	
}
