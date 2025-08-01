package com.vitor.cursojava.catalogocarro;

public class Carros {
	String nome;
	String marca;
	int ano;
	
	//construtor
	
	public Carros(String nome, String marca, int ano) {
		this.nome = nome;
		this.marca = marca;
		this.ano = ano;
	}
	
	public void exibirInfo() {
		System.out.println("Nome: "+nome+", Marca: "+marca+", Ano: "+ano);
	}
	
}
