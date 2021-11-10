package lista1;

import java.util.Scanner;

public class Tarefa4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a=0, b=0, c=0, d=0, r=0, s=0;
		System.out.print("Digite um número para A: ");
		a=leia.nextInt();
		System.out.print("Digite um número para B: ");
		b=leia.nextInt();
		System.out.print("Digite um número para C: ");
		c=leia.nextInt();
		r=(a+b)*(a+b);
		s=(b+c)*(b+c);
		d=(r+s)/2;
		System.out.println(r);
		System.out.println(s);
		System.out.println(d);
		
		
	}
}
