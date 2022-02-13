package clase6.oop;

public class DB {
	
	//No tiene atributos
	//no tiene constructor
	//solo tiene metodos
	
	Articulo[] consultar (String claveConsultada) {
		Articulo res= new Articulo("Figura de marvel", 3594 , "http", true, 10, true);
		Articulo res2= new Articulo("Figura de acción", 34990 , "http", false, 2, false);
		
		Articulo [] resultado = new Articulo [] {res, res2};
		return resultado;
	}

}
