package models;

public abstract class AsistentePedido {
	private String dni;
	private String nombre;
	
	public AsistentePedido(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	public Boolean hacerPedido() {
		return false;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}
	

	
}
