package modelo;

public class Cliente {
	private String dni;
	private String nombre;
	private Tipocliente tipoCliente;

	public Cliente(String dni, String nombre, Tipocliente tipoCliente) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.tipoCliente=tipoCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public Tipocliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(Tipocliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	public Integer getDescuento(){
		return this.getTipoCliente().getDescuento();
	}
}
