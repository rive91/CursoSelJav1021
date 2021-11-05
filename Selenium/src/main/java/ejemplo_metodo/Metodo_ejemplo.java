package ejemplo_metodo;

public class Metodo_ejemplo {

	public static void main(String[] args) {
//		int resultado = suma(4,8);
//		System.out.println(resultado);
//		
//		int resultado2 = suma(18,99);
//		System.out.println(resultado2);
//		
//		String marca = carro(3);
//		System.out.println(marca);
		
		int resultado3 = suma(2,3,4);
		System.out.println(resultado3);

	}
	
	public static int suma(int a,int b) {
		int c = a + b;
		return c;
	}
	
	public static int suma(int a,int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	public static String carro(int a) {
		String[] cars = {"Volvo","BMW","Ford","Mazda"};
		return cars[a];
	}

}
