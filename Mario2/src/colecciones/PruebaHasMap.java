package colecciones;

import java.util.HashMap;

public class PruebaHasMap {

	public static void main(String[] args) {
		HashMap <String,String> miHashMap = new HashMap<>();//Creamos el map, en el cual van dos string
		miHashMap.put("33A","Pepito");//con esta funcion metemos los dos string
		miHashMap.put("45B","Paco");
		miHashMap.put("53F","Manolo");
		//System.out.println(miHashMap);
		for(String clave : miHashMap.keySet()) {//es un for each
			System.out.println("Clave: "+clave+ " - Valor: "+ miHashMap.get(clave));
		}
		System.out.println(miHashMap.size());// Para ver el tamaño
		miHashMap.clear();	//Para borrar el map por completo
	}
}
