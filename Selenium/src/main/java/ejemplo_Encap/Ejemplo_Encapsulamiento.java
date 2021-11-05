package ejemplo_Encap;

public class Ejemplo_Encapsulamiento {

	public static void main(String[] args) {
		MiClase mc = new MiClase();
		mc.setTipo(10);
		
		System.out.println("El tipo es: " + mc.getTipo());
	}

}
