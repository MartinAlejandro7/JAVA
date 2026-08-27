package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante a1 = new Estudiante("Marcos");
		Estudiante a2 = new Estudiante("Maria");
		;
		
		a1.Calificar(5);
		a2.Calificar(8);
		
		System.out.println("Nombre del estudiante: "+a1.getNombre());
		System.out.println("Nota: " + a1.getNota());
		System.out.println("Nombre del estudiante: "+a1.getResultado());
		
		System.out.println("Nombre del estudiante: "+a2.getNombre());
		System.out.println("Nota: " + a2.getNota());
		System.out.println("Nombre del estudiante: "+a2.getResultado());
	}
	

}
