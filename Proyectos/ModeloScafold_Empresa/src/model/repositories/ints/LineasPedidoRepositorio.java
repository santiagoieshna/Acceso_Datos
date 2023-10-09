package model.repositories.ints;

import java.util.List;

import model.data.LineaPedido;
import model.data.Pedido;

public interface LineasPedidoRepositorio {
	
	public List<LineaPedido> getLineasByPedido(Pedido pedido);

}
