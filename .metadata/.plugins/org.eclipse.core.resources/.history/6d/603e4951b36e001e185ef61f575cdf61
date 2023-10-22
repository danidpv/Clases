package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaNumeros {

	public static void main(String[] args) throws IOException {
		//Contar el numero de palabras en el texto
		
		 String linea = "";
		
		 int numMax = Integer.MIN_VALUE; // -99999999
		 int numMin = Integer.MAX_VALUE; //999999999
		 String [] palabras;
			try {
				FileReader fr = new FileReader("numeros.txt");
				BufferedReader lectura = new BufferedReader(fr);
				FileWriter fw = new FileWriter("resultados_numeros.txt"); //Abrir el fichero
	        	BufferedWriter bw = new BufferedWriter(fw); //Abrir flujo de datos hacia el fichero
					try {
					
						while((linea= lectura.readLine())!=null) {
							if(Integer.parseInt(linea)>numMax) {
								numMax = Integer.parseInt(linea);
							}
							if(Integer.parseInt(linea)<numMin) {
								numMin = Integer.parseInt(linea);
							}
							
						}
						System.out.println("El numero mayor es: "+numMax);
						System.out.println("El numero menor es: "+numMin);
						
						bw.newLine();
						bw.newLine();
						
						bw.write("El numero mayor es: "+numMax);
						bw.newLine();
						bw.write("El numero menor es: "+numMin);
						
						bw.close();
						fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			
			} catch (FileNotFoundException e) {
				
				System.out.println("No se encontró el fichero");
			}

	}

}
