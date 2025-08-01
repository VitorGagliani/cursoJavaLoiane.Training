package com.vitor.cursojava.catalogocarro;

public class Main {

	public static void main(String[] args) {

		Catalogo catalogo = new Catalogo();
		
		Carros carro1 = new Carros("Civic", "Honda", 2020);
		Carros carro2 = new Carros("320i", "Bmw", 2023);
		
		//adicionar ao catalogo
		
		catalogo.adicionarCarro(carro1);
		catalogo.adicionarCarro(carro2);
		
		catalogo.mostrarCatalogo();

	}

}
