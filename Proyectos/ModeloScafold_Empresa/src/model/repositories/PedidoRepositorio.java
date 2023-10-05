package model.repositories;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.data.Articulo;
import model.data.Cliente;
import model.data.Pedido;
import model.data.Vendedor;

public interface PedidoRepositorio {
	

	public  List<Pedido> findPedidosByCliente(Optional<Cliente> findClienteByDni);

	public List<Pedido> findPedidosWithArticulo(Articulo articulo) ;

	public List<Pedido> findByVendedor(Vendedor findById);
}
