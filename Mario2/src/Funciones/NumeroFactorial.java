package Funciones;

import java.util.Scanner;

public class NumeroFactorial {
	public static int Factorial(int n) {
		int calculo=1;
		if(n==0 || n==1) {
			return 1;
		}else {
			for(int i =n;i>1;i--) {
				calculo *=i;
			}
		}
		return calculo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = entrada.nextInt();	
		System.out.println("El numero factorial de "+ numero + " es " + Factorial(numero));
	}
}