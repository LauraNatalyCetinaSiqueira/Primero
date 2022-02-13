package clase6;

public class EjemploProcedimiento {

	public static void main(String[] args) {
		// invocar el procedimiento
		saludar("¿Cómo estás?");
		respoder ("bien, gracias");
		//calcular la suma de dos variables
		int a = 10;
		int b = 20;
		
		int c = sumar(a,b);
		
	}
	
	static int sumar (int a, int b) {
		/*int res = a + b;
		return res;*/
		
		return a + b;
	}
	
	private static void respoder(String saludo) {
		System.out.println(saludo);
		// TODO Auto-generated method stub
		
	}

	static void saludar (String saludo) {
		System.out.println("Hola" + saludo);
	}

}
