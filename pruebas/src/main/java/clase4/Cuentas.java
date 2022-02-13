package clase4;

import java.util.Arrays;

public class Cuentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Viene de afuera
		String [] archivo = new String [] {"1000;juan lopez;1500;ca"
				+ "2000; jose guzman;115000;ca"
				+ "3000;juan martinez; -10000; cc"
				+ "4000;matias perez;100000;cc"
				+ "5000;elsa moyano;21000;cc"};
		Object [][] resultado = new Object [5][2];
		
		//obtener las cuentas con saldo negativo
		// obtener las cuentas con saldo >100000
		//separar por comas
		
		for(int i = 0; i<archivo.length; i++) {
			String registro = archivo[i];
			
			String [] cuenta = registro.split(";");
			Integer numCuenta = Integer.parseInt(cuenta[0]);
			String apyn = cuenta [1];
			Double saldo = Double.parseDouble(cuenta[2]);
			String tipo = cuenta[3];
			
			
			if(saldo < 0) {
				resultado [i][0] = saldo;
				resultado [i][1] = apyn;
			}
		}
		
		for (int  f = 0; f < resultado.length; f++) {
			for ( int c = 0; c < resultado[f].length; c++ ) {
				if(resultado[f][c] != null) {
					System.out.print(resultado[f][0]);
					System.out.print(resultado[f][1]);
				}
				
			}
		}
		
		
	}

}
