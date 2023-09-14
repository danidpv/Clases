package Colecciones;

import java.util.ArrayList;

public class ArrayListObjeto {
	
	public static void main(String[] args) {
		ArrayList<String> moviles = new ArrayList<>();
		moviles.add("65767568");
		moviles.add("876876876");
		Persona p1 = new Persona ("Pepe",33,moviles);
		p1.verMoviles();
	

	}

}
