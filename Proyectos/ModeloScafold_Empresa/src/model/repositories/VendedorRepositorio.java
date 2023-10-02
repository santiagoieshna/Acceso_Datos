package model.repositories;

import java.util.List;
import java.util.stream.Collectors;

import model.data.Ruta;
import model.data.Vendedor;

public class VendedorRepositorio {
	private List<Vendedor> vendedores;
	
	public List<Vendedor> getByRuta() {
		 
		return vendedores.stream()
				.filter((vendedor)-> {
					return vendedor.getRuta()==Ruta.norte 
							|| vendedor.getRuta()==Ruta.sur;
				})
				.collect(Collectors.toList());
	}
	
	
}
