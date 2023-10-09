package model.repositories.impn;

import java.util.List;
import java.util.Optional;

import model.data.Articulo;
import model.data.Cliente;
import model.data.Pedido;
import model.data.Vendedor;
import model.repositories.ints.PedidoRepositorio;

public class PedidoRepositorioFichero implements PedidoRepositorio {
	private List<Pedido> pedidos;
	
	public PedidoRepositorioFichero(List<Pedido> pedidos) {
		super();
		this.pedidos = pedidos;
	}

	@Override
	public List<Pedido> findPedidosByCliente(Optional<Cliente> findClienteByDni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedido> findPedidosWithArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedido> findByVendedor(Vendedor findById) {
		// TODO Auto-generated method stub
		return null;
	}

}
