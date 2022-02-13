package clase6;

public class CalculadoraSinMain {
	
	double sumar (double a, double b) {
		return a+b;	
	}
	
	double restar (double a, double b) {
		return a-b;	
	}
	
	double multiplicar (double a, double b) {
		return a * b;	
	}
	
	
	double dividir (double a, double b) {
		if(b != 0) {
			return a/b;	
		}else {
			System.out.println("No se puede dividir por 0");
			return 0;
		}
		
	}

}
