package clase4;

public class VectorObject {

	public static void main(String[] args) {
		// la base de todos los tipos de datos
		Object edad = 10;
		Object nombres = "Carlos";
		Object flag = true;
		Object letra = 'a';
		
		Object [] datos = new Object [] {edad,nombres,flag,letra};
		
		//determinar que datos son de tipo boolean ??
		
		for (Object dato : datos) {
			if(dato instanceof Boolean) {
				//casteo
				 boolean aux = (Boolean)dato;
				 System.out.println("Encontre !!!" + aux);
			}
			
		}
	}

}


//Tipos de datos primitivos 
//byte < short < int < long < float < double
//wrapper : clase que envuelve al valor primitivo que tiene datos
//Byte, Short , Integer,  Long, Float, Double
