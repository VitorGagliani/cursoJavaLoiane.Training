package com.vitor.cursojava.aula26;

public class testeCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numeroPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		
		System.out.println(van.marca);
		
		double autonomia = van.obterAutonomia();
		System.out.println("Autonomia do carro é: "+autonomia);
	}

}
