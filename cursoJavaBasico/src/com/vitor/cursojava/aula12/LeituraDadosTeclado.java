package com.vitor.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
	//importar biblioteca
	
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("seu nome completo: " +nomeCompleto);

		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade: "+idade);
		
		System.out.println("Você se chama "+nomeCompleto+" e tem "+idade+"anos");
	}

}
