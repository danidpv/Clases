package EjerciciosMario;

import java.util.Scanner;

public class palindromo {
	public static boolean Palindromo(String cad) {
		String cadena="";
		boolean cad2 = false;
		for(int i = cadena.length()-1; i>=0;i--) {
			cad+= cadena.charAt(i);
		}
		
		return cad2 ;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String p=entrada.next();
		String resultado="";
		System.out.println("La palabra " + p + " Es " +Palindromo(p.equals(resultado))? "True" : "false");
		
	}

}
