package com.vitor.cursojava.catalogocarro;

import java.util.ArrayList;

public class Catalogo {
	ArrayList<Carros> listaDeCarros = new ArrayList<>();
	
	//adicionar carro novo
	public void adicionarCarro(Carros carros) {
		listaDeCarros.add(carros);
	}
	
	//mostrar carros
	
	public void mostrarCatalogo() {
		for(Carros c : listaDeCarros) {
			c.exibirInfo();
		}
	}
}
