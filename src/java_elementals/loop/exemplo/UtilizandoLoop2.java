package java_elementals.loop.exemplo;

import java.util.Scanner;

public class UtilizandoLoop2 {
	
	public static void main(String[] args) {
		int idade = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Escreva sua idade:");
			idade = Integer.parseInt(sc.nextLine());
		} while(idade < 18);
	}

}
