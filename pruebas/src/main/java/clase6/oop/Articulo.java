package clase6.oop;

public class Articulo {
	
	
	private String titulo;
	private float precio;
	private String imagen;
	private boolean favorito;
	private boolean envioGratis;
	private boolean tieneDescuento;
	private boolean tieneCuotas;
	private int cantidad;
	
	public Articulo(String titulo, float precio, String imagen, boolean favorito, int cantidad, boolean tieneCuotas){
		
		if(precio>20000) {
			this.envioGratis = true;
		}
		this.favorito = favorito;
		this.titulo = titulo;
		this.imagen = imagen;
		this.tieneCuotas = tieneCuotas;
		
		
	}
	
	public void agregarFavorito() {
		this.favorito = !this.favorito;
	}
	
	public  void detalleArticulo() {
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Precio: " + this.precio);
		System.out.println("Imagen: " + imagen);
		System.out.println("Favorito; " + favorito);
		System.out.println("Envio Gratis: " + envioGratis);
		System.out.println("Tiene descuento: " + tieneDescuento);
		System.out.println("Tiene cuotas: " + tieneCuotas);
		System.out.println("Contidad: " + cantidad);
 		
	}

	public boolean isFavorito() {
		return favorito;
	}

	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}

	public boolean isEnvioGratis() {
		return envioGratis;
	}

	public void setEnvioGratis(boolean envioGratis) {
		this.envioGratis = envioGratis;
	}

	public boolean isTieneDescuento() {
		return tieneDescuento;
	}

	public void setTieneDescuento(boolean tieneDescuento) {
		this.tieneDescuento = tieneDescuento;
	}

	public String getTitulo() {
		return titulo.toUpperCase(); //Se usa para poner todo en mayuscula
	}

	public float getPrecio() {
		return precio;
	}

	public String getImagen() {
		return imagen;
	}

	public boolean isTieneCuotas() {
		return tieneCuotas;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	

}
