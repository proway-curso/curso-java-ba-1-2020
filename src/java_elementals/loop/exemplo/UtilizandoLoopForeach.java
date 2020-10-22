package java_elementals.loop.exemplo;

public class UtilizandoLoopForeach {
	
	public static void main(String[] args) {
		int[] vetorNumeros = {1, 2, 3};
		//o foreach é utilizado para ver vetores e listas(será visto mais para frente)
		//sem a necessidade de utilizar indice ou condições
		//vai percorrer todos os itens dos vetores e listas
		//imprime 1, 2 e 3
		System.out.println("Exemplo 1:");
		for(int numero : vetorNumeros) {
			System.out.println(numero);
		}
		System.out.println("----\n");
		
		//imprime 1
		System.out.println("Exemplo 2:");
		for(int numero : vetorNumeros) {
			if(numero == 2) {
				break;//para o loop
			}
			System.out.println(numero);
		}
		System.out.println("----\n");
		
		//imprime 1 e 3
		System.out.println("Exemplo 3:");
		for(int numero : vetorNumeros) {
			if(numero == 2) {
				continue;//não há condição a ser testado no for each
				//portanto só ignora o código abaixo e vai para o proximo registro
			}
			System.out.println(numero);
		}
		System.out.println("----\n");
	}

}
