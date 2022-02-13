package clase4;
import java.util.Scanner;
public class EjercicioDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese cantidad de fila");
		int cantFilas = teclado.nextInt();
		System.out.println("Ingrese cantidad de columnas");
		int cantCols = teclado.nextInt();
		
		if(cantFilas == cantCols) {
			Integer[][] matriz = new Integer[cantFilas][cantCols];
			System.out.println("Ingrese valores.");
			for(int f = 0; f<cantFilas; f++) {
				for(int c = 0; c<cantCols;c++) {
					System.out.println( " Ingrese (" + f + "," + c +")");
					int aux = teclado.nextInt();
					matriz[f][c] = aux;
				}
			}
			
			boolean todosUno = true;
			
			for(int f = 0; f < cantFilas; f++) {
				for(int c = 0; c < cantCols; c++) {
					if (f == c) {
						if (matriz[f][c] != 1) {
							todosUno = false;
							break;
						}
					}
				}
			}
			if(todosUno) {
				System.out.println("matriz con diagonal en 1");
			} else {
				System.out.println("matriz sin diagonal en 1");
			}
			
		}
	}

}
