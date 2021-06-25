package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		float estoque_medio;
		int qtde_minima;
		int qtde_maxima;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a qtde minima");
		qtde_minima = teclado.nextInt();
		
		System.out.println("Informe a qtde maxima");
		qtde_maxima = teclado.nextInt();
		
		estoque_medio = (qtde_minima + qtde_maxima) / 2;
		
		System.out.println("O estoque médio é" + estoque_medio);
		
		teclado.close();
		
	}
}
