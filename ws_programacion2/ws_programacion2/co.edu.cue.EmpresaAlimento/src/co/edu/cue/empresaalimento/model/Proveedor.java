package co.edu.cue.empresaalimento.model;

import java.util.ArrayList;

public class Proveedor {
	
	String nombre;
	
 	ArrayList<Producto> listaProductosProveedores = new ArrayList<Producto>();

	public Proveedor() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Producto> getListaProductosProveedores() {
		return listaProductosProveedores;
	}

	public void setListaProductosProveedores(ArrayList<Producto> listaProductosProveedores) {
		this.listaProductosProveedores = listaProductosProveedores;
	}

 	
 	
 	
 	
 	
 	
 	
 	
}
