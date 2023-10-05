package model.repositories;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.data.Articulo;
import objectMother.ArticulosOM;

public class ArticuloRepositorioFOM implements ArticuloRepositorio {

	List<Articulo> articulos;

	public ArticuloRepositorioFOM() {
		super();
		articulos = new ArticulosOM().getArticulos();
	}

	@Override
	public List<Articulo> findAll() {
		return articulos;
	}

	@Override
	public Optional<Articulo> findById(int id) {
		for (Articulo articulo : articulos) {
			if (articulo.getId() == id)
				return Optional.of(articulo);
		}
		return Optional.ofNullable(null);
	}

	@Override
	public List<Articulo> findByRange(float minimo, float maximo) {
		return articulos.stream().filter((articulo) -> {
			return articulo.getPrecio() >= minimo;
		}).filter((articulo) -> {
			return articulo.getPrecio() <= maximo;
		}).collect(Collectors.toList());
	}

}
