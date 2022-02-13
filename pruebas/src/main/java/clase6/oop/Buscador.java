package clase6.oop;

public class Buscador {
	
	//Atributos les aplicamos los modificadores
	private String claveBusqueda;
	private Articulo[] resultados;
	public Integer unAtributo; //NO SE HACE, no se definen atributos puvblicos de una clase.
	private Integer cantidadResultados; 
	
	public Buscador(){
		System.out.println("Creando buscador");
		
	}
	
	 public void buscar() {
		System.out.println("Buscando" + this.claveBusqueda);
		
		//como mi buscador necesita usar un objeto de la calse DB debe instanciar dicha clase
		
		DB db= new DB();
		 // Articulo [] resultadosQueHayEnDB = db.consultar(claveBusqueda);
		this.resultados = db.consultar(claveBusqueda);
		
		
		this.setCantidadResultados(this.resultados.length);
		  
	}
	 
	 private void setCantidadResultados(int cantidad) {
		 if(cantidad < 0) {
			 this.cantidadResultados = 0;
		 }else {
			 this.cantidadResultados = cantidad;
			 
		 }
	 }
	 
	 public Integer getCantidadResultados() {
		 if (this.cantidadResultados == null) {
			 setCantidadResultados(0); 
		 }
		 return this.cantidadResultados;
		 	 
	 }
	
	//void definirClaveBusqueda(String clave) {
		//claveBusqueda = null;
		
//	}
	
	public void mostrarResultados() {
		if(this.resultados.length >0) {
			for(Articulo aux : this.resultados) {
				aux.detalleArticulo();
				
			} 
			
		}else {
			
			System.out.println("No hay detalles" + claveBusqueda);
		}
	}

	public String getClaveBusqueda() {
		return claveBusqueda;
	}

	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}

	public Articulo[] getResultados() {
		return resultados;
	}

}
 