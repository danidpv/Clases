package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {

	public static void main(String[] args) {
		//Contar el numero de palabras en el texto
		
		
		 String linea = "";
			try {
				FileReader fr = new FileReader("mi_fichero_escffritura.txt");
				BufferedReader lectura = new BufferedReader(fr);
			
					try {
						while((linea = lectura.readLine())!=null) {
							System.out.println(linea);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			} catch (FileNotFoundException e) {
				
				System.out.println("No se encontró el fichero");
			}

	}

}
