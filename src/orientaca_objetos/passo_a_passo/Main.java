package orientaca_objetos.passo_a_passo;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String retorno = "Você tem ";
		while(true) {
			try {
				//int idade = perguntaIdade();
				Main main = new Main();
				int idade = main.perguntaIdade2();
				retorno = retorno + idade + " anos.";
				break;
			} catch (Exception e) {}
		}
		System.out.println(retorno);
		sc.close();

	}
	
	//metodo que chame os dois metodos abaixo	
	private static int perguntaIdade() {
		int idade = 0;
		System.out.println("Escreva sua idade:");
		idade = Integer.parseInt(sc.nextLine());
		return idade;
	}
	
	private int perguntaIdade2() {
		int idade = 0;
		System.out.println("Escreva sua idade:");
		idade = Integer.parseInt(sc.nextLine());
		return idade;
	}
	
	//metodo para o nome


}
