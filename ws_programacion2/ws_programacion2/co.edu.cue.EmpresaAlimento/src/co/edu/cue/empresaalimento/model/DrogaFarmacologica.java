package co.edu.cue.empresaalimento.model;

public class DrogaFarmacologica implements ObjetoRefrigerable {
	
	String codigo;
	String nombre;
	
	
	
	
	public DrogaFarmacologica() {
		super();
	}


	

	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	@Override
	public void iniciarProcesoRefrigeracion() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
