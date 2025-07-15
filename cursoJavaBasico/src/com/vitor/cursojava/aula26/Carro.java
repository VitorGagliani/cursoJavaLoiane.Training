package com.vitor.cursojava.aula26;

public class Carro {

	String marca;
	String modelo;
	int numeroPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	double obterAutonomia() {
		System.out.println("Metodo obter autonomia chamado");
		return capCombustivel * consumoCombustivel;
	} 
	
}
