package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		int idade;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a sua idade");
		idade = teclado.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("Infantil A");
		}else if(idade >= 8 && idade <= 11) {
			System.out.println("Infantil B");
		}else if(idade >= 12 && idade <= 18) {
			System.out.println("Jovem");
		}else if(idade > 19) {
			System.out.println("Adulto");
		}
		
		teclado.close();
	}
}
