package co.edu.cue.empresaalimento.model;

import java.util.ArrayList;

public class EmpresaAlimento {
	
	ArrayList<Proveedor> listaProveedores = new ArrayList<Proveedor>();
	ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	ArrayList<DrogaFarmacologica> listaDrogasFarmacologica = new ArrayList<DrogaFarmacologica>();
	
	

	public EmpresaAlimento() {
		super();
	}
	
	
	

	public ArrayList<Proveedor> getListaProveedores() {
		return listaProveedores;
	}




	public void setListaProveedores(ArrayList<Proveedor> listaProveedores) {
		this.listaProveedores = listaProveedores;
	}




	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}




	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}




	public ArrayList<DrogaFarmacologica> getListaDrogasFarmacologica() {
		return listaDrogasFarmacologica;
	}




	public void setListaDrogasFarmacologica(ArrayList<DrogaFarmacologica> listaDrogasFarmacologica) {
		this.listaDrogasFarmacologica = listaDrogasFarmacologica;
	}




	public void agregarProvedor(){
		
	}
	
	public void agregarProducto(){
		
	}
	
	public void agregarDrogaFarmacologica(){
		
		
	}
	
	
	
	
	
	

}
