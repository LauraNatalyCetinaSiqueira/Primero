package ar.com.educacionit.domain;

import java.util.Date;

public class Articulos {
	
	private Long id;
	private String titulo;
	private Date fechaCreacion;
	private String codigo;
	private Double precio;
	private Integer stock;
	private Long marcaId;
	private Long categoriId;
	public Articulos(Long id, String titulo, Date fechaCreacion, String codigo, Double precio, Integer stock,
			Long marcaId, Long categoriId) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcaId = marcaId;
		this.categoriId = categoriId;
	}
	public Articulos(String titulo, Date fechaCreacion, String codigo, Double precio, Integer stock, Long marcaId,
			Long categoriId) {
		super();
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcaId = marcaId;
		this.categoriId = categoriId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getTitulo () {
		return titulo;
	}
	
	public String getTitulo(boolean isUpperCase) {
		if(isUpperCase) {
			return this.titulo.toUpperCase();
			
		}else {
			
			return  this.titulo;
		}
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPrecio(String pattern) {
		return this.precio.toString();
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Long getMarcaId() {
		return marcaId;
	}
	public void setMarcaId(Long marcaId) {
		this.marcaId = marcaId;
	}
	public Long getCategoriId() {
		return categoriId;
	}
	public void setCategoriId(Long categoriId) {
		this.categoriId = categoriId;
	}
	@Override
	public String toString() {
		return "Articulos [id=" + id + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion + ", codigo=" + codigo
				+ ", precio=" + precio + ", stock=" + stock + ", marcaId=" + marcaId + ", categoriId=" + categoriId
				+ "]";
	}
	
	//alt+shift+s

		

}
