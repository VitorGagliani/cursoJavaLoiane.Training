package com.vitor.cursojava.aula24;

public class testeCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numeroPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		
		System.out.println(van.marca);
		
		Carro fusca = new Carro();
		fusca.marca = "Fiat";
		fusca.modelo = "Ducato";
		fusca.numeroPassageiros = 10;
		fusca.capCombustivel = 100;
		fusca.consumoCombustivel = 0.2;
	}

}
