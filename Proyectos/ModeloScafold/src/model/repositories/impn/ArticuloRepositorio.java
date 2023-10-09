package model.repositories.impn;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.data.Articulo;
import objectMother.ArticulosOM;

public interface ArticuloRepositorio {

	public List<Articulo> findAll();

	public Optional<Articulo> findById(int id);

	public List<Articulo> findByRange(float minimo, float maximo);

}
