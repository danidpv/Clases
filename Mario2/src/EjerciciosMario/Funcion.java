package EjerciciosMario;

public class Funcion {
	//Una funcion para crear un array, la funcion devuelve el array al main 
    // Otra funcion para contar los positivos, devuelve un entero
    // Otra funcion para contar los negativos, devuelve un entero
    // Otra funcion para contar los ceros, devuelve un entero
public static  int arr() {
	int []arr1 = new int[10];
	
	for(int i =0;i<arr1.length;i++) {
		arr1[i]= (int)(Math.random()*10);
		
		return arr1[i];
	}
	return arr1[10];
}

public static int positivos(int contador) {
	if(contador >arr()) {
		contador++;
	}
	contador = arr();
	return contador;
	
}
public static int negativos(int contador2) {
	if (contador2<0) {
		contador2++;
	}
	return contador2;
}
public static int ceros(int contador3) {
	if(contador3 ==0) {
		contador3++;
	}
	return contador3;
}
	public static void main(String[] args) {
	
	System.out.println(arr());
	System.out.println("Numeros positivos " + positivos(10));
	}

}