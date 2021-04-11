package com.testAutomationCoach.dEncapsulacion;

public class EjemploAutomovil {

	public static void main(String[] args) {
		Automovil ford = new Automovil();
		ford.acelerar();
		ford.frenarTotal();
		ford.retroceder();

		Automovil ferrari = new Automovil("ferrari", 500.0,"Manual",2,4,120.0);
		ferrari.acelerar();
		ferrari.frenarTotal();
		ferrari.retroceder();
	}

}
