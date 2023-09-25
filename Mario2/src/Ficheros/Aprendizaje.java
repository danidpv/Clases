package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Aprendizaje {
	
	/*FileWritter es una clase de ficheros que sirve para abrirlo o si no existe crearlo sintaxis:
	 *  FileWritter fichero = new FileWritter("mi fichero.txt")
	 *  
	 *  Despues para abrir un flujo para manejarlo es BufferedWritter sintaxis: BufferedWritter bf = new BufferedWritter(fichero);
	 *  entre parentesis va el objeto fichero, para escribir es bf.write("Primera linea")
	 *  
	 *  bf.newLine(); Para una nueva linea.
	 *  bf.close(); Para cerrar el flujo
	 *  fichero.close(); Para cerrar el fichero.
	 *  Todo esto va contenido con un try catch
	 *  
	 *  Cuando queremos leer o manipular un fichero se usa tambien la clase BufferedReader o FileReader, indicando
	 *   ese fichero que deseamos leer, recorrer, editar, etc..
	 *   EJEMPLO: 
	 *   try {
						FileReader fr = new FileReader("mi_fichero_escritura.txt");
						BufferedReader lectura = new BufferedReader(fr);
	 *   try {
				while((linea = lectura.readLine())!=null) {
						CadenaCompleta += linea+ " ";
						}
					palabras =CadenaCompleta.split(" ");//Dentro de split tenemos que guardar una expresion regular
					System.out.println("Estas son las palabras mayor a 5");
						for(String palabra : palabras) {
							if(palabra.length()>=9) {
								System.out.println(palabra);
								cont ++;
							}
						}
						System.out.println("El total son : " +cont);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					} catch (FileNotFoundException e) {
						System.out.println("No se encontró el fichero");
		Anidamos un try dentro de otro y hacemos la ejecucion de recorrer un texto y que nos muestre las palabras por
		separado y con un contador que nos cuente cuantas lineas tenemos, palabras mayor a 5.
	 */
}
