package aulaOperadores;

public class OperadoresRelacionais {

	public static void main(String[] args) {
        
		int x = 13;
		int y = 25;
		int z = 19;
		int w = 3;
		boolean resposta;

		resposta = x > y;
		System.out.println("O valor de x � maior do que o valor de y? " + resposta);
		
		resposta = z >= y;
		System.out.println("\nO valor de z � maior ou igual ao valor de y? " + resposta);

		resposta = x < z;
		System.out.println("\nO valor de x � menor do que o valor de z? " + resposta);
		
		resposta = z <= w;
		System.out.println("\nO valor de z � menor ou igual ao valor de w? " + resposta);

		resposta = x == z;
		System.out.println("\nO valor de x � igual ao valor de z? " + resposta);
		
		resposta = z != w;
		System.out.println("\nO valor de z � diferente do valor de w? " + resposta);
	}
}