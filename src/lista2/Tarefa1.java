package lista2;

import java.util.Scanner;

public class Tarefa1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		System.out.print("Digite um n�mero para A: ");
		a = leia.nextInt();
		System.out.print("Digite um n�mero para B: ");
		b = leia.nextInt();
		System.out.print("Digite um n�mero para C: ");
		c = leia.nextInt();
		if (a > b && a > c) {
			System.out.printf("N�mero maior: %d", a);
		} 
		else if (b > a && b > c) {
			System.out.printf("N�mero maior: %d", b);
		}
		else {
			System.out.printf("N�mero maior: %d", c);
		
		}
		
		
	}

}
