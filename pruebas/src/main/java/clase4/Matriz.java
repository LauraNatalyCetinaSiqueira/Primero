package clase4;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantFilas = 2;
		int cantCols = 2;
		
		Integer [][] matriz = new Integer [cantFilas][cantCols];
		//tamaños de la matriz
		//cargamos 
		
		for(int fila=0; fila<cantFilas; fila++) {
			
			for(int columna=0; columna< cantCols; columna++) {
				matriz[fila][columna] = (fila+columna);
			}
		}
		
		for(int fila=0; fila<cantFilas; fila++) {
			
			for(int columna=0; columna< cantCols; columna++) {
				
				
				matriz[fila][columna] = (fila+columna);
				System.out.println(fila + "-" + columna + "=" + (fila+columna));
			}
		}

	}

}
