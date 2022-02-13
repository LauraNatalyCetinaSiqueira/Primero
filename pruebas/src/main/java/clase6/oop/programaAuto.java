package clase6.oop;

public class programaAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto miClio = new Auto("clio","mio",178);
		//ctrol+shjift+i
		
		miClio.detalleAuto();
		
		miClio.encender( );
		miClio.detalleAuto();
		
		miClio.acelerar();
		miClio.detalleAuto();
		
		miClio.apagar();
		miClio.detalleAuto();
		
		miClio = null;
		
	}

}
