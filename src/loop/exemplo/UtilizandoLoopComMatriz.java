package loop.exemplo;

public class UtilizandoLoopComMatriz {

	public static void main(String[] args) {
		// vetor bidimensional ou matriz
		int tamanhoEixoX = 2;// linha, horizontal
		int tamanhoEixoY = 2;// coluna, vertical
		String[][] matriz = new String[tamanhoEixoX][tamanhoEixoY];

		matriz[0][0] = "Linha 0, Coluna 0";// linha zero, coluna zero - primeira linha, primeira coluna
		matriz[0][1] = "Linha 0, Coluna 1";// ...

		matriz[1][0] = "Linha 1, Coluna 0";
		matriz[1][1] = "Linha 1, Coluna 1";

		System.out.println("Impressão dos itens da matriz:");
		for(String[] x : matriz) {
			for(String y : x) {
				System.out.println(y);
			}
		}
	}

}
