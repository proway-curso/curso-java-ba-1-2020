package orientaca_objetos;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc = null;
	private static Pessoa[] vetorPessoa = null;
	
	public static void main(String[] args) {
		Main main = new Main();
		sc = new Scanner(System.in);
		
		Pessoa[] vetorPessoa = new Pessoa[2];
		
		for(int i = 0; i < vetorPessoa.length; i++) {
			Pessoa pessoa = vetorPessoa[i];
			System.out.println("Escreva o tipo da pessoa a se cadastrada");
			System.out.println("1 - Pessoa Fisica");
			System.out.println("2 - Pessoa Juridica");
			int tipoPessoa = Integer.parseInt(sc.nextLine());
			switch (tipoPessoa) {
			case 1:
				pessoa = new PessoaFisica();
				cadastroPessoaFisica(pessoa);
				break;
			case 2:
				pessoa = new PessoaJuridica();
				break;

			default:
				break;
			}
		}
		
	}
	
	private static void cadastroPessoa(Pessoa p) {
		System.out.println("Nome:");
		p.setNome(sc.nextLine());
		
	}
	
	private static void cadastroPessoaFisica(PessoaFisica pf) {
		cadastroPessoa(pf);
		System.out.println("CPF:");
		pf.setCpf(Long.parseLong(sc.nextLine()));
		
	}
	
	private static void cadastroPessoaJuridica(PessoaJuridica pj) {
		cadastroPessoa(pj);
		System.out.println("CPF:");
		pj.setCnpj(Long.parseLong(sc.nextLine()));
		
	}

}
