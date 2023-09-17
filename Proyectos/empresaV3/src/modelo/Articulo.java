package modelo;

public class Articulo {
	private String referencia;
	private String nombre;
	private String descripcion;
	private Float precio;

	public Articulo(String referencia, String nombre, String descripcion, Float precio) {
		super();
		this.referencia = referencia;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getReferencia() {
		return referencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

}
