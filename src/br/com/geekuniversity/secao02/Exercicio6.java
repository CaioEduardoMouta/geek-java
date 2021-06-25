package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		float valor_por_hora, salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o valor você ganha por hora");
		valor_por_hora = teclado.nextFloat();
		
		System.out.println("Qauntas horas você trabalhou neste mês");
		horas_trabalhadas = teclado.nextInt();
		
		salario = (horas_trabalhadas * valor_por_hora);
		
		System.out.println("Neste mês você vai receber R$" + salario);
		
		teclado.close();
		
	}
}
