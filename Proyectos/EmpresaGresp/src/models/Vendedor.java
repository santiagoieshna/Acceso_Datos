package models;

public class Vendedor extends AsistentePedido{

	private Rutas rutas;

	public Vendedor(String dni, String nombre, Rutas rutas) {
		super(dni, nombre);
		this.rutas = rutas;
	}


	public Rutas getRutas() {
		return rutas;
	}

	public void setRutas(Rutas rutas) {
		this.rutas = rutas;
	}
	
	@Override
	public Boolean hacerPedido() {
		return false;
	}

	
}
