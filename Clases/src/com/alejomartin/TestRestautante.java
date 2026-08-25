package com.alejomartin;

public class TestRestautante {

	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		
		rest1.setNombre("Restaurante UNO");  
		rest1.setDireccion("El teleferico"); 
		rest1.setCalificacion("200");
		System.out.println("=======RESTAURANTE 1========");
		System.out.println("nombre de restaurante: "+ rest1.getNombre());
		System.out.println("direccion del restaurante: "+ rest1.getDireccion());
		System.out.println("calificacion al restarate: "+ rest1.getCalificacion());
		
		Restaurante rest2 = new Restaurante();
		
		rest2.setNombre("Restaurante DOS");  
		rest2.setDireccion("La Mañozca"); 
		rest2.setCalificacion("550");
		System.out.println("=======RESTAURANTE 1========");
		System.out.println("nombre de restaurante: "+ rest2.getNombre());
		System.out.println("direccion del restaurante: "+ rest2.getDireccion());
		System.out.println("calificacion al restarate: "+ rest2.getCalificacion());
		

	}

}
