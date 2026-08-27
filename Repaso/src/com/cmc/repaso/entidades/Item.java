package com.cmc.repaso.entidades;

public class Item {
	String nombre;
	int productosActuales; 
	int productosDevueltos;
	int productosVendidos;
	
	
	
		public void imprimir() {
		    System.out.println("===== INFORMACION DEL ITEM =====");
		    System.out.println("Nombre : " + nombre);
		    System.out.println("Productos actuales : " + productosActuales);
		    System.out.println("Productos vendidos : " + productosVendidos);
		    System.out.println("Productos devueltos: " + productosDevueltos);
		    System.out.println("================================");
		}
	
	
	public void vender(int cantidad) {
		this.productosVendidos= productosVendidos + cantidad ;
		this.productosActuales = productosActuales- cantidad;
		
	}
	
	public void devolver(int cantidad) {
		this.productosVendidos= productosVendidos - cantidad ;
		this.productosActuales = productosActuales + cantidad;
		this.productosDevueltos = productosDevueltos + cantidad ;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
}
