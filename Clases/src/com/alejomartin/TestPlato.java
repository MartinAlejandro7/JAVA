package com.alejomartin;

public class TestPlato {

	public static void main(String[] args) {
		Plato platoA = new Plato("Camarones Apanados","Entrada",250,true);
		
		
		
		System.out.println("### PLATO A ###");
		System.out.println("Nombre: "+platoA.getNombre());
		System.out.println("Tipo: "+ platoA.getTipo());
		System.out.println("Precio: "+ platoA.getPrecio());
		System.out.println("Disponible: "+ platoA.isDisponible());
		
		
		Plato platoB = new Plato("Lomo Saltado","Plato Fuerte",270,true);
		
		System.out.println("### PLATO B###");
		System.out.println("Nombre: "+platoB.getNombre());
		System.out.println("Tipo: "+ platoB.getTipo());
		System.out.println("Precio: "+ platoB.getPrecio());
		System.out.println("Disponible: "+ platoB.isDisponible());
		
		Plato platoC = new Plato("Torta De Zanahoria","Postre",50,true);
		
		
		System.out.println("### PLATO Cs###");
		System.out.println("Nombre: "+platoC.getNombre());
		System.out.println("Tipo: "+ platoC.getTipo());
		System.out.println("Precio: "+ platoC.getPrecio());
		System.out.println("Disponible: "+ platoC.isDisponible());
		
	}

}
