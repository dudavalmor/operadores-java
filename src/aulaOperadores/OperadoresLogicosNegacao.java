package aulaOperadores;

public class OperadoresLogicosNegacao {

	public static void main(String[] args) {
		int x = 57;
		int y = 33;
		boolean proposicao_01;
		boolean proposicao_02;
		boolean resposta;

		proposicao_01 = x > y;
		System.out.println("\nA proposicao_01 �: " + proposicao_01);
		
		proposicao_02 = x < y;
		System.out.println("\nA proposicao_02 �: " + proposicao_02);

		System.out.println("\n\nNega��o\n");

		resposta = !proposicao_01;
		System.out.println("\nA Nega��o da proposicao_01 �: " + resposta);

		resposta = !proposicao_02;
		System.out.println("\nA Nega��o da proposicao_02 �: " + resposta);
	}

}
