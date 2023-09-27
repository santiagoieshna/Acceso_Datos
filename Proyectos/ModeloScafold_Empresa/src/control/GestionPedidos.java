package control;

import java.util.Date;
import java.util.List;

import model.data.Articulo;
import model.data.Pedido;

public class GestionPedidos {
	
	private List<Pedido> pedidos;

	public GestionPedidos(List<Pedido> pedidos) {
		super();
		this.pedidos = pedidos;
	}
	
	// Creemos que esto puede estar en vendedor y dependiente a traves de una interface
	public Boolean hacerPedido() {
		return true;
	}

	public Integer countPedidosEntreFlechas(Date fechaInicio, Date fechaFin, String clienteID) {
		return 1;
	}

	public List<Articulo> tresArticulosBestSellers() {
		return null;
	}

}
