package EjerciciosMario;

import java.util.Scanner;

public class palindromo {
	public static boolean Palindromo(String cad) {
		String cadena="";
		boolean cad2;
		if(cad != cadena) {
			cad2=false;
		}else {
			for(int i =cadena.length()-1; i>=0;i--) {
				cad+=cadena.charAt(i);
			}
			cad2=true;
		}
		return cad2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String p=entrada.next();
		String resultado = p;
		
		System.out.println("La palabra : " + p + " es = " + Palindromo(resultado));
	}

}
