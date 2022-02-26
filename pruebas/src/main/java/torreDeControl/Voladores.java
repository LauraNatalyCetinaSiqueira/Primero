package torreDeControl;

public class Voladores {
	
	private String nombre;
	private String color;
	private Integer  modelo;
	
	
	public Voladores(String nombre, String color, Integer modelo) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.modelo = modelo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Integer getModelo() {
		return modelo;
	}


	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}


	@Override
	public String toString() {
		return "Voladores [nombre=" + nombre + ", color=" + color + ", modelo=" + modelo + "]";
	}
	
	
	
	
	
	
	
	
	

}
