package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		int numero;
		int n;
		int m;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número");
		numero = teclado.nextInt();
		
		if(numero > 0) {
			n = numero;
		}else {
			m = numero;
		}
		
		System.out.println(numero);
		teclado.close();
	}
}
