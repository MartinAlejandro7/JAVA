package com.alejomartin;

public class TestFecha {

	public static void main(String[] args) {
		Fecha f1 = new Fecha(15, 2, 2026);
		
		System.out.println("FECHA NUMERO UNO");
		
		System.out.println("el dia es: "+f1.getDia());
		System.out.println("el mes es: "+f1.getMes());
		System.out.println("el año es: "+f1.getAnio());
		
		System.out.println("FECHA NUMERO DOS");
		
		Fecha f2 = new Fecha(1, 7, 2027);
		
		
		System.out.println("el dia es: "+f2.getDia());
		System.out.println("el mes es: "+f2.getMes());
		System.out.println("el año es: "+f2.getAnio());

	}

}
