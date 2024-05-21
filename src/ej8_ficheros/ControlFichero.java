package ej8_ficheros;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ControlFichero {

	static public void imprimirArchivo() {

		// BufferedWriter para escribir
		BufferedWriter bw = null;
		{
			try {

				// Lo inicializamos
				bw = new BufferedWriter(new FileWriter("src/ej8_ficheros/temperatures.txt"));

				// Recorre el array y va pintando los atributos de cada objeto
				for (Temperatura temp : ControlTemperaturas.temperaturas) {
					bw.write(temp.getFecha());
					bw.write("::");
					bw.write(temp.getMaxima());
					bw.write("::");
					bw.write(temp.getMinima());
					// Siguiente linea
					bw.newLine();
				}

			} catch (FileNotFoundException e) {

				e.printStackTrace();

			} catch (IOException e) {

				e.printStackTrace();

			} finally {

				try {

					bw.close();
					bw.flush();

				} catch (IOException e) {

					e.printStackTrace();

				}

			}
		}
	}

}
