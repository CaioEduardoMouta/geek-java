package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int metros, centimetros;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor em metros");
		metros = teclado.nextInt();
		
		centimetros = (metros * 100);
		
		System.out.println(metros + "metros em centimentros é " +centimetros);
		
		teclado.close();
		
	}
}
