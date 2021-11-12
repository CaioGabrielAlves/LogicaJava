package lista3;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade = 0, novo = 0, velho = 0;
		System.out.println("Insira Idades: ");
		while (idade!=-99) {
			idade=leia.nextInt();
			if (idade < 21 && idade != -99) {
				novo++;
			}
			if(idade > 50) {
				velho++;
			}
		}System.out.printf("Menores de 21 anos: %d", novo);
		System.out.printf("\nMaiores de 50 anos: %d", velho);
		leia.close();
	}
}
