package modelo;

public class Dependiente extends AsistentePedido{

	private String mostrador;

	public Dependiente(String dni, String nombre, String mostrador) {
		super(dni, nombre);
		this.mostrador=mostrador;
	}

	public String getMostrador() {
		return mostrador;
	}
	
	@Override
	public Boolean hacerPedido() {
		return false;
	}
	

}
