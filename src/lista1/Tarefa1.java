package lista1;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int anos=0, meses=0, dias=0;int total=0;
		System.out.print("Digite sua Idade em anos: ");
		anos=leia.nextInt();
		System.out.print("Digite os meses: ");
		meses=leia.nextInt();
		System.out.print("Digite os dias: ");
		dias=leia.nextInt();
		anos= anos*365;
		meses=meses*30;
		total=anos+meses+dias;
		System.out.print(total );

	}

}
