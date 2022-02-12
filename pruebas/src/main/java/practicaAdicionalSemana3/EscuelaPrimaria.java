package practicaAdicionalSemana3;

import java.util.Scanner;
import java.util.Arrays;


public class EscuelaPrimaria {

	public static void main(String[] args) {
		
		
		System.out.println("Aquí podrá observar el control de notas de sus alumnos");		
		System.out.println("Por favor, ingrese el número de estudiantes a consultar");
		Scanner teclado = new Scanner (System.in);
		int alumnos = teclado.nextInt();
		System.out.println("Usted ingreso " + alumnos + " alumnos para el control de notas");
		teclado.nextLine();		
		String cantidadDeAlumnos [] = new String [alumnos];
		int cantidadDeAlumnos1 [] = new int [alumnos];
		float cantidadDeAlumnos2 [] = new float [alumnos];
		for(int i = 0; i < cantidadDeAlumnos.length; i++) {
			System.out.println("Por favor, ingrese el nombre del alumno " + (i+1));
			String nombre = teclado.nextLine();
			System.out.println("Por favor, ingrese el apellido del alumno " + (i+1));
			String apellido = teclado.nextLine();
			cantidadDeAlumnos[i] = nombre.concat(apellido);		
		}
		System.out.println("Tenga en cuenta que el número de examen es de 2 digitos");
		for (int  j = 0 ; j < cantidadDeAlumnos1.length; j++) {
			System.out.println("Por favor, ingrese el número de examen del alumno" + j);
			int numeroDeExamen = teclado.nextInt();
			if (numeroDeExamen >= 0) {
				if (numeroDeExamen <= 100) {
					cantidadDeAlumnos1 [j] = numeroDeExamen;
				}else {
					System.out.println("El número de examen ingresado no es valido, intente de nuevo por favor");	
				}			
			}else {
				System.out.println("El número de examen ingresado no es valido, intente de nuevo por favor");	
			}	
		}
		System.out.println("Recuerde que la nota debe estar en el rango de 0 a 10");
		for (int k = 0; k <cantidadDeAlumnos2.length; k++) {
			System.out.println("Por favor, ingrese la nota del alumno" + k);			
			float nota = teclado.nextFloat();
			if(nota >= 0 ) {
				if(nota <= 10) {
					cantidadDeAlumnos2[k] = nota;
				}else {
					System.out.println("La nota no es valida, intente de nuevo");
				}		
			}else {
				System.out.println("La nota no es valida, intente de nuevo");
			}
		}		
		System.out.println(Arrays.toString(cantidadDeAlumnos));
		System.out.println(Arrays.toString(cantidadDeAlumnos1));
		System.out.println(Arrays.toString(cantidadDeAlumnos2));
		
		
		float minimo = cantidadDeAlumnos2 [0];
		int indice = 0;
		
		for(int l = 1; l < cantidadDeAlumnos2.length; l++ ) {	
			if (cantidadDeAlumnos2 [l] <= minimo ) {
				minimo = cantidadDeAlumnos2 [l];
				indice = l;
			}
		}
		
		for(int m = 0; m<cantidadDeAlumnos.length; m++) {	
			if(cantidadDeAlumnos [m] ==  cantidadDeAlumnos [indice]) {
				System.out.println("La nota más baja del curso es:  " + minimo + " y corresponde a: "  + cantidadDeAlumnos[indice] );
			}			
		}
		
		float maximo = cantidadDeAlumnos2 [0];
		int indice2 = 0; 
		for (int n = 1; n < cantidadDeAlumnos2.length; n++) {	
			if (cantidadDeAlumnos2 [n] >= maximo) {
				maximo = cantidadDeAlumnos2 [n];
				indice2 = n;				
			}
		}
		
		for (int n = 0; n < cantidadDeAlumnos.length; n++) {	
			if ( cantidadDeAlumnos [n] == cantidadDeAlumnos [indice2]) {
				System.out.println("La nota más alta del curso es: " + maximo + " y corresponde a: " + cantidadDeAlumnos[indice2]);
			}
		}
		
				
		int numeroDeAprobados = 0; 
		int numeroDeNoAprobados = 0;
		int x = 0;
		for (int o = 0; o < cantidadDeAlumnos2.length; o++) {	
			if (cantidadDeAlumnos2 [o] >= 7) {				
				numeroDeAprobados++;
				System.out.println("Aprobado : " + cantidadDeAlumnos[x] + " con nota: " + cantidadDeAlumnos2[x]);
			}
			x++;			
		}
		
		System.out.println("La cantidad de estudiantes que aprueban el curso es: " + numeroDeAprobados);
		
		x = 0;
		
		for (int p = 0; p < cantidadDeAlumnos2.length; p++){
			if (cantidadDeAlumnos2 [p] < 7 ) {
				numeroDeNoAprobados++;
				System.out.println(" No Aprobado : " + cantidadDeAlumnos[x] + " con nota: " + cantidadDeAlumnos2[x]);	
			}
			x ++;
		}					
		
		System.out.println("La cantidad de estudiantes que no aprueban el curso es: " + numeroDeNoAprobados);		
		
		teclado.close();
	}
}
