package clase4;

import java.util.Scanner; 

public class CicloDoWhileEjercicio {

	public static void main(String[] args) {
		// Leer un valor - >0 && <=10; acumular la suma de dichos valores
		
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		int suma = 0;
		
		do {
			System.out.println("Ingrese un valor:");
			valor = teclado.nextInt();
			
			suma += valor;
			
		}while(valor >0 && valor <=10);
		
		System.out.println("suma: " + suma) ;
		

	}

}
