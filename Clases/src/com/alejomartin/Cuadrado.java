package com.alejomartin;

public class Cuadrado {
	int lado;
	
	public double calcularArea() {
		double areaCuadrado = lado * lado;
		return areaCuadrado;
	}
	
	public double calcularPerimetro() {
		double resultPerimetro = lado * 4;
		return resultPerimetro;
	}
}
