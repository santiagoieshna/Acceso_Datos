package model.repositories;

import java.util.List;
import java.util.Optional;

import model.data.Articulo;

public interface ArticuloRepositoriable{

	public List<Articulo> findAll();
	
	public Optional<Articulo> findById(int id);
	
	public List<Articulo> findByRange(float minimo, float maximo);
	
}
