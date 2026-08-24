package com.alejomartin;

public class Calculadora {
	
	public int sumar(int a, int b) {
		int respuesta = a + b;
		return respuesta;
	}

	
	public int restar(int a, int b) {
		int respuesta = a - b;
		return respuesta;
	}
	
	public double multiplicar(double valor1, double valor2) {
		double respuesta = valor1 * valor2;
		return respuesta;
	}
	
	public double dividir(double dividiendo, double divisor) {
		double respuesta = dividiendo / divisor;
		return respuesta;
	}
	
	public double promedio(double valor1, double valor2,double valor3) {
		double respuesta = (valor1 + valor2 + valor3)/3;
		return respuesta;
	}
	
	public void mostrarResultado() {
		System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
	}
}