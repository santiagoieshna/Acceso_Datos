package model.data;


//POJO Plain Old Java Object
public class Dependiente extends Persona {

	private int numeroMostrador;
	
	public Dependiente(String dNICliente, String nombre, int numeroMostrador) {
		super(dNICliente, nombre);
		this.numeroMostrador = numeroMostrador;
	}

	//mis metodos
	
	// getters&setters, equals, clone, compare
	
	private int getNumeroMostrador() {
		return numeroMostrador;
	}

	private void setNumeroMostrador(int numeroMostrador) {
		this.numeroMostrador = numeroMostrador;
	}

	
}
