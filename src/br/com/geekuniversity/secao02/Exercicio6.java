package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		float valor_por_hora, salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o valor voc� ganha por hora");
		valor_por_hora = teclado.nextFloat();
		
		System.out.println("Qauntas horas voc� trabalhou neste m�s");
		horas_trabalhadas = teclado.nextInt();
		
		salario = (horas_trabalhadas * valor_por_hora);
		
		System.out.println("Neste m�s voc� vai receber R$" + salario);
		
		teclado.close();
		
	}
}
