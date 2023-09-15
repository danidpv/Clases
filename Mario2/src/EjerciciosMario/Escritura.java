package Ficheros;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {
	public static void main(String[] args) {
        try {
        	
        	FileWriter fw = new FileWriter("mi_fichero_escritura.txt"); //Abrir el fichero
        	BufferedWriter bf = new BufferedWriter(fw); //Abrir flujo de datos hacia el fichero
        	
        	for(int i = 0; i<=10;i++) {
        		bf.write("Linea "+i);
            	bf.newLine();//Inserta salto de linea
        	}
        	
        	bf.close();
        	fw.close();
        	System.out.println("Escritura terminada");
        	
        }catch(IOException e) {
        	System.out.println("No se ha podido crear el fichero");

        }
    }
}
