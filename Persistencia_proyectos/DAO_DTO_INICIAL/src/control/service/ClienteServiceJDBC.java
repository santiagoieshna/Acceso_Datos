package control.service;

import java.util.List;
import java.util.stream.Collectors;

import mapper.ReservaResponseMapper;
import modelo.AbstractDAO.HotelDAO;
import modelo.AbstractDAO.PersonaDAO;
import modelo.AbstractDAO.ReservaDAO;
import modelo.Entity.ReservaDTO;
import modelo.dto.ReservaResponseDTO;

public class ClienteServiceJDBC implements ClienteService{

	private ReservaDAO reservaDAO;
	private PersonaDAO personaDAO;
	private HotelDAO hotelDAO;
	
	public ClienteServiceJDBC(ReservaDAO reservaDAO, PersonaDAO personaDAO, HotelDAO hotelDAO) {
		super();
		this.reservaDAO = reservaDAO;
		this.personaDAO = personaDAO;
		this.hotelDAO = hotelDAO;
	}

	@Override
	public ReservaResponseDTO getReserva(Long idCliente) {
		List<ReservaDTO> reservasFiltradas =  this.reservaDAO.findAll().stream()
			.filter(r -> r.getIdPersona()==idCliente)
			.collect(Collectors.toList());
		
		ReservaResponseDTO = ReservaResponseMapper.map(reservasFiltradas);
		
		return null;
	}

	@Override
	public List<ReservaDTO> getReservaByClienteAndHotel(Long idCliente, Long idHotel) {
		// TODO Auto-generated method stub
		return null;
	}

}
