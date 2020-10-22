package java_elementals.loop.exemplo;

import java.util.Scanner;

public class UtilizandoLoopForComVetores {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a quantidade de alunos a ser inserida");
		int quantidadeAlunos = Integer.parseInt(sc.nextLine());
		
		String[] vetorNomeAluno = new String[quantidadeAlunos];
		int[] vetorIdadeAluno = new int[quantidadeAlunos];
		
		for(int i = 0; i < quantidadeAlunos; i++) {
			System.out.println("Escreva o nome do aluno " + (i+1));
			vetorNomeAluno[i] = sc.nextLine();
			
			System.out.println("Escreva a idade do aluno " + (i+1));
			vetorIdadeAluno[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i = 0; i < quantidadeAlunos; i++) {
			System.out.println(i+1 + " - " + vetorNomeAluno[i] + " tem " + vetorIdadeAluno[i] + " ano(s).");
		}
		
	}

}
