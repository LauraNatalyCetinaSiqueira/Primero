package torreDeControl;

public class Avion  extends Voladores implements Aterrizable {
	
	private String tipo;
	private Integer asientos;
	

	public Avion(String nombre, String color, Integer modelo, String tipo, Integer asientos) {
		super(nombre, color, modelo);
		this.tipo = tipo;
		this.asientos = asientos;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Integer getAsientos() {
		return asientos;
	}


	public void setAsientos(Integer asientos) {
		this.asientos = asientos;
	}


	public void aterrizar() {
		
		System.out.println("El avion puede aterrizar");
		
	}
	
	
	

}
