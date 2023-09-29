package model.repositories;

import java.util.List;
import java.util.Optional;

import model.data.Articulo;
import model.data.Cliente;
import objectMother.ArticulosOM;

public class ArticuloRepositorio {

	List<Articulo> articulos;
	
	
	public ArticuloRepositorio() {
		super();
		articulos=new ArticulosOM().getArticulos();
	}

	public List<Articulo> findAll(){
		return articulos;
	}
	
	public Optional<Articulo> findById(int id) {
		for (Articulo articulo : articulos) {
			if(articulo.getId()==id)
				return Optional.of(articulo);
		}
		return Optional.ofNullable(null);
	}

	public List<Cliente> findArticuloById() {
		// TODO Auto-generated method stub
		return null;
	}
}
