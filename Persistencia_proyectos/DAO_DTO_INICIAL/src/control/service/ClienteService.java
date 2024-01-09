package control.service;

import java.util.List;

import modelo.Entity.ReservaDTO;
import modelo.dto.ReservaResponseDTO;

public interface ClienteService {
	
	ReservaResponseDTO getReserva(Long idCliente);
	List<ReservaDTO> getReservaByClienteAndHotel(Long idCliente, Long idHotel);
}
