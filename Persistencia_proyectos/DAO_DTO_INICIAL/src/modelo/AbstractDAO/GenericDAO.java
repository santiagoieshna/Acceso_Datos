package modelo.AbstractDAO;

import java.util.Collection;
import java.util.Optional;

import modelo.Entity.HotelDTO;

public interface GenericDAO<T,ID> {
	public void create(T entidad);
	public Collection<T> findAll();
	public T findById(ID id);
}
