package repaso;

import java.util.Scanner;

public class Figuras {
	
	public static double getAreaCirculo(double radio) {
		/*double area;
		area= Math.PI * (Math.pow(radio, 2));
		return area;*/
		return Math.PI * (Math.pow(radio, 2));
	}
	public static double getAreaTriangulo(double base, double altura) {
		double area;
		area=base*altura/2;
		return area;
	}
	public static double getAreaCuadrado(double lado) {
		return lado=lado*lado;
	}
	public static void main(String[] args) {
		/*Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo.
		Pediremos que figura queremos calcular su área y según lo introducido pedirá los valores necesarios para calcular el área.
		Crea un método por cada figura para calcular cada área, este devolverá un número real. Muestra el resultado por pantalla*/
		
		Scanner entrada = new Scanner(System.in);
		boolean OpcionCorrecta=false;
		/*double area;*/
		double area;
		do {
			System.out.println("Selecciona una figura:");
			System.out.println("1- Circulo");
			System.out.println("2- Triangulo");
			System.out.println("3- Cuadrado");
			int opcionElegida = entrada.nextInt();
			
			switch(opcionElegida) {
			case 1:
				System.out.println("Introduce el radio del circulo");
				double radio = entrada.nextDouble();
				/*area =getAreaCirculo(radio);*/
				System.out.printf("El area del circulo  es %.2f: ",getAreaCirculo(radio) /*area*/);
				//Para reducir los decimas se usa el printf y en vez de + una coma
				break;
			case 2:
				System.out.println("Introduce la base del triangulo");
				double base=entrada.nextDouble();
				System.out.println("Introduce la altura del triangulo");
				double altura=entrada.nextDouble();
				area=getAreaTriangulo(base, altura);
				System.out.println("El area del triangulo es : "+ area);
				break;
			case 3:
				System.out.println("Introduce el lado del cuadrado");
				double lado=entrada.nextDouble();
				System.out.println("El area del cuadrado es : " + getAreaCuadrado(lado));
				break;
				default:
					System.out.println("La opcion elegida no es correcta");
			}
		}while(OpcionCorrecta == false);
		entrada.close();
	}
}
