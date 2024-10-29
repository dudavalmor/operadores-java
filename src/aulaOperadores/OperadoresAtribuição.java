package aulaOperadores;

public class OperadoresAtribuição {

	public static void main(String[] args) {
		int x = 8;
		int y = 2;
		int z = 4;
		
		z = y; 
		System.out.println("Atribuição simples (z = y): " + y);
		
		x += y; 
		System.out.println("\nAtribuição com soma (x = x + y): " + x);
		
		x -= z;
		System.out.println("\nAtribuição com subtração (x = x - z): " + x);
		
		x *= y;
		System.out.println("\nAtribuição com multiplicação (x = x * y): " + x);

		x /= y;
		System.out.println("\nAtribuição com divisão (x = x / y): " + x);
		
		x %= y;
		System.out.println("\nAtribuição com modulo (x = x%y): " + x);


	}

}
