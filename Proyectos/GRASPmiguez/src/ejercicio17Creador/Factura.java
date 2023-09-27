package ejercicio17Creador;

public class Factura {
	public Cliente cliente;
	public String id_Factura;
	public Float Total;

	public Factura(Cliente cliente, String id_Factura, Float total) {
		super();
		this.cliente = cliente;
		this.id_Factura = id_Factura;
		Total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getId_Factura() {
		return id_Factura;
	}

	public Float getTotal() {
		return Total;
	}
}
