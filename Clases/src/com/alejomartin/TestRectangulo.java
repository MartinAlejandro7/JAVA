package com.alejomartin;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		
		r1.setAltura(5);
		r1.setBase(4);
		
		int resultadoArea = r1.calcularArea();
		System.out.println("La base de r1 es: " + r1.getAltura());
		System.out.println("La altura de r1 es : " + r1.getBase());
		
		System.out.println("el resultado del primer r1 es : " + resultadoArea);
		
		Rectangulo r2 = new Rectangulo();
		r2.setAltura(9);
		r2.setBase(7);
		
		int resultadoArea2 = r2.calcularArea();
		System.out.println("La base de r1 es: " + r2.getAltura());
		System.out.println("La altura de r1 es : " + r2.getBase());
		
		System.out.println("el resultado del primer r1 es : " + resultadoArea2);
		
		
		Rectangulo p1 = new Rectangulo();
		p1.setAltura(2) ;
		p1.setBase(4);
		
		double resultado = p1.calcularPerimetro();
		System.out.println("La base de r1 es: " + p1.getAltura());
		System.out.println("La altura de r1 es : " + p1.getBase());
		
		System.out.println("el resultado del primer r1 es : " + resultado);
		
		
		
			
		
	}


}
