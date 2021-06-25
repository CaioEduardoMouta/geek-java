package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		int c;
		float n;
		float e = 0;
		float salario;
		float valor_hora = (float) 10.00;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o codigo");
		c = teclado.nextInt();
		System.out.println("informe a qtde de horas");
		n = teclado.nextFloat();
		
		if(n > 50) {
			e = (float)(n - 50) * (float)20.00;
			salario = (50 * valor_hora) + e;
			System.out.printf("Salário Total R$ %.2f", salario);
			System.out.printf("Salario excedente R$ %.2f\n", e);
		}else {
			salario = n * valor_hora;
			System.out.printf("Salário Total R$ %.2f\n", salario);
			System.out.printf("Salario excedente R$ %.2f\n", e);
		}
		teclado.close();
	}
}
