package com.alejomartin;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		r1.altura = 5;
		r1.base = 4;
		
		int resultadoArea = r1.calcularArea();
		
		System.out.println("el resultado es: " + resultadoArea);
		
		Rectangulo r2 = new Rectangulo();
		r2.altura = 8;
		r2.base = 2;
		int resultadoArea2 = r2.calcularArea();
		System.out.println("el resultado es: " + resultadoArea2);
		
		Rectangulo p1 = new Rectangulo();
		p1.altura = 2;
		p1.base = 4;
		
		double resultado = p1.calcularPerimetro();
		System.out.println("el resultado del perimetro es: "+resultado);
		
		
			
		
	}


}
