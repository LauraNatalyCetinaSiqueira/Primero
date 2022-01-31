package clase4;

public class Arrege {

	public static void main(String[] args) {
		
		
		int[] edades = new int [2]; // un vector de 2 posiciones // [0,0]
		
		//cargar una posición
		edades [0] = 5;
		edades [1] = 10;
		//atributo length
		
		int tamanio = edades.length; //tamaño del vector
		
		//acceder al último elemento
		int edad = edades[tamanio-1];	
	
	}

}
