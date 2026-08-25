package com.alejomartin;

public class TestPlato {

	public static void main(String[] args) {
		Plato platoA = new Plato();
		
		platoA.setNombre("Camarones Apanados");
		platoA.setTipo("Entrada");
		platoA.setPrecio(250);
		platoA.setDisponible(true);
		
		System.out.println("### PLATO A ###");
		System.out.println("Nombre: "+platoA.getNombre());
		System.out.println("Tipo: "+ platoA.getTipo());
		System.out.println("Precio: "+ platoA.getPrecio());
		System.out.println("Disponible: "+ platoA.isDisponible());
		
		
		Plato platoB = new Plato();
		platoB.setNombre("Lomo Saltado");
		platoB.setTipo("Plato Fuerte");
		platoB.setPrecio(250);
		platoB.setDisponible(true);
		System.out.println("### PLATO B###");
		System.out.println("Nombre: "+platoB.getNombre());
		System.out.println("Tipo: "+ platoB.getTipo());
		System.out.println("Precio: "+ platoB.getPrecio());
		System.out.println("Disponible: "+ platoB.isDisponible());
		
		Plato platoC = new Plato();
		
		platoC.setNombre("Torta De Zanahoria");
		platoC.setTipo("Postre");
		platoC.setPrecio(50);
		platoC.setDisponible(true);
		System.out.println("### PLATO B###");
		System.out.println("Nombre: "+platoC.getNombre());
		System.out.println("Tipo: "+ platoC.getTipo());
		System.out.println("Precio: "+ platoC.getPrecio());
		System.out.println("Disponible: "+ platoC.isDisponible());
		
	}

}
