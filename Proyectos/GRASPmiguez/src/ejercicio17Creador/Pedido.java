package ejercicio17Creador;

import java.util.Map;

public class Pedido {
	public String idPedido;
	public String datos_Pedido;
	public Cliente cliente;
	public Map<String, Float> lineas;
	
	public Pedido(String idPedido, String datos_Pedido, Cliente cliente, Map<String, Float> lineas) {
		super();
		this.idPedido = idPedido;
		this.datos_Pedido = datos_Pedido;
		this.cliente = cliente;
		this.lineas = lineas;
	}

	public Factura crearFactura() {
		Float total = calcularTotal();
		return new Factura(cliente, idPedido, total);
	}

	private Float calcularTotal() {
		return null;
	}
}
