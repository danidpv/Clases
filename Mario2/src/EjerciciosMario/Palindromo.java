package EjerciciosMario;

import java.util.Scanner;

public class palindromo {
	public static boolean Palindromo(String cad) {
		String cadena="";
		boolean esPalindromo;
			for(int i =cad.length()-1; i>=0;i--) {
				cadena+=cad.charAt(i);
			}
			if(cadena.equals(cad)) {
				return true;
			}else {
				return false;
			}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String p=entrada.next();
		System.out.println("La palabra : " + p + " es palindromo?= " + Palindromo(p));
	}
}
