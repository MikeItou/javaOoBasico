package com.testAutomationCoach.dEncapsulacion;

import libs.Input;

public class Automovil {
	//Atributos
	
	private String marca;
	private double velocidadActual;
	private double maximaVelocidad;
	private String tipoDeTransmision;
	private int numDePuertas;
	private int numDeLlantas;
	private boolean banderaEndendidoApagado;
	private double litrosGasolina;

	public Automovil() {
		marca = "Ford";
		velocidadActual = 0.0;
		maximaVelocidad = 200.0;
		tipoDeTransmision = "Manual";
		numDePuertas = 2;
		numDeLlantas = 4;
		litrosGasolina = 20.0;
	}

	public Automovil (String marca, double maximaVel, String tipoTransmision, int numPuertas, int numLlantas, double litrosGasolina) {
		this.marca = marca;
		this.velocidadActual = 0.0;
		this.maximaVelocidad = maximaVel;
		this.tipoDeTransmision = tipoTransmision;
		this.numDePuertas = numPuertas;
		this.numDeLlantas = numLlantas;
		this.litrosGasolina = litrosGasolina;
	}

	//comportamiento
	public void acelerar() {
		if (this.banderaEndendidoApagado==true && this.litrosGasolina >= 0.01){
			if (this.velocidadActual==this.maximaVelocidad){
				System.out.println("Has llegado al limite de velocidad maximo, ya no puedes acelerar mas");
			}
			else{
				Input.print("Run Run aumento de velocidad\n");
				this.velocidadActual += 5.0;
				this.litrosGasolina -= 0.01;
			}
		}
		else if (this.banderaEndendidoApagado==true && this.litrosGasolina == 0.01){
			if (this.velocidadActual==this.maximaVelocidad){
				System.out.println("Has llegado al limite de velocidad maximo, ya no puedes acelerar mas. Ya solo tienes "+this.litrosGasolina+" litros de gasolina. Es urgente que recargues tu tanque");
				this.banderaEndendidoApagado=false;
			}
			else{
				System.out.println("Esta sera tu ultima aceleracion ya que te has quedado sin gasolina, poco a poco iras bajando tu velocidad. Es urgente que recargues tu tanque");
				this.velocidadActual += 5.0;
				this.litrosGasolina -= 0.01;
				this.banderaEndendidoApagado=false;
			}
		}
		else if (this.banderaEndendidoApagado==false) {
			System.out.println("La aceleración no tiene efecto alguno debido a que no has encendido tu automovil");
		}
	}
	
	public void frenarTotal() {
		if (this.banderaEndendidoApagado==true){
			Input.print("Screeeeech! Has frenado\n");
			this.velocidadActual = 0;
		}
		else{
			System.out.println("El frenado no surte efecto debido a que no has encendidto tu automovil");
		}
	}
	
	public void retroceder() {
		Input.print("piii piii piii piii\n");
		this.velocidadActual -= -5;
	}
	
	public double getVelocidad() {
		return this.velocidadActual;
		
	}

	public void encenderAutomovil(){
		if (this.litrosGasolina >= 0.01){
			if (this.banderaEndendidoApagado == false)
				this.banderaEndendidoApagado = true;
			else
				System.out.println("Su auto esta encendido actualmente, no hay necesidad de realizar esta acción nuevamente");
		}
		else{
			System.out.println("No hay suficiente gasolina para encender el automovil");
		}
	}

	public void apagarAutomovil(){
		if (this.banderaEndendidoApagado == true)
			this.banderaEndendidoApagado = false;
		else
			System.out.println("Su auto esta apagado actualmente, no hay necesidad de realizar esta acción nuevamente");
	}

	public void frenarLento(){
		if (this.banderaEndendidoApagado == true && this.velocidadActual >= 10){
			this.velocidadActual -=10;
			}
		else if (this.banderaEndendidoApagado == true && this.velocidadActual < 10){
			this.velocidadActual = 0;
		}
		else if (this.banderaEndendidoApagado == false){
			System.out.println("Su auto esta apagado actualmente, debido a esto no puede frenar.");
		}

		//agrgar mas condicionales para completar esta funion de frenado lento...
	}
}
