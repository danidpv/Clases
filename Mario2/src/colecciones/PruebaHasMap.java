package colecciones;

import java.util.HashMap;

public class PruebaHasMap {

	public static void main(String[] args) {
		HashMap <String,String> miHashMap = new HashMap<>();
		miHashMap.put("33A","Pepito");
		miHashMap.put("45B","Paco");
		miHashMap.put("53F","Manolo");
		//System.out.println(miHashMap);
		for(String clave : miHashMap.keySet()) {
			System.out.println("Clave: "+clave+ " - Valor: "+ miHashMap.get(clave));
		}
		System.out.println(miHashMap.size());
		miHashMap.clear();	
	}
}