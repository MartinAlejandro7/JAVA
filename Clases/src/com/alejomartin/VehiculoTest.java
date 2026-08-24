package com.alejomartin;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v;
		
		v = new Vehiculo();
		
		System.out.println("======Vehiculo 1: Creado======");
		
		System.out.println("Año: "+v.anio);
		System.out.println("Marca: "+v.marca);
		System.out.println("Modelo: "+v.modelo);
		
		System.out.println("======Vehiculo 1: Valor Asignado========");
		
		v.anio = "2012" ;
		v.marca = "Toyota";
		v.modelo = "Nuevo";
		
		System.out.println("Año: "+v.anio);
		System.out.println("Marca: "+v.marca);
		System.out.println("Modelo: "+v.modelo);
		
		System.out.println("======Vehiculo 1: Creado======");
		Vehiculo v2 = new Vehiculo();
		
		System.out.println("Año: "+v2.anio);
		System.out.println("Marca: "+v2.marca);
		System.out.println("Modelo: "+v2.modelo);
		
		System.out.println("======Vehiculo 2: Valor Asignado========");
		
		v2.anio = "2024" ;
		v2.marca = "Chevrolet";
		v2.modelo = "SemiNuevo";
		
		
		
		System.out.println("Año: "+v2.anio);
		System.out.println("Marca: "+v2.marca);
		System.out.println("Modelo: "+v2.modelo);
		
	}

}
