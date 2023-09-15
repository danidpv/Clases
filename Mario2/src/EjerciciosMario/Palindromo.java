package EjerciciosMario;

import java.util.Scanner;

public class Palindromo {
	public static boolean Palindromo(String cad) {
		String cadenaInvertida="";
		for(int i = cad.length()-1; i>=0;i--) {
			System.out.println(cad.charAt(i));
			cadenaInvertida+=cad.charAt(i);
		}
		System.out.println("Cadena invertida: "+cadenaInvertida);
		if(cadenaInvertida.equals(cad)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String cadenaOrignal = entrada.next();
		System.out.println("La palabra : " + cadenaOrignal + " es palindromo ? " + Palindromo(cadenaOrignal));
	}

}