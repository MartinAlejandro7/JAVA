package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto P1 = new Producto(2584, "PAPAS" );
		P1.setDescripcion("papas fritas");
		P1.setPeso(8.1);
		
		System.out.println("El codigo el Producto es: "+P1.getCodigo());
		System.out.println("El codigo el Nombre es: "+P1.getNombre());
		System.out.println("El codigo el Descripcion es: "+P1.getDescripcion());
		System.out.println("El codigo el Peso es: "+P1.getPeso());
	}

}
