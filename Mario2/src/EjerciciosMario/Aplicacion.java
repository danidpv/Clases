package EjerciciosMario;

public class Aplicacion extends BD{
  	
 /*Clase Aplicacion
 	Datos: 
 		Nombre aplicacion, version
 	Operaciones:
 		Solicitar datos,insertar datos,cerrar sesion*/
	//Atributos
	private String nombreAplicacion;
	private int version;
	//Constructor
	public Aplicacion(String nombreAplicacion, int version,String direccion, int puerto, String nombreUsuario, String password) {
		super(direccion,puerto,nombreUsuario,password);
		
		this.nombreAplicacion = nombreAplicacion;
		this.version = version;
	}
	//Operaciones

	//Getter and Setters
	public String getNombreAplicacion() {
		return nombreAplicacion;
	}

	public void setNombreAplicacion(String nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
}
