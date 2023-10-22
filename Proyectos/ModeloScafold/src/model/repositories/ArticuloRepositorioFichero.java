package model.repositories;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.adapters.AdaptadorMultiobjetoSerializable;
import model.adapters.AdaptadorSerializadoMapeable;
import model.data.Articulo;

public class ArticuloRepositorioFichero implements ArticuloRepositoriable {
	private final String path = "articulos.dat";
	//AdaptadorMultiobjetoSerializable<Articulo> adaptador = new AdaptadorMultiobjetoSerializable<>(path);
	private final String mapPath = "mapaArticulos.dat";
	AdaptadorSerializadoMapeable<Integer, Articulo> adaptador = new AdaptadorSerializadoMapeable<>(path, mapPath);
	List<Articulo> articulos;

	public ArticuloRepositorioFichero() {
		articulos = adaptador.leerTodos();
	}

	public List<Articulo> findAll() {
		return articulos;
	}
	
	public boolean add(Articulo articulo) {
		if(adaptador.grabar(articulo, articulo.getId())) {
			articulos.add(articulo);
			return true;
		}
		return false;
	}

	public Optional<Articulo> findById(int id) {
		for (Articulo articulo : articulos) {
			if (articulo.getId() == id)
				return Optional.of(articulo);
		}
		return Optional.ofNullable(null);
	}

	public List<Articulo> findByRange(float minimo, float maximo) {
		return articulos.stream().filter((articulo) -> {
			return articulo.getPrecio() >= minimo;
		}).filter((articulo) -> {
			return articulo.getPrecio() <= maximo;
		}).collect(Collectors.toList());
	}

}
