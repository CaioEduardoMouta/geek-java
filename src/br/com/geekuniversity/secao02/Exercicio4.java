package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int soma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número");
		num2 = teclado.nextInt();
		
		soma = (num1 + num2);
		
		System.out.println("O resultado é " + soma);
		
		teclado.close();
	}
}
