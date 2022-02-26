package torreDeControl;

public class Helicoptero extends Voladores implements Aterrizable {
	
	public int velocidad;
	

	public Helicoptero(String nombre, String color, Integer modelo, int i) {
		super(nombre, color, modelo);
		
		this.velocidad = i;
		
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public void aterrizar() {
		
		System.out.println("El helicoptero puede aterrizar");
		
	}
	
}
