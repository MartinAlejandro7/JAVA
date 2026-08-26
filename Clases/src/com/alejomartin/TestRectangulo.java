package com.alejomartin;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(5, 4);
		
		
		
		int resultadoArea = r1.calcularArea();
		System.out.println("La base de r1 es: " + r1.getBase());
		System.out.println("La altura de r1 es : " + r1.getAltura());
		
		System.out.println("el resultado del primer r1 es : " + resultadoArea);
		
		Rectangulo r2 = new Rectangulo(9,7 );
		
		int resultadoArea2 = r2.calcularArea();
		System.out.println("La base de r2 es: " + r2.getBase());
		System.out.println("La altura de r2 es : " + r2.getAltura());
		
		System.out.println("el resultado del primer r1 es : " + resultadoArea2);
		
		
		Rectangulo p1 = new Rectangulo(2, 4);
		
		
		double resultado = p1.calcularPerimetro();
		System.out.println("La base de p1 es: " + p1.getBase());
		System.out.println("La altura de p1 es : " + p1.getAltura());
		
		System.out.println("el resultado del primer p1 es : " + resultado);
		
		
		
			
		
	}


}
