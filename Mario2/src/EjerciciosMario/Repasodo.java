package EjerciciosMario;

public class Repasodo {

	public static void main(String[] args) {
		/* Generar 2 matrices con numeros aleatorios, sacar los valores de la diagonal de las 2 matrices
		 * almacenar cada elemento en un array y sumar los 2 array */
		
		//Generamos dos enteros para darle valor a los indices de las matrices
		int f=3, c=3;
		int [][] matriz = new int [f][c];
		int [][] matriz2 = new int [f][c];
		//Generamos dos contadores para la suma de sus diagonales
		int contador = 0;
		int contador2=0;
		//Declaramos dos arrays para meter las sumas de las matrices
		int []arr1 = new int [3];
		int []arr2 = new int [3];
		int []suma = new int [3];
		// Generamos for para recorrer
		for(int i =0;i<f;i++) {
			for (int j=0;j<c;j++) {
				matriz[i][j] = (int)(Math.random()*11);//Recorremos las matrices con numeros aleatorios
				if(i==j){ //Generamos un if para la suma diagonal diciendo que cuando i y j esten en la misma posicion se sumen
				arr1[i] = matriz[i][j];//en nuestro primer array metemos los valores de matriz1
				}
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println(" ");
			
		}
		System.out.println(" ");
		for(int i =0; i<matriz2.length;i++) {//Recorremos el segundo matriz con .length
			for(int j=0;j<matriz2.length;j++) {
				matriz2[i][j]= (int)(Math.random()*11);
				if(i==j) {
					arr2[i] = matriz2[i][j];
				}
				
				System.out.print(matriz2[i][j]+ " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		for(int i = 0; i<suma.length;i++) {
			System.out.print(arr1[i] +" ");
		}
		System.out.println(" ");
		for(int i = 0; i<suma.length;i++) {	
			System.out.print(arr2[i]+ " ");
		}
		System.out.println(" ");
		System.out.println("La suma de los arrays con sus respectivas diagonales es : ");
		for(int i = 0; i<suma.length;i++) {	
			 suma[i] = arr1[i]+arr2[i];
			System.out.print(suma[i]+ " ");
		}

		}
	}

