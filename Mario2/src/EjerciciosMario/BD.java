package EjerciciosMario;

public class BD {
	/*
Objetos
 Clase BD
  Operaciones:
	*Consultar,insertar,actualizar,eliminar
  Datos:
  	Direccion IP, puerto, nombreusuario,passwd*/
	//Atributos
	private String Direccion;
	private int Puerto;
	private String nombreUsuario;
	private String password;
	//Constructor
	public BD(String direccion, int puerto, String nombreUsuario, String password) {
		
		this.Direccion = direccion;
		this.Puerto = puerto;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}
	//Operaciones
	public String toString() {
		return "Mi direccion" + this.getDireccion() + "Mi puerto " + this.getPuerto() + "El usuario es : "+
	this.getNombreUsuario() + " La contraseña es " + this.getPassword();
	}
	public void  Insertar(String Dato) {
		System.out.println("Ha sido insertado el dato : " + Dato);
	}
	public void Actualizar(String Actualizar) {
		System.out.println("Dato actualizado " + Actualizar);
	}
	public void Eliminar(String eliminar) {
		System.out.println("Ha sido eliminado "+ eliminar);
	}
	
	//Getter and Setters
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		this.Direccion = direccion;
	}
	
	public int getPuerto() {
		return Puerto;
	}
	public void setPuerto(int puerto) {
		this.Puerto = puerto;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
