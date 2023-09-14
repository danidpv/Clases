package EjerciciosMario;

public class Funcion {
	//Una funcion para crear un array, la funcion devuelve el array al main 
    // Otra funcion para contar los positivos, devuelve un entero
    // Otra funcion para contar los negativos, devuelve un entero
    // Otra funcion para contar los ceros, devuelve un entero
public static  int[] arr() {
	int [] arr1 = new int[10];
	for(int i =0;i<arr1.length;i++) {
		arr1[i]= (int)(Math.random()*21)-10;
	}
	return arr1;
}

public static int positivos(int []arr) {
	int positivos =0;
	for(int i =0;i<arr.length;i++) {
		if(arr[i]>0) {
			positivos++;
		}
	}
	return positivos;
	
}
public static int negativos(int[]arr) {
	int negativos =0;
	for(int i =0;i<arr.length;i++) {
		if(arr[i]<0) {
			negativos++;
		}
	}
	return negativos;
}
public static int ceros(int[] arr) {
	int ceros=0;
	for(int i =0; i==arr.length;i++) {
		if(arr[i]==0) {
			ceros++;
		}
	}
	return ceros;
}
public static void mostrarArray(int []arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i] + " ");
	}
}
	public static void main(String[] args) {
	int [] arr = new int [10];
	
	arr=arr();
	System.out.println("Array completado");
	mostrarArray(arr);
	System.out.println(" ");
	int positivos= positivos(arr);
	int negativos =negativos(arr);
	int ceros=ceros(arr);
	
	System.out.println("Numeros positivos " + positivos);
	System.out.println("Numeros negativos "+ negativos);
	System.out.println("Numeros a cero " + ceros);
	
	}

}
