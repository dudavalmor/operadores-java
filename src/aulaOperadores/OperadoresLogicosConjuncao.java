package aulaOperadores;

public class OperadoresLogicosConjuncao {

	public static void main(String[] args) {
		int x = 56;
		int y = 89;
		boolean proposicao_01;
		boolean proposicao_02;
		boolean proposicao_03;
		boolean proposicao_04;
		boolean resposta;

		proposicao_01 = x > y;
		System.out.println("\nA proposicao_01 �: " + proposicao_01);

		proposicao_02 = x < y;
		System.out.println("\nA proposicao_02 �: " + proposicao_02);

		proposicao_03 = x != y;
		System.out.println("\nA proposicao_03 �: " + proposicao_03);

		proposicao_04 = x == y;
		System.out.println("\nA proposicao_04 �: " + proposicao_04);

		System.out.println("\n\nConjun��o\n");

		resposta = proposicao_01 && proposicao_03;
		System.out.println("\nA proposicao_01 e proposicao_03 s�o verdadeiras? " + resposta);

		resposta = proposicao_02 && proposicao_04;
		System.out.println("\nA proposicao_02 e proposicao_04 s�o verdadeiras? " + resposta);

		resposta = proposicao_01 && proposicao_02;
		System.out.println("\nA proposicao_01 e proposicao_02 s�o verdadeiras? " + resposta);

		resposta = proposicao_03 && proposicao_04;
		System.out.println("\nA proposicao_03 e proposicao_04 s�o verdadeiras? " + resposta);

	}

}
