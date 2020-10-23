package loop.exemplo;

import java.util.Scanner;

public class UtilizandoLoopLast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean logado = false;//descompliquem usando mais variáveis do tipo boolean
		String usuario = "admin";
		String senha = "qwe123";
		mainLoop: while (true) {
			if (!logado) {
				System.out.println("Usuário:");
				String usuarioTestar = sc.nextLine();
				System.out.println("Senha:");
				String senhaTestar = sc.nextLine();
				if (usuarioTestar.equals(usuario) && senhaTestar.equals(senha)) {
					logado = true;
				} else {
					System.out.println("Deseja tentar novamente? S/N");
					if(sc.nextLine().equalsIgnoreCase("s")) {						
						continue;
					} else {
						System.out.println("Encerrando o programa...");
						break;
					}
				}
			}
			System.out.println("****************MENU****************");
			System.out.println("1 - Cadastro de pessoas");
			System.out.println("2 - Cadastro de produtod");
			System.out.println("3 - Deslogar");
			System.out.println("4 - Sair");
			System.out.println("************************************");
			int mainMenu = Integer.parseInt(sc.nextLine());
			switch (mainMenu) {
			case 1:
				// apenas simulando um cadastro
				boolean cadastrarPessoa = true;
				boolean opcaoInvalidaPs = false;
				do {
					if (!opcaoInvalidaPs) {
						System.out.println("Nome:");
						sc.nextLine();
						System.out.println("Idade:");
						sc.nextLine();
					} else {
						opcaoInvalidaPs = false;
					}
					System.out.println("***************OPÇÕES***************");
					System.out.println("1 - Novo cadastro");
					System.out.println("2 - Voltar ao menu principal");
					System.out.println("3 - Sair");
					System.out.println("************************************");
					int pessoaMenu = Integer.parseInt(sc.nextLine());
					switch (pessoaMenu) {
					case 1:
						// do nothing
						break;

					case 2:
						cadastrarPessoa = false;
						break;

					case 3:
						System.out.println("Encerrando o programa...");
						break mainLoop;

					default:
						System.out.println("Opção inválida, tente novamente...");
						opcaoInvalidaPs = true;
						break;
					}
				} while (cadastrarPessoa);
				break;
			case 2:
				// apenas simulando um cadastro
				boolean cadastrarProduto = true;
				boolean opcaoInvalidaPr = false;
				do {
					if (!opcaoInvalidaPr) {
						System.out.println("Nome:");
						sc.nextLine();
						System.out.println("Idade:");
						sc.nextLine();
					} else {
						opcaoInvalidaPr = false;
					}
					System.out.println("***************OPÇÕES***************");
					System.out.println("1 - Novo cadastro");
					System.out.println("2 - Voltar ao menu principal");
					System.out.println("3 - Sair");
					System.out.println("************************************");
					int pessoaMenu = Integer.parseInt(sc.nextLine());
					switch (pessoaMenu) {
					case 1:
						// do nothing
						break;

					case 2:
						cadastrarProduto = false;
						break;

					case 3:
						break mainLoop;

					default:
						System.out.println("Opção inválida, tente novamente...");
						opcaoInvalidaPr = true;
						break;
					}
				} while (cadastrarProduto);
				break;
			case 3:
				System.out.println("Fazendo logout...");
				logado = false;
				break;
			case 4:
				System.out.println("Encerrando o programa...");
				break mainLoop;

			default:
				System.out.println("Opção inválida, tente novamente...");
				break;
			}

		}
		sc.close();
	}

}
