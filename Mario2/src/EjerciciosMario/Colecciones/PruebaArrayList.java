package Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PruebaArrayList {

	public static void main(String[] args) {
	
		ArrayList<String> cars = new ArrayList<String>();
		 cars.add("Volvo");
		 cars.add("BMW");
		 cars.add("Ford");
		 cars.add("Mazda");
		System.out.println(cars.size());
		Collections.reverse(cars);
		
		System.out.println(cars);
		Collections.shuffle(cars);
		System.out.println(cars);
		cars.clear();
		System.out.println(cars);
		
		Map <Integer,String> miMap = new HashMap<Integer,String>();
		
		//[1:"cadena1"]
		//[2:"cadena2"]
		//[3:"cadena3"]

		miMap.put(1, "cadena1");
		miMap.put(2, "cadena2");
		miMap.put(3, "cadena3");
		System.out.println(miMap);
		System.out.println(miMap.get(2));
		
	
	}

}
