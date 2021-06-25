package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		float altura;
		float peso_ideal;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual sua altura");
		altura = teclado.nextFloat();
		
		//cast
		peso_ideal = (float)(altura * 72.7) - 58;
		
		System.out.printf("Peso %.2f" , peso_ideal);
		
		teclado.close();
	}

}
