package com.vitor.cursojava.aula25;

public class testeCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numeroPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		
		System.out.println(van.marca);
		
		van.exibirAutonomia();
	}

}
