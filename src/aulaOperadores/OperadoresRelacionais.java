package aulaOperadores;

public class OperadoresRelacionais {

	public static void main(String[] args) {
        
		int x = 13;
		int y = 25;
		int z = 19;
		int w = 3;
		boolean resposta;

		resposta = x > y;
		System.out.println("O valor de x é maior do que o valor de y? " + resposta);
		
		resposta = z >= y;
		System.out.println("\nO valor de z é maior ou igual ao valor de y? " + resposta);

		resposta = x < z;
		System.out.println("\nO valor de x é menor do que o valor de z? " + resposta);
		
		resposta = z <= w;
		System.out.println("\nO valor de z é menor ou igual ao valor de w? " + resposta);

		resposta = x == z;
		System.out.println("\nO valor de x é igual ao valor de z? " + resposta);
		
		resposta = z != w;
		System.out.println("\nO valor de z é diferente do valor de w? " + resposta);
	}
}