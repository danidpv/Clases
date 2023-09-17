package colecciones;

import java.util.ArrayList;
import java.util.HashMap;

public class Persona {
	 private String nombre;
	 private int edad;
	 private String direccion;
	 private HashMap<String, String> Cuentas = new HashMap<>();
			
	// Operaciones para consultar, añadir cuentas corrientes dentro de la clase
	public Persona(String nombre, int edad, String direccion, HashMap<String, String> cuentas) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.Cuentas = cuentas;
	}
	//OPERACIONES
	public String Consultar() {//consultar
		return "Usuario "+ this.nombre + "cuenta "+ this.Cuentas;
	}
	public void añadirCuentas(HashMap<String, String> cuentas) {//añadir
		this.Cuentas=cuentas;
	}
	
	//GETTER AND SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public HashMap<String, String> getCuentas() {
		return Cuentas;
	}
	public void setCuentas(HashMap<String, String> cuentas) {
		Cuentas = cuentas;
	}
	
	public String toString() {
		return "Nombre "+ this.getNombre()+ "edad " + this.getEdad()+ " cuenta de " + this.Cuentas;
	}
}
