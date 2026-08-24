package com.alejomartin;

public class TestRestautante {

	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		
		rest1.nombre = "Restaurante1";
		rest1.direccion = "El teleferico";
		rest1.calificacion = "10";
		System.out.println("=======RESTAURANTE 1========");
		System.out.println("nombre de restaurante: "+ rest1.nombre);
		System.out.println("direccion del restaurante: "+ rest1.direccion);
		System.out.println("calificacion al restarate: "+ rest1.calificacion);
		
		Restaurante rest2 = new Restaurante();
		
		rest2.nombre = "Restaurante2";
		rest2.direccion = "La Mañozca";
		rest2.calificacion = "9";
		System.out.println("=======RESTAURANTE 2========");
		System.out.println("nombre de restaurante: "+ rest2.nombre);
		System.out.println("direccion del restaurante: "+ rest2.direccion);
		System.out.println("calificacion al restarate: "+ rest2.calificacion);
		

	}

}
