package loop.exemplo;

public class UtilizandoLoopFor {
	
	public static void main(String[] args) {
		int quantidadeIteracoes = 3;
		
		//irá escrever 3 linhas
		System.out.println("Exemplo 1:");
		for(int i = 0/*inicia indice*/; i < quantidadeIteracoes/*se isso for verdadeiro executa o bloco*/; i++/*depois de executar o bloco incrementa o indice*/) {
			System.out.println("Indice: " + i);//escreve de 0 a 2
		}
		System.out.println("----\n");
		
		//irá escrever 4 linhas ... por causa do operador '<='
		System.out.println("Exemplo 2:");
		for(int i = 0; i <= quantidadeIteracoes; i++) {
			System.out.println("Indice: " + i);//escreve de 0 a 3
		}
		System.out.println("----\n");
		
		//irá escrever 3 linhas, por causa da condição que força a parada do loop
		System.out.println("Exemplo 3:");
		for(int i = 0; i < quantidadeIteracoes; i++) {
			if(i == 1) {
				break;//irá sair do loop quando entrar nessa condição
			}
			System.out.println("Indice: " + i);//escreve 0
		}
		System.out.println("----");
		
		//irá escrever 2 linhas, por causa da condição que força pular o restante das coisas do loop
		System.out.println("Exemplo 3:");
		for(int i = 0; i < quantidadeIteracoes; i++) {
			if(i == 1) {
				continue;//irá sair do loop quando entrar nessa condição
			}
			System.out.println("Indice: " + i);//escreve 0 e 2
		}
		System.out.println("----");
	}

}
