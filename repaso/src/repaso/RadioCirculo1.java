package repaso;

import java.util.Scanner;

public class RadioCirculo1 {

	public static void main(String[] args) {
		// INICIAMOS CON CLASE SCANER
		Scanner entrada = new Scanner(System.in);
		//Creamos variable radio
		String radio;
		//Creamos variable boolean para verificar
		boolean numerico=false;
		//Con el do while ponemos la condicion para verificar que meta un numero
		do {
			System.out.println("Introduce un radio");
			//Metemos el radio por pantalla y dentro del do para que se vuelva a repetir si es erroneo
			radio = entrada.nextLine();
			//Iniciamos un for en el cual recorremos radio 
			 for(int i = 0;i<radio.length();i++) {
				 //Con el if usamos metodo charAt para decir que solo van numeros
				 if(radio.charAt(i) >='0' && radio.charAt(i)<='9') {
					 System.out.println("Es numerico");
					 numerico=true;
					 //Ponemos para que tampoco sea negativo
				 }else if(radio.charAt(i)=='-'){
					 System.out.println("No es numerico");
					 //Metemos un break para salir de la ejecucion del simbolo menos porque al 
					 //recorrer el numero detecta despues el numero y sigue adelante con la ejecucion
					 break;
				 }
			 }
			 //Si la condicion es falsa
		}while(numerico == false);
		//Pasamos de string a double
		 Double radioFinal =Double.parseDouble(radio);
		 System.out.println("El radio es "+ radio);
		 //Usamos metodo math para el pi y metodo pow de math para calcular el radio
		 double resultado = Math.PI * (Math.pow(radioFinal, 2));
		 System.out.printf("El radio final es %.2f" , resultado);
	}
}