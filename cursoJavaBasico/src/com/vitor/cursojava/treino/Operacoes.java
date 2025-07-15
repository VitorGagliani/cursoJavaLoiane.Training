package com.vitor.cursojava.treino;

import java.util.Random;
import java.util.Scanner;

public class Operacoes {
	
	Conta conta = new Conta();
	double saque, deposito;
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	
	
	void cadastrarConta() {
		
		
		System.out.println("Digite seu nome completo");
		conta.nomeProprietario = scan.nextLine();
		conta.numeroConta = random.nextDouble();
		
		conta.saldo = 1000;
		
		
	}
	
	
	void verSaldo() {
		
		System.out.println("Seu saldo é de: "+conta.saldo);
		
	}
	
	void fazerSaque() {
		System.out.println("Insira a quantia desejada: ");
		saque = scan.nextDouble();
		conta.saldo -= saque;
		
		
	}
	
	void fazerDeposito() {
		System.out.println("Insira a quantia desejada: ");
		deposito = scan.nextDouble();
		conta.saldo += deposito;
	}
}
