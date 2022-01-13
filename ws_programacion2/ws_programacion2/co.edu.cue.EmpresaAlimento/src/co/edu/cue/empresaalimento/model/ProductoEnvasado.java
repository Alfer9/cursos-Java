package co.edu.cue.empresaalimento.model;

public class ProductoEnvasado extends Producto {
	
	String fechaEnvasado;
	Double pesoEnvase;
	Pais paisOrigen;
	
	
	public ProductoEnvasado() {
		super();
	}


	public String getFechaEnvasado() {
		return fechaEnvasado;
	}


	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}


	public Double getPesoEnvase() {
		return pesoEnvase;
	}


	public void setPesoEnvase(Double pesoEnvase) {
		this.pesoEnvase = pesoEnvase;
	}


	public Pais getPaisOrigen() {
		return paisOrigen;
	}


	public void setPaisOrigen(Pais paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	
	
	
	
	

}
