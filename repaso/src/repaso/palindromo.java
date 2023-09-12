package repaso;

import java.util.Scanner;

public class palindromo {

	public static void main(String[] args) {
		//Palindromo
	Scanner entrada = new Scanner(System.in);
	System.out.println("Introduce la palabra");
	//Pedmimos por pantalla la palabra
		String p = entrada.next();
		String resultado="";
		//Para realizar la operacion de palindromo necesitamos una variable vacia
		for(int i = p.length()-1;i>=0;i--) {
			resultado += p.charAt(i);
			//Con un for recorremos la palabra pedida pero con menos uno para que empiece por el final
			//despues vemos si i es mayor a 0 o igual, y la restamos para que nos lea la palabra al contrario.
		}
		System.out.println(resultado);
		System.out.println(p.equals(resultado) ? "Es un palindromo" : "No lo es");
		//Y con un ternario vemos el resultado y le decimos si es palindromo o no
	}
}
