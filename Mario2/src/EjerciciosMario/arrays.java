package EjerciciosMario;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				
				for(int i =0;i<f;i++) {
					for (int j=0;j<c;j++) {
						matriz[i][j] = (int)(Math.random()*11);
						matriz2[i][j] = (int)(Math.random()*11);//Recorremos las matrices con numeros aleatorios
						System.out.print(matriz[i][j] + " ");
						System.out.println("  ");
						System.out.print(matriz2[i][j]);
						if(i==j){ //Generamos un if para la suma diagonal diciendo que cuando i y j esten en la misma posicion se sumen
						contador = contador + matriz[i][j];//Decimos que contador es igual a la matriz de i y j
						arr1[i] = matriz[i][j];//en nuestro primer array metemos los valores de matriz1
						contador2 = contador2 + matriz2[i][j];
						arr2[i] = matriz2[i][j];
						int []suma = new int [3];
						suma[3] = arr1[i]+arr2[i];
						System.out.println("La suma de los dos arrays es = " +suma[i]);
						}
					}
					System.out.println(" ");
				}
				System.out.println("Primera suma diagonal de matriz 1 : "+ contador);
				System.out.println(" ");
				System.out.println("Primera suma diagonal de matriz 1 : "+ contador2);
	}

}
