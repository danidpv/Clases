package EjerciciosMario;

public class Repaso {
	/*Arrays
	  Crear un array de 50 elementos, con valores enteros aleatorios entre -10 y +10
	  Recorrer el array y contar elementos positivos, negativos y ceros tiene
	*/
	public static void main(String[] args) {
		int[] miArray = new int[10]; //Declaramos y instanciamos el array asignandole valor
		//Creamos los contadores de positivos, negativos y ceros
		int positivos=0, negativos=0, ceros =0;
		//Creamos un for para recorrer el array
		for(int i =0; i<miArray.length;i++) {
			miArray[i]=(int)(Math.random()*21)-10;//Hacemos el calculo con el metodo random para los 10+, 10-
			if(miArray[i]==0) {
				ceros++;
			}else if(miArray[i]<0) {
				negativos++;
			}else if(miArray[i]>0) {
				positivos++;
			}
		}
		System.out.println(" ");
		for(int i =0; i <miArray.length;i++) {
			System.out.print(miArray[i] +" ");
		}
		System.out.println(" ");
		System.out.println("Elementos positivos : "+ positivos);
		System.out.println("Elementos negativos : "+ negativos);
		System.out.println("Elementos iguales a 0 : "+ ceros);
	}
}
