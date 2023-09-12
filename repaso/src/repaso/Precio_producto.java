package repaso;

import java.util.Scanner;

public class Precio_producto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Lee un número por teclado que pida el precio de un producto (puede tener decimales)
		y calcule el precio final con IVA.
		El IVA sera una constante que sera del 21%*/
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un precio");
		double producto = entrada.nextDouble();
		final double IVA=0.21;
		double precio_final=producto+(producto*IVA);
		System.out.println("El precio con IVA es : " + precio_final);
	}

}
