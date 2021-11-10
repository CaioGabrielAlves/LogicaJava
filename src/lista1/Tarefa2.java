package lista1;

import java.util.Scanner;

public class Tarefa2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int anos=0,  meses=0, dias=0, resto=0;
		System.out.print("Digite sua idade em anos");
		anos=leia.nextInt();
		System.out.print("Digite em meses: ");
		meses=leia.nextInt();
		System.out.print("Digite em dias: ");
		dias=leia.nextInt();
		anos= anos*365;
		meses=meses*30;
		resto=anos+meses+dias;
		System.out.print(resto);
		anos=resto/365;
		meses=resto%30;
		dias=dias/1;
		dias=resto%365;
		dias=dias%1;
		
	}
}
