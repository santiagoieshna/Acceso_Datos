package models;

public class Articulo {
	private String referencia;
	private String nombre;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String description;
	private Float precio;

	public Articulo(String referencia, String description, String nombre, Float precio) {
		super();
		this.referencia = referencia;
		this.nombre=nombre;
		this.description = description;
		this.precio= precio;
	}

	public String getId() {
		return referencia;
	}

	public String getDescription() {
		return description;
	}

	public Float getPrice() {
		return precio;
	}

}
