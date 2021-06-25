package br.com.geekuniversity.secao02;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
	 int num1;
	 int num2;
	 int num3;
	 int num4;
	 int q1;
	 int q2;
	 int q3;
	 int q4;
	 
	 Scanner teclado = new Scanner(System.in);
	 
	 System.out.println("Informe o numero 1");
	 num1 = teclado.nextInt();
	 System.out.println("Informe o numero 2");
	 num2 = teclado.nextInt();
	 System.out.println("Informe o numero 3");
	 num3 = teclado.nextInt();
	 System.out.println("Informe o numero 4");
	 num4 = teclado.nextInt();
	 
	 q1 = num1 + num1;
	 q2 = num2 + num2;
	 q3 = num3 + num3;
	 q4 = num4 + num4;
	 
	 if(q3 >= 1000) {
		 System.out.println(q3);
	 }else {
		 System.out.printf("Num1 %d Quadrado %d\n",num1,q1);
		 System.out.printf("Num2 %d Quadrado %d\n",num2,q2);
		 System.out.printf("Num3 %d Quadrado %d\n",num3,q3);
		 System.out.printf("Num1 %d Quadrado %d\n",num4,q4);
	 }
	 teclado.close();
	}
}
