package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validacion V1 = new Validacion();
		
		
		System.out.println("Es: "+V1.validarMonto(100));
		System.out.println("ES: "+V1.validarMonto(-50));
	}

}
