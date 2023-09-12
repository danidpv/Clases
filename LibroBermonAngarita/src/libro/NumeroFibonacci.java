package libro;

public class NumeroFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escribir un programa que calcule los primeros n números de
		Fibonacci. Los números de Fibonacci comienzan con 0 y 1, y cada
		término siguiente es la suma de los anteriores: 0, 1, 2, 3, 5, 8, 13,
		21,*/
		 int serie = 10;
	        for (int i = 0; i < serie; i++) {
	            System.out.println(fibonacciRecursivo(i));
	        }
	    }
	    public static int fibonacciRecursivo(int n) {
	 
	        //CASO BASE, si es cero devuelve un cero
	        //Puedes poner n<=0 tamvien para incluir negativos
	        if (n == 0) {
	            return 0;
	            //CASO BASE, si es 1 devuelve un 1    
	        } else if (n == 1) {
	            return 1;
	        } else {
	            //Hago la suma
	            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
	        }
	    }
	}

