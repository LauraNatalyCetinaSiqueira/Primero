package clase3;

import java.util.Scanner;

public class EjercicioIf {

	public static void main(String[] args) {
		// Determinar dado 3 números, cual es el mayor
		
		double x,y,z;

		System.out.println("Ingrese 3 números");
		Scanner teclado = new Scanner (System.in);
		
		x = teclado.nextInt();	
		y = teclado.nextInt();	
		z = teclado.nextInt();
		
		teclado.close();
		
		if (x>y && x>z)
		{
			System.out.println(x + "es mayor");
		}
		
		if (y>x && y>z)
		{
			System.out.println(y + "es mayor");
		}
		
		if (z>y && z>x)
		{
			System.out.println(z + "es mayor");
		}
		
		if (x==y && x==z) {
			System.out.println(x + y + z + "son iguales" );
		}
		
		
	}

}
