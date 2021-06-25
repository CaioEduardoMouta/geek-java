package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		float altura, peso_ideal;
		char sexo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe altura");
		altura = teclado.nextFloat();
		
		System.out.println("Informe o sexo m\f");
		sexo = teclado.next().charAt(0);
		
		if(sexo == 'm') {
			//cast(float)
			peso_ideal =(float)(72.7 * altura) - 58;
			System.out.printf("Seu peso � %.2f" , peso_ideal);
		}
		if(sexo == 'f') {
			peso_ideal =(float)(62.1 * altura) - (float)44.7;
			System.out.printf("Seu peso ideal � %.2f" , peso_ideal);
		}
		if(sexo != 'm' && sexo != 'f') {
			System.out.println("Sexo n�o reconhecido");
			peso_ideal = 0;
		}
		teclado.close();
	}
}
