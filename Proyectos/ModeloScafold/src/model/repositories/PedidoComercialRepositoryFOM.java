package model.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.data.PedidoComercial;
import model.data.Vendedor;
import objectMother.PedidosComercialOM;

public class PedidoComercialRepositoryFOM implements PedidoComercialRepositorio {
	private ArrayList<PedidoComercial> lista;
	
	public PedidoComercialRepositoryFOM() {
		lista = new PedidosComercialOM().getPedidosComercialesParaTest();
	}
	
	@Override
	public List<PedidoComercial> findByVendedor(Vendedor vendedor) {
		if(Optional.of(vendedor).isPresent()) {
			return lista.stream()
					.filter(pedido->pedido.getVendedor().equals(vendedor))
					.collect(Collectors.toList());
		}
		return null;
	}

	public ArrayList<PedidoComercial> getLista() {
		return lista;
	}
	
	
	
}
