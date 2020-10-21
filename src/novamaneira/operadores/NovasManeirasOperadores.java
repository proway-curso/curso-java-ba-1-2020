package novamaneira.operadores;

public class NovasManeirasOperadores {
	
	public static void main(String[] args) {
		int variavel1 = 0;
		
		//essa operação
		variavel1 = variavel1 + 1;//1
		System.out.println(variavel1);//imprime 1
		//é o mesmo que essa
		variavel1++;//2
		System.out.println(variavel1);//imprime 2
		
		//essa operação
		variavel1 = variavel1 - 1;//1
		System.out.println(variavel1);//imprime 1
		//é o mesmo que essa
		variavel1--;//0
		System.out.println(variavel1);//imprime 0
		
		//essa operação
		System.out.println(variavel1 = variavel1 + 1);//total 1 e imprime 1
		//não é o mesmo que essa
		System.out.println(variavel1++);//total 2 e imprime 1
		//mas é o mesmo que isso
		System.out.println(++variavel1);//total 3 e imprime 3
		
		//essa operação
		System.out.println(variavel1 = variavel1 - 1);//total 2 e imprime 2
		//não é o mesmo que essa
		System.out.println(variavel1--);//total 1 e imprime 2
		//mas é o mesmo que isso
		System.out.println(--variavel1);//total 0 e imprime 0
		
		
		//variavel++ passa o valor e soma depois
		//++variavel soma antes depois passa o valor
		
		
	}

}
