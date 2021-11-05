package arreglos_ejemplo;

public class Arreglo_ejemplo {

	public static void main(String[] args) {
		
		//Ambas son declaraciones validas
		int intArray[];
		int [] intArray2;
		
		//Declarar un array de strings
		String[] arr;
		
		//Asignar memoria para 6 espacios.
		arr = new String[6]; 
		
		//inicializar el primer elemento del array
		arr[0] = "cero";
		//inicializar el segundo elemento
		arr[1] = "uno";
		
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		arr[5] = "cinco";

		//System.out.println(arr[4]);
		
		//Acceder a todos los elemento del array
		for(int i = 0; i < arr.length; i++) {//'arr.lentgth calcula la longitud del arreglo
			System.out.println("Elemento en el indice " + i + ": " + arr[i]);
		}
	}

}
