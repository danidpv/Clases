package libro;

import java.util.Scanner;

public class Sentencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Se desea desarrollar un programa que calcule el índice de masa corporal de 
	       una persona. Para ello, se requiere definir el peso de la persona (en kilogramos) y su estatura (en metros).
	      El índice de masa corporal (IMC) se calcula 
	      utilizando la siguiente fórmula:
	      IMC  peso
	       estatura2*/
			int masa=15;
			double estatura= 1.77;
			double IMC = masa/Math.pow(estatura, 2);
			System.out.println("El resultado es : "+ IMC);
			if (IMC < 16) {
				System.out.println("La persona tiene delgadez severa");
			} else if (IMC < 17) {
				System.out.println("La persona tiene delgadez moderada");
				} else if (IMC < 18.5) {
				System.out.println("La persona tiene delgadez leve");
				} else if (IMC < 25) {
				System.out.println("La persona esta bien");
				}
			
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce un anio");
			int anio = entrada.nextInt();	
			if(anio%4==0) {
				System.out.println("Año bisiesto");
			}else {
				System.out.println("Año no bisiesto");
			}
			
			/*Se quiere desarrollar un programa que determine si un número es un número de Amstrong. 
			 * Un número de Amstrong es aquel que es igual a la suma 
				de sus dígitos elevados a la potencia de su número de cifras.
				Por ejemplo, el número 371 es un número que cumple dicha característica ya que tiene tres cifras y:
				371 = 33
				 + 73
				 + 13
				 +1 = 371 Math.floor Devuelve el máximo entero menor o igual a un 
número pasado como parámetro    Math.log10 Devuelve el logaritmo en base 10 de un número 
pasado como parámetro    */
			
			int numeroOriginal, ultimoDigito;
			numeroOriginal=entrada.nextInt();
			double digitos;
			double suma=0;
			int numero=371;
			numeroOriginal=numero;
			digitos=Math.floor(Math.log(numero))+1;
			while(numero>0) {
				ultimoDigito=numero%10;
				suma=suma+Math.pow(ultimoDigito, digitos);
				numero=numero/10;
			}
			if(numeroOriginal==suma) {
				System.out.println(numeroOriginal + " es un numero de amstrong");
			}else {
				System.out.println("No es un numero de mastrong");
			}
			
			/* Escribir un programa que calcule los primeros n números de 
				Fibonacci. Los números de Fibonacci comienzan con 0 y 1, y cada 
			término siguiente es la suma de los anteriores: 0, 1, 2, 3, 5, 8, 13, 
			21,*/
			
			
			
			
			
	}

}
