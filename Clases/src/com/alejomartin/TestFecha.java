package com.alejomartin;

public class TestFecha {

	public static void main(String[] args) {
		Fecha f1 = new Fecha();
		
		f1.setDia(1);
		f1.setMes(7);
		f1.setAnio(2026);
		
		System.out.println("el dia es: "+f1.getDia());
		System.out.println("el mes es: "+f1.getMes());
		System.out.println("el año es: "+f1.getAnio());

	}

}
