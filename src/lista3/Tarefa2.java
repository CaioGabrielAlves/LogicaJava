package lista3;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a = 0, pares = 0, impares = 0;
		System.out.printf("Insira 10 números: ");
		for (int num = 0; num < 10; num++) {
			a = leia.nextInt();
			if (a % 2 == 0) {
				pares++;
			} 
			else {
				impares++;
			}
		}
		System.out.printf("Números pares: %d", pares);
		System.out.printf("\nNúmeros impares: %d", impares);

	}
}
