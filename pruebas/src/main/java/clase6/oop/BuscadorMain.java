package clase6.oop;

public class BuscadorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WWW.meli
		Buscador buscador = new Buscador ();
		
		 
		
		String claveDeBusqueda = "Iron man";
		
		buscador.setClaveBusqueda(claveDeBusqueda);
		
		buscador.buscar();
		
		buscador.mostrarResultados();
	}

}
