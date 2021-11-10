package lista2;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i;
		System.out.printf("Digite a Idade do Aluno: ");
		i= leia.nextInt();
		if (i >=10 && i <=14) {
		System.out.printf("Categoria Infantil.");
		}
		else if (i>=15 && i<=17) {
		System.out.printf("Categoria Juvenil.");
		}
		else if (i>=18 && i<=25) {
		System.out.printf("Categoria Adulto.");
		}
		else
		System.out.printf("Categoria Inexistente.");
	}
}
