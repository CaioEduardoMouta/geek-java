package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um n�mero");
		numero = teclado.nextInt();
		
		if(numero % 2 == 0) {
			if(numero > 0) {
				System.out.printf("O n�mero %d � par e positivo\n", numero);
			}else {
				System.out.printf("O n�mero %d � par e negativo\n", numero);
			}
		}else {
			if(numero > 0) {
				System.out.printf("O n�mero %d � par e positivo\n", numero);
			}else {
				System.out.printf("O n�mero %d � par e negativo\n", numero);
			}
		}
		teclado.close();
	}
}
