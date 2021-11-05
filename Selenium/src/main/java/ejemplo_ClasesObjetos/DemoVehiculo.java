package ejemplo_ClasesObjetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		Vehiculo minivan = new Vehiculo();
		
		//Asignar valores a las propiedas del objeto minivan
		minivan.pasajeros = 11;
		minivan.capacidad = 15;
		minivan.kmh =  20;
		
		//calcular el rango asumiendo un tanque lleno
		int rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros, con un rango de " + rango + " kilometros");

	}

}
