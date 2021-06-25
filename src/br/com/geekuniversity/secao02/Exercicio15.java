package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número");
		numero = teclado.nextInt();
		
		if(numero % 2 == 0) {
			if(numero > 0) {
				System.out.printf("O número %d é par e positivo\n", numero);
			}else {
				System.out.printf("O número %d é par e negativo\n", numero);
			}
		}else {
			if(numero > 0) {
				System.out.printf("O número %d é par e positivo\n", numero);
			}else {
				System.out.printf("O número %d é par e negativo\n", numero);
			}
		}
		teclado.close();
	}
}
