package Ficheros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LecturaNombres {

	public static void main(String[] args) throws IOException {
		//Contar el numero de palabras en el texto
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un caracter");
		char letra=entrada.next().charAt(0);
		
		String linea = "";
		
		 int contador =0;
		 //Pedir al usuario que introduzca una letra
			try {
				FileReader fr = new FileReader("usa_nombres.txt");
				BufferedReader lectura = new BufferedReader(fr);
				FileWriter fw = new FileWriter("xxx_resultados.txt"); //Abrir el fichero
	        	BufferedWriter bf = new BufferedWriter(fw); //Abrir flujo de datos hacia el fichero
					try {
					
						while((linea= lectura.readLine())!=null) {
							//Leer lineas, sacar primer caracter, comparlo con el caracter
							// que introduce le usuario
							//Si coinciden , incrementar cont
								System.out.println(linea);
								if(letra==linea.charAt(0)) {
									contador++;
								}
						}
						System.out.println("Veces que coinciden " +contador);
						bf.newLine();
						bf.newLine();
						bf.write("Las veces que coinciden son : "+ contador);
						bf.newLine();
						bf.write("La letra introducida es : "+ linea);
						bf.newLine();
						
						//Escribir en fichero resultado
						 // - La letra introducida por el usuario
						//  - Las veces que coinciden
						//Reset contador a 0
						
						bf.close();
						fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			
			} catch (FileNotFoundException e) {
				
				System.out.println("No se encontró el fichero");
			}

	}

}
