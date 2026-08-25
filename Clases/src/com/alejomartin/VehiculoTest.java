package com.alejomartin;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v;
		
		v = new Vehiculo();
		
		System.out.println("======Vehiculo 1: Creado======");
		
		System.out.println("Año: "+v.getAnio());
		System.out.println("Marca: "+v.getMarca());
		System.out.println("Modelo: "+v.getModelo());
		System.out.println("Valor: "+v.getValor());
		
		System.out.println("======Vehiculo 1: Valor Asignado========");
		
		v.setAnio("2026");  
		v.setMarca("Toyota");
		v.setModelo("Nuevo");
		v.setValor(200);
		
		System.out.println("Año: "+v.getAnio());
		System.out.println("Marca: "+v.getMarca());
		System.out.println("Modelo: "+v.getModelo());
		System.out.println("Valor: "+v.getValor());
		
		System.out.println("======Vehiculo 2: Creado======");
		Vehiculo v2 = new Vehiculo();
		
		System.out.println("Año: "+v2.getAnio());
		System.out.println("Marca: "+v2.getMarca());
		System.out.println("Modelo: "+v2.getModelo());
		System.out.println("Valor: "+v2.getValor());
		
		System.out.println("======Vehiculo 2: Valor Asignado========");
		
		v2.setAnio("2020");  
		v2.setMarca("Chevrolet");
		v2.setModelo("Seminuevo");
		v2.setValor(1200);
		
		
		
		System.out.println("Año: "+v2.getAnio());
		System.out.println("Marca: "+v2.getMarca());
		System.out.println("Modelo: "+v2.getModelo());
		System.out.println("Valor: "+v2.getValor());
		
	}

}
