package colecciones;

import java.util.HashMap;

public class mainPersona {

	public static void main(String[] args) {
		//Validar si existe o no una cuenta
		HashMap<String, Float> Cuentas = new HashMap<>();
		Cuentas.put("111",854f);
		Cuentas.put("cuenta 2",369f);
		Cuentas.put("cuenta 3",124f);
		Persona p = new Persona("Manolo", 17, "Sevilla", Cuentas);
		
		p.anadir("545454", 500);
		
		System.out.println(p.getCuentas());
		System.out.println("Valor cuenta 1 " + p.getCuenta("111"));
		System.out.println(p.eliminar("cuenta 2"));
		System.out.println(p.getCuenta("cuenta 2"));
		System.out.println(p.eliminar("cuenta 5"));
		System.out.println(p.getCuenta("cuenta 9"));
		
	}
}
