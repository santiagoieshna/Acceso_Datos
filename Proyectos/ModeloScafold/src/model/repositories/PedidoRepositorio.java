package model.repositories;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;
import model.data.Articulo;
import model.data.Cliente;
import model.data.Pedido;
import model.data.PedidoComercial;
import model.data.Vendedor;
import objectMother.PedidosComercialOM;

public class PedidoRepositorio implements PedidoRepositoriable{
	List<Pedido> pedidos = new PedidosComercialOM().getPedidosComercialesParaTest().stream()
			.map(pedido -> (Pedido)pedido)
			.collect(Collectors.toList());

	public List<Pedido> findPedidosByCliente(Optional<Cliente> findClienteByDni) {
		return pedidos.stream()
				.filter(pedido-> pedido.getCliente().equals(findClienteByDni.get()))
				.collect(Collectors.toList());
	}

	public List<Pedido> findPedidosWithArticulo(Articulo articulo) {
		return pedidos.stream().filter((pedido)->{
			return pedido.contains(articulo);
		}).collect(Collectors.toList());
	}
	
}
