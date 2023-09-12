package EjerciciosMario;

public class UsaPersona {

	public static void main(String[] args) {
		// Instanciamos clase direccion, creamos el objeto direccion
		Direccion direccion = new Direccion("calle 1", "sevilla", 11458);
		// Instanciamos la clase persona.Con la implementacion de la composicion direccion en constructor.
		Persona p1 = new Persona(20,"Pepe","2548545a", direccion);
		//Cuando ya tenemos la composicion de las clases realizadas, podemos instanciar un objeto nuevo con las dos clases.
		Direccion d = p1.VerDireccion();
		System.out.println(d.getCiudad() + d.getCalle() +  d.getCp());
	}

}
