package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");
		cuenta3.setSaldo(800);

		System.out.println("-------- Valores Iniciales ---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
	
		Cuenta cuenta4 = new Cuenta("04789");
		cuenta4.setSaldo(789);
		Cuenta cuenta5 = new Cuenta("08795", "B", 98);
		Cuenta cuenta6 = new Cuenta("09782");
		cuenta6.setTipo("C");
		cuenta6.setSaldo(80);
	
		System.out.println("-------- Cuentas Adicionales ---------");
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();

	}
}
