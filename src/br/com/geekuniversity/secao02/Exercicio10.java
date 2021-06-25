package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		int numero;
		int p = 0;
		int i = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número");
		numero = teclado.nextInt();
		
		if(numero % 2 == 0) {
			p = numero;
		}else {
			i = numero;
		}
		System.out.println(p);
		System.out.println(i);
		teclado.close();
	}
}
