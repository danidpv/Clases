package repaso;

import java.util.Scanner;

public class ContadorLetra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String frase = entrada.nextLine();
		
		String fraseNueva = "";
		for(int i = 0; i<frase.length();i++) {
			if//(!(frase.charAt(i) == ' ' )) 
			(!( (frase.charAt(i) == ' ') || (frase.charAt(i) >='0' && frase.charAt(i) <='9') ) ){
			fraseNueva += frase.charAt(i);
			}
		}
		System.out.println("La frase "+ fraseNueva + " Contiene " + fraseNueva.length()+ " Letras");
	} 

}
