package repaso;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
		Si no lo es, también debemos indicarlo.*/
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = entrada.nextInt();
		if(numero%2==0) {
			System.out.println("Es divisible entre dos");
		}else {
			System.out.println("No es divisible");
		}
	}

}
