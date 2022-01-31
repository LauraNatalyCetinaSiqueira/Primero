package clase4;

import java.util.Scanner; 

public class CicloForEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Solicitar al usuario la cantidad de registros
		//Cargar un vector de enteors los datos ingresados por el usuario
		//Contar la cantidad de numeros pares
		//contar la cantidad de numeros impares
		//Sumar los numeros pares
		//sumar los numeros impares
		//promedio de los valores ingresados
		
		int cantidadRegistros;
		int [] vector;
		int cantPares = 0;
		int cantImpares = 0;
		int sumaPares = 0;
		int sumaImpares = 0;
		double promedio;
		
		//definir el tamaño del vector
		//carga de datos
		// procesamiento
		
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese la cantidad de registros a procesar > 0");
			cantidadRegistros = teclado.nextInt();
			
		}while(cantidadRegistros <= 0);
		
		vector = new int [cantidadRegistros];
		
		for (int i = 0; i < cantidadRegistros; i++) {
			System.out.println("Ingrese un dato:   ");
			int datoleido = teclado.nextInt();
			vector[i] = datoleido;
		}
		
		for(int dato: vector)
		{
			if(dato % 2 == 0) 
			{
				cantPares++;
				sumaPares += dato;
			}else {
				cantImpares++;
				sumaImpares += dato;
			}
			
			
		}
		
		promedio = (double)(sumaPares + sumaImpares) / (cantPares + cantImpares);
		
		System.out.println(java.util.Arrays.toString(vector));
		
		System.out.println("Cantidad de registros:   " + cantidadRegistros);
		System.out.println("Cantidad de pares:   " + cantPares);
		System.out.println("Cantidad de Impares:   " + cantImpares);
		System.out.println("Suma depares:   " + sumaPares);
		System.out.println("Suma Impares:   " + sumaImpares);
		System.out.println("Promedio" + promedio);
		
		teclado.close();
		
		
	}

}
