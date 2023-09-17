package colecciones;

import java.util.ArrayList;

public class PruebasArrayList {

	public static void main(String[] args) {
			ArrayList <Integer> miArrayList = new ArrayList<>();
			
			miArrayList.add(4);
			miArrayList.add(3);
			miArrayList.add(1);
			miArrayList.add(6);
			
			//System.out.println(miArrayList.size());
			miArrayList.remove(2);
			//System.out.println(miArrayList.size());
			
			for(int elemento : miArrayList ) {
				System.out.println(elemento);
			}
			
			System.out.println(miArrayList.get(1));
			miArrayList.clear();
			

	}

}
