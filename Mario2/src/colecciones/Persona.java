package colecciones;

import java.util.ArrayList;
import java.util.HashMap;

public class Persona {
	 private String nombre;
	 private int edad;
	 private String direccion;
	 private HashMap<String, Float> Cuentas = new HashMap<>();//Creamos un map
			
	// Operaciones para consultar, añadir cuentas corrientes dentro de la clase
	public Persona(String nombre, int edad, String direccion, HashMap<String, Float> cuentas) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.Cuentas = cuentas;
	}
	//OPERACIONES
	public String Consultar() {//consultar
		return "Usuario "+ this.nombre + "cuenta "+ this.Cuentas;
	}
	public void añadirCuentas(HashMap<String, Float> cuentas) {//añadir
		this.Cuentas=cuentas;
	}
	public float getCuenta(String cuenta) {
		 Float valor= Cuentas.get(cuenta);
		if(Cuentas.get(cuenta)==null) {
			return -1.0f;
		}else {
			return valor;
		}
	}
	public boolean eliminar(String cuenta) {
		if(Cuentas.remove(cuenta)==null) {
			return false;
		}else {
		return true;
		}
	}
	public boolean anadir(String cuenta, float valor) {
		Cuentas.put(cuenta, valor);
		return true;
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
	public HashMap<String, Float> getCuentas() {
		return Cuentas;
	}
	//ToString
	public String toString() {
		return "Nombre "+ this.getNombre()+ "edad " + this.getEdad()+ " cuenta de " + this.Cuentas;
	}
}
