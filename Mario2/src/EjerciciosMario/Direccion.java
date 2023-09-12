package EjerciciosMario;
//VAMOS A PRACTICAR LA COMPOSICION
public class Direccion {
	private String calle;
	private int cp;
	private String ciudad;
	//Constructor
	public Direccion(String c, String calle, int cp) {
		this.calle=calle;
		this.ciudad=c;
		this.cp=cp;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle=calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad=ciudad;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp=cp;
	}
}
