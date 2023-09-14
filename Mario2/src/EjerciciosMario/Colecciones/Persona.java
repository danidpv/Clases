package Colecciones;

import java.util.ArrayList;

public class Persona {
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
	}
}
