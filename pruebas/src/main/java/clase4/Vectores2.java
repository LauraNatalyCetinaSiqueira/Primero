package clase4;

import java.util.Arrays;

public class Vectores2 {

	public static void main(String[] args) {
		
		
		String[] nombres = new String[] {"luz", "jose", "edwin", "elio", "hernan", "samir", "elsa"};
		int cantidad = 0;
		for (String nombre : nombres) {
			if(nombre.startsWith("e")) {
				cantidad ++;			
			}
			
		}
		
		//Se creo el vector con el tamaño de la cantidad de nombres con E encontrados, esto se observa en cantidad. 
		String [] nombresConE = new String[cantidad];
		
		int pos = 0;
	
		for (String nombre : nombres) {
			if (nombre.startsWith("e")) {
				nombresConE [pos] = nombre;
				pos++;
			}
		}
		
		System.out.println(Arrays.toString(nombresConE));
	}	
}
