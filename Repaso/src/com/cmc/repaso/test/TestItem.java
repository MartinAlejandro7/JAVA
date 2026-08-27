package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item i = new Item();
		i.setNombre("Consola VideoJuegos");
		i.setProductosActuales(20);
		i.setProductosVendidos(15);
		i.setProductosDevueltos(5);
		i.imprimir();
		
		i.vender(4);
		i.imprimir();
		
		i.devolver(3);
		i.imprimir();
		
	}

}
