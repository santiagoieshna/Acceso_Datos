package modelo.AbstractDAO;

import java.util.Collection;

import modelo.Entity.ReservaDTO;

public interface ReservaDAO extends GenericDAO<ReservaDTO, Long> {
	
	Collection<ReservaDTO> getReservaByCliente(Long idCliente);
}
