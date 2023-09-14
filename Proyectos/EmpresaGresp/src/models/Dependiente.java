package models;

public class Dependiente {
	private String dni;
	private String nombre;
	private Rutas ruta;
	
	public Dependiente(String dni, String nombre, Rutas ruta) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.ruta = ruta;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Rutas getRuta() {
		return ruta;
	}
	public void setRuta(Rutas ruta) {
		this.ruta = ruta;
	}

}
