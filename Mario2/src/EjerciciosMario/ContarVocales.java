package EjerciciosMario;

import java.util.Scanner;
//	Que numero de vocales hay en total.
public class ContarVocales {
	public static int ContarVocal(String palabra) {
		int contador = 0;
		for(int i = 0;i<palabra.length();i++) {
			if(palabra.charAt(i)=='a') {
				contador++;
			}
			if(palabra.charAt(i)=='e') {
				contador++;
			}
			if(palabra.charAt(i)=='i') {
				contador++;
			}
			if(palabra.charAt(i)=='o') {
				contador++;
			}
			if(palabra.charAt(i)=='u') {
				contador++;
			}
		}
		return contador;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabraOriginal=entrada.next(); 
		System.out.println(" La palabra : "+ palabraOriginal + " Tiene : " + ContarVocal(palabraOriginal) + " Vocales");
	}
}
