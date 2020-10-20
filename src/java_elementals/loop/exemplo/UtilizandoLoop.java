package java_elementals.loop.exemplo;

import java.util.Scanner;

public class UtilizandoLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		loop: while (true) {
			System.out.println("Sistema de menu");
			System.out.println("1 - Voltar");
			System.out.println("2 - Sair");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				continue;
			case 2:
				break loop;

			default:
				System.out.println("Opção inválida");
				continue;
			}
		}//fim loop
		
	}

}
