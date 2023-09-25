package Ficheros;

import java.io.BufferedReader;         //Las palabras que son de 5 o mas de longitud, contar y imprimir
                                        //Contar el numero de palabras en el texto
import java.io.FileNotFoundException;/*Añadir al fichero nuevo palabras que sean igual o mayor a 9 y modificar linea 39 meterlo 
                                           en el fichero
                                         * mirar en escritura, y cerrar*/
import java.io.FileReader;
import java.io.IOException;

public class ContarNumeroLetra {

	public static void main(String[] args) {
		
		 String linea = "";
			try {
				FileReader fr = new FileReader("mi_fichero_escffritura.txt");
				BufferedReader lectura = new BufferedReader(fr);
					try {
						while((linea = lectura.readLine())!=null) {
							System.out.println(linea);
						}
					} catch (IOException e) {
						
						e.printStackTrace();
					}
			} catch (FileNotFoundException e) {
				System.out.println("No se encontró el fichero");
			}
	}
}


