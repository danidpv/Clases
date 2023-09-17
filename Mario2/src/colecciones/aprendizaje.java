package colecciones;

import java.util.ArrayList;

public class aprendizaje {
	/*VAMOS A VER LAS LISTAS Y LOS MAPS, PRIMERO LISTAS
	 * UNA LISTA SE PODRIA DECIR QUE SON MATRICES EN LAS QUE PUEDEN GUARDAR GRANDES COSAS
	 * 
	 * CREAR UNA LISTA: ArrayList <String, Integer, etc.> miArrayList = new ArrayList<>();
	 * Para añadir a una lista: miArraylist.add();
	 * Para ver el tamaño: miArrayList.size(); en un syso
	 * Para eliminar (indices): miArrayList.remove(indice a eliminar);
	 * Para obtener un indice de una lista: miArrayList.get(indice requerido);
	 * Para eliminar al completo una lista: miArrayList.clear();
	 * RECORRER UN LIST foreach: for(int nombre : miArrayList){ syso(elemento)}
	 *  -------->Importante<--------
	 *  Podemos instanciar la clase list en otra clase y usarla.
	 *  Ejemplo: public class Persona {
	 	private String nombre;
	 	private int edad;
	 	private ArrayList <String> Moviles = new ArrayList<>();
		public Persona(String n, int e,ArrayList m) {
		this.nombre =n ;
		this.edad = e;
		this.Moviles = m;		
	}
		public String toString() {
		return "Nombre: "+this.nombre+" Edad: "+this.edad;
	}
		public void verMoviles() {
		for(String m : this.Moviles) {
			System.out.println(m);
		}
		------->La clase MAIN<-------
			public static void main(String[] args) {
		ArrayList<String> moviles = new ArrayList<>();
		moviles.add("65767568");
		moviles.add("876876876");
		Persona p1 = new Persona ("Pepe",33,moviles);
		p1.verMoviles();
	 * 
	 */
}
