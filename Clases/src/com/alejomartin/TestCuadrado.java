package com.alejomartin;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		c1.lado = 3;
		c2.lado = 4;
		c3.lado = 5;
		System.out.println("******CUADRADO UNO*******");
		System.out.println("el Area del Cuadrado es: "+c1.calcularArea());
		System.out.println("el perimetro del cuadrado es: "+ c1.calcularPerimetro());
		
		System.out.println("******CUADRADO DOS*******");
		System.out.println("el Area del Cuadrado es: "+c2.calcularArea());
		System.out.println("el perimetro del cuadrado es: "+ c2.calcularPerimetro());
		
		System.out.println("******CUADRADO TRES*******");
		System.out.println("el Area del Cuadrado  es: "+c3.calcularArea());
		System.out.println("el perimetro del cuadrado es: "+ c3.calcularPerimetro());

	}

}
