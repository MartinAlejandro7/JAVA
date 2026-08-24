package com.alejomartin;

public class TestPlato {

	public static void main(String[] args) {
		Plato platoA = new Plato();
		
		platoA.nombre = "Camarones Apanados";
		platoA.tipo = "Entrada";
		platoA.precio = 3.50f;
		platoA.disponible =  true;
		
		System.out.println("### PLATO A###");
		System.out.println("Nombre: "+platoA.nombre);
		System.out.println("Tipo: "+ platoA.tipo);
		System.out.println("Precio: "+ platoA.precio);
		System.out.println("Disponible: "+ platoA.disponible);
		
		
		Plato platoB = new Plato();
		platoB.nombre = "Lomo Saltado";
		platoB.tipo = "Plato Fuerte";
		platoB.precio = 5.10f;
		platoB.disponible =  true;
		System.out.println("### PLATO B###");
		System.out.println("Nombre: "+platoB.nombre);
		System.out.println("Tipo: "+ platoB.tipo);
		System.out.println("Precio: "+ platoB.precio);
		System.out.println("Disponible: "+ platoB.disponible);
		
		Plato platoC = new Plato();
		
		platoC.nombre = "Torta de Zanahoria";
		platoC.tipo = "Postre";
		platoC.precio = 1.50f;
		platoC.disponible =  true;
		
		System.out.println("### PLATO C###");
		System.out.println("Nombre: "+platoC.nombre);
		System.out.println("Tipo: "+ platoC.tipo);
		System.out.println("Precio: "+ platoC.precio);
		System.out.println("Disponible: "+ platoC.disponible);
		
	}

}
