package com.alejomartin;

public class Cuadrado {
	private int lado;
	
	public double calcularArea() {
		double areaCuadrado = lado * lado;
		return areaCuadrado;
	}
	
	public double calcularPerimetro() {
		double resultPerimetro = lado * 4;
		return resultPerimetro;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
}
