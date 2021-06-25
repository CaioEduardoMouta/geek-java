package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int soma;
		int multiplicacao;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o primeiro número");
		num2 = teclado.nextInt();
		
		soma = num1 + num2;
		multiplicacao = num1 * soma;
		System.out.println("Resultado "+ multiplicacao);
		
		teclado.close();
	}
}
