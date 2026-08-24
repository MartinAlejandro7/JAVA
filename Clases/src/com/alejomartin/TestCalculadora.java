package com.alejomartin;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		int r1;
		r1 = c1.sumar(7, 9);
		
		System.out.println("el resultado de la suma es: "+ r1);
		
		int r2;
		r2 = c1.restar(10, 9);
		System.out.println("el resultado de la resta es: "+ r2);
		
		double r3;
		r3 = c1.multiplicar(10,5);
		System.out.println("el resultado de la multiplicacion es: "+ r3);
		
		double r4;
		r4 = c1.dividir(10,2);
		System.out.println("el resultado de la division es: "+ r4);
		
		double r5;
		r5 = c1.promedio(10, 8, 9);
		System.out.println("el resultado del promedio es: "+ r5);
		
		c1.mostrarResultado();
		
	}
	
	
		

}
