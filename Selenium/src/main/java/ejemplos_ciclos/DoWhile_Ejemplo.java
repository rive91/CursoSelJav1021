package ejemplos_ciclos;

public class DoWhile_Ejemplo {

	public static void main(String[] args) {
		int b = 10;
		
		do {
			//El codio dentro del 'do' se imprime incluso si la condicion falsa
			System.out.println("el valor de B es: " + b);
			b++;
		}while(b <= 20);

	}

}
