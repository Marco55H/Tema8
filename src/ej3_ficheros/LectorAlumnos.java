package ej3_ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LectorAlumnos {

    public static void main(String[] args) {

        try (Scanner br = new Scanner(new FileReader("src/ej3_ficheros/Alumno.txt"))) {

            String nombres = "";
            double mediaEdades = 0;
            double mediaEstaturas = 0;
            int cont = 0;

            while (br.hasNextLine()) {
        
                Scanner sc = new Scanner(br.nextLine());
                
                    nombres = sc.next();
                
                    mediaEdades += sc.nextInt();
                
                    mediaEstaturas += sc.nextDouble();
                
                cont++;
                sc.close();
                
                System.out.println(nombres);
            }

            if (cont > 0) {
                System.out.println( mediaEdades / cont);
                System.out.println(mediaEstaturas / cont);
            } else {
                System.out.println("No data to process.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error al buscar el archivo");
        }
    }
}
