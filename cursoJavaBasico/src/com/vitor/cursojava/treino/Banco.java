package com.vitor.cursojava.treino;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Operacoes operacao = new Operacoes();
		int op;
		
		
		do {
			System.out.println("Bem vindo ao sistema bancário");
			
			System.out.println("0-Cadastro");
			System.out.println("1-Ver saldo");
			System.out.println("2-Depositar");
			System.out.println("3-Sacar");
			System.out.println("4-Sair");
			
			op = scan.nextInt();
			
			switch (op) {
			case 0: {
				
				operacao.cadastrarConta();
				break;
			}
			case 1: {
				operacao.verSaldo();
				break;
			}
			case 2: {
				operacao.fazerDeposito();
				break;
			}
			case 3: {
				operacao.fazerSaque();
				break;
			}
			case 4:{
				System.out.println("Saindo...");
			}
			default:
				throw new IllegalArgumentException("Valor invalido: " + op);
			}
		}while(op != 4);
		
	}

}
