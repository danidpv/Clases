package EjerciciosMario;

public class mainBD {

	public static void main(String[] args) {
		
		Aplicacion a = new Aplicacion("eclipse",3,"433.555.444.222",6,"Daniel","clases");
		a.Actualizar("Se ha actualizado el nombre");
		System.out.println(a.toString());
	}
}
