package aulaOperadores;

public class OperadoresAtribui��o {

	public static void main(String[] args) {
		int x = 8;
		int y = 2;
		int z = 4;
		
		z = y; 
		System.out.println("Atribui��o simples (z = y): " + y);
		
		x += y; 
		System.out.println("\nAtribui��o com soma (x = x + y): " + x);
		
		x -= z;
		System.out.println("\nAtribui��o com subtra��o (x = x - z): " + x);
		
		x *= y;
		System.out.println("\nAtribui��o com multiplica��o (x = x * y): " + x);

		x /= y;
		System.out.println("\nAtribui��o com divis�o (x = x / y): " + x);
		
		x %= y;
		System.out.println("\nAtribui��o com modulo (x = x%y): " + x);


	}

}
