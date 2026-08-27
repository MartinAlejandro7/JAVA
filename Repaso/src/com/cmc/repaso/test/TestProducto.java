package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto p1 = new Producto("Refrigeradora", 100);
		
		p1.setPrecio(-200);
		
		
		System.out.println("El nombre del producto es: " + p1.getNombre());
		System.out.println("El precio del Producto es: "+ p1.getPrecio());
		System.out.println("El precio del Producto con descuento es: "+ p1.calcularPrecioPromo(25));
		
		
		
	
	}

}
