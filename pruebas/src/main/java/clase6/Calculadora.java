package clase6;

public class Calculadora {

	public static void main(String[] args ) {
		
		//¿Cómo uso la calculadora?
		//Crear la calculadora
		//Vamos a usar alguna de sus funciones
		
		int a = 10;
		int b = 30;
		boolean flag = true;
		float altura = 185;
		
		
		CalculadoraSinMain miCalculadora = new CalculadoraSinMain();
		
		//Ahora puedo ejecutar cualquiera de sus funciones
		
 		double suma = miCalculadora.sumar(a,b);
 		
 		System.out.println("La suma de " + a + "y" + b + "es " + suma); 		
	}
}
