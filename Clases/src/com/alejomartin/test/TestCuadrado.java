package com.alejomartin.test;

import com.alejomartin.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		c1.setLado(3);
		c2.setLado(4);
		c3.setLado(5);
		System.out.println("******CUADRADO UNO*******");
		System.out.println("el Lado del Primer Cuadrado es: "+c1.getLado());
		System.out.println("el Area del Cuadrado es: "+c1.calcularArea());
		System.out.println("el perimetro del cuadrado es: "+ c1.calcularPerimetro());
		
		System.out.println("******CUADRADO DOS*******");
		System.out.println("el Lado del Segundo Cuadrado es: "+c2.getLado());
		System.out.println("el Area del Cuadrado es: "+c2.calcularArea());
		System.out.println("el perimetro del cuadrado es: "+ c2.calcularPerimetro());
		
		System.out.println("******CUADRADO TRES*******");
		System.out.println("el Lado del Tercer Cuadrado es: "+c3.getLado());
		System.out.println("el Area del Cuadrado  es: "+c3.calcularArea());
		System.out.println("el perimetro del cuadrado es: "+ c3.calcularPerimetro());

	}

}
