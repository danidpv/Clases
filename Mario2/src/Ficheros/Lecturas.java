package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lecturas {
	public static void main(String[] args) throws IOException {
		 //Las palabras que son de 5 o mas de longitud, contar y imprimir
				//Contar el numero de palabras en el texto
				 String linea = "";
				 String CadenaCompleta = "";
				 String palabras [];
				 int cont=0;
					try {
						FileReader fr = new FileReader("mi_fichero_escritura.txt");
						BufferedReader lectura = new BufferedReader(fr);
						
						FileWriter fw2 = new FileWriter("palabras_de_9.txt"); 
			        	BufferedWriter bf = new BufferedWriter(fw2);
			        	
			        	//FileReader fr2 = new FileReader("palabras_de_9.txt");
			        	//BufferedReader lectura2 = new BufferedReader(fr2); SOLO PARA LEER DESDE EL FICHERO YA ESCRITO
			        	/*Añadir al fichero nuevo palabras que sean igual o mayor a 9 y modificar linea 39 meterlo en el fichero
			        	 * mirar en escritura, y cerrar*/
			        	
							try {
								while((linea = lectura.readLine())!=null) {
								CadenaCompleta += linea+ " "; //A la derecha el valor que queremos asignar, a la izq lo que recibe el valor
								}
					palabras =CadenaCompleta.split(" ");//Dentro de split tenemos que guardar una expresion regular
					System.out.println("Estas son las palabras mayor a 9");
						for(String palabra : palabras) {//for each en palabra metemos valor palabras
							if(palabra.length()>=9) {//Sacamos palabras mayor o igual a 9
								//System.out.println(palabra);
								cont ++;
								fw2.write(palabra);
								bf.flush();//Limpia la basura del flujo
								bf.newLine();
							}
						}
						fw2.write("El total de palabras es :" +cont);
			        	System.out.println("Escritura terminada");
						System.out.println("El total son : " +cont);
						lectura.close();
						fr.close();
						bf.close();//Cerrar el flujo primero se cierra antes el flujo y luego el fichero
						fw2.close();//Cerrar fichero.
							} catch (IOException e) {
								e.printStackTrace();
							}
					} catch (FileNotFoundException e) {
						System.out.println("No se encontró el fichero");
					 }
			}
  }