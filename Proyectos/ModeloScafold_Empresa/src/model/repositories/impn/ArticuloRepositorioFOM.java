package model.repositories.impn;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.data.Articulo;
import model.repositories.ints.ArticuloRepositorio;
import objectMother.ArticulosOM;

public class ArticuloRepositorioFOM implements ArticuloRepositorio{

	private	List<Articulo> articulos;
	
	
	public ArticuloRepositorioFOM(List<Articulo> articulos) {
		super();
		this.articulos = articulos;
	}

	@Override
	public List<Articulo> findAll() {
		return articulos;
	}

	@Override
	public Optional<Articulo> findById(int id) {
		for (Articulo articulo : articulos) {
			if(articulo.getId()==id)
				return Optional.of(articulo);
		}
		return Optional.ofNullable(null);
	}

	@Override
	public List<Articulo> findByRange(float minimo, float maximo) {
		return articulos.stream()
				.filter((articulo)->{return articulo.getPrecio()>=minimo;})
				.filter((articulo)->{return articulo.getPrecio()<=maximo;})
				.collect(Collectors.toList());
	}
	


}
