package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		int n;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número");
		n = teclado.nextInt();
		
		if(n > 100) {
			System.out.println(n);
		}else {
			n = 0;
			System.out.println(n);
		}
		teclado.close();
	}
}
