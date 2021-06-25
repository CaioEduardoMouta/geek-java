package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o indice de poluição");
		indice = teclado.nextFloat();
		
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("1º Grupo suspender");
		} else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("1º e 2º Grupo suspender as atividades");
		} else if(indice >= 0.5) {
			System.out.println("Atenção todos suspender as atividades");
		} else {
			System.out.println("Continuem as atividades");
		}
		
		teclado.close();
	}
}
