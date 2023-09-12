package libro;

import java.util.Scanner;

public class NumeroAmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double dígitos; // Cantidad de dígitos que tiene el número
		double suma = 0; /* Variable que sumará los dígitos elevados a su 
		cantidad de dígitos */
		
		System.out.println("Introduce un numero para ver si es Amstrong");
		int número = entrada.nextInt(); /* Número a determinar si es un número de 
		Amstrong */
		
		int númeroOriginal = número; /* Copia el valor del número para su 
		procesamiento */
		
		dígitos = Math.floor(Math.log10(número)) + 1; /* Calcula el total 
		de dígitos del número */
		
		// Calcula la suma de potencia de digitos
		while (número > 0) {
		double últimoDigito = número % 10; // Extrae el último dígito
		
		// Calcula la suma de potencias del último dígito
		suma = suma + Math.pow(últimoDigito, dígitos);
		
		número = número / 10; // Elimina el último dígito
		}
		
		/* Verifica si es un número de Armstrong si la suma obtenida es 
		igual al número */
		if (númeroOriginal == suma) {
		System.out.println(númeroOriginal + " es un número de Amstrong");
		} else {
		System.out.println(númeroOriginal + " no es un número de Amstrong");
		}
		}
		
		
	}


