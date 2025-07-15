package com.vitor.cursojava.aula20;

import java.util.Scanner;

public class array {
	
	
	public static void main(String[] args) {
		int[] nota = new int[3];
		int soma = 0;
		
		Scanner scan = new Scanner(System.in);

		
		for( int i = 0; i < nota.length; i++) {
		//	System.out.println(""+i);
			System.out.println("Digite a nota "+i);
			int notaAluno = scan.nextInt();
			soma += notaAluno;
		}
		
		double media = soma/3;

		System.out.println("A media foi: "+ media);
		
	}

}
