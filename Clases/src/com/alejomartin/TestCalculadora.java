package com.alejomartin;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		int r1;
		r1 = c1.sumar(7, 9);
		
		System.out.println("el resultado es: "+ r1);
		
		int r2;
		r2 = c1.restar(10, 9);
		System.out.println("el resultado es: "+ r2);
		
		double r3;
		r3 = c1.multiplicar(10,5);
		System.out.println("el resultado es: "+ r3);
	}
	
		

}
