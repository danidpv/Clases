package EjerciciosMario;

public class Persona {
	private int edad;
	private String nombre;
	private String dni;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni=dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void  setNombre(String nombre) {
		this.nombre=nombre;
	}
	/*Creamos la clase persona en la cual vamos a usar la composicion en java, en la que podemos instanciar un objeto y ese objeto ser 
 * llamado a traves de otra clase para poder ser usado y darle distintos valores o componer ciertos atributos y metodos en otra clase*/
	//-----------------------------------------------------------
	//La composicion sera la clase direccion, una vez ya creada el objeto.
	private Direccion direccion; //La composicion la metemos como "atributo"
	//Una vez tenemos el "atributo-objeto" de la clase direccion osea la composicion, creamos el constructor
	public Persona(int e,String nombre, String dni,Direccion d) {
		this.edad=e;
		this.nombre=nombre;
		this.dni=dni;
		this.direccion=d;
	}
	//Creamos el getter de direccion
	public Direccion VerDireccion() {
		return direccion;
	}
	public void Direccion(Direccion direccion) {
		this.direccion=direccion;
	}
	
}
