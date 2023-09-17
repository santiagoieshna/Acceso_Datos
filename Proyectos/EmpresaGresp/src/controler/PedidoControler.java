package controler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import models.Articulo;
import models.Pedido;

public class PedidoControler {
	private List<Pedido> pedidos;
	
	public PedidoControler() {
		this.pedidos = new ArrayList<>();
	}
	
	public boolean hacerPedido(String cliente_id, String dependiente_id ) {
		return true;
	}
	
	public Integer countPedidosEntreFechas( LocalDate fechaInicio, LocalDate fechaFin, String cliente_id) {
		return 0;
	}
	
	public  Articulo[]  tresArticulosBestSeller(){
		
		return null;
	}
	
	/**
	 * Metodo que imprime todos los pedidos de un cliente
	 * @param cliente_id String del id cliente
	 */
	public void getAllPedidos(String cliente_id) {
		for (Pedido pedido : pedidos) {
			if(pedido.getClienteID().equals(cliente_id)) {
				System.out.println(pedido.toString());
			}
		}
	}
	
	/**
	 * Metodo que imprime un pedido a traves de la referencia de este
	 * @param pedido_referencia (String) referencia del pedido
	 */
	public void getPedido(String pedido_referencia) {
		for (Pedido pedido : pedidos) {
			if(pedido.getReferencia().equals(pedido_referencia)) {
				System.out.println(pedido.toString());
			}
		}
	}
	
	
}
