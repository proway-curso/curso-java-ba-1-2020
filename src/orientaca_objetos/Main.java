package orientaca_objetos;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {	
		Pessoa[] vetorPessoa = new Pessoa[2];
		for(int i = 0; i < vetorPessoa.length; i++) {			
			System.out.println("Escreva o tipo da pessoa a se cadastrada");
			System.out.println("1 - Pessoa Fisica");
			System.out.println("2 - Pessoa Juridica");
			int tipoPessoa = Integer.parseInt(sc.nextLine());
			switch (tipoPessoa) {
			case 1:
				PessoaFisica pf = new PessoaFisica();
				cadastroPessoaFisica(pf);
				vetorPessoa[i] = pf;
				break;
			case 2:
				PessoaJuridica pj = new PessoaJuridica();
				cadastroPessoaJuridica(pj);
				vetorPessoa[i] = pj;
				break;

			default:
				break;
			}
		}
		
		for(int i = 0; i < vetorPessoa.length; i++) {
			System.out.println("Nome: " + vetorPessoa[i].getNome());
			if(vetorPessoa[i] instanceof PessoaFisica) {
				System.out.println("CPF: " + ((PessoaFisica)vetorPessoa[i]).getCpf());
			} else {
				System.out.println("CNPJ: " + ((PessoaJuridica)vetorPessoa[i]).getCnpj());
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
		System.out.println("CNPJ:");
		pj.setCnpj(Long.parseLong(sc.nextLine()));		
	}

}
