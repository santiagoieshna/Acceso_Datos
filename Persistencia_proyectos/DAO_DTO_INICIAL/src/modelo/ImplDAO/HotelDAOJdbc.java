package modelo.ImplDAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import mapper.HotelMapper;
import modelo.AbstractDAO.HotelDAO;
import modelo.Entity.HotelDTO;
import modelo.acceso.AccessJdbc;

public class HotelDAOJdbc implements HotelDAO {
	
	private AccessJdbc accessJdbc ; 
	
	
	public HotelDAOJdbc(AccessJdbc accessJdbc) {
		super();
		this.accessJdbc = accessJdbc;
	}

	@Override
	public void create(HotelDTO entidad) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<HotelDTO> findAll() {
		Collection<HotelDTO> HotelesDTO = new ArrayList<HotelDTO>();
		
		String query = "Select id, nombre FROM hoteles";
		ResultSet resultadoConjunto = this.accessJdbc.executeQuery(query);
		
		try{
			while(resultadoConjunto.next()) {
				HotelesDTO.add(new HotelMapper().map(resultadoConjunto));
			}
			
		}catch (Exception e) {
			System.out.println("Error en la query");
		}
		
		
		
		return  HotelesDTO;
	}

	@Override
	public HotelDTO findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<HotelDTO> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<HotelDTO> getByEstrellas(Integer name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<HotelDTO> getSinceAmountRooms(Integer amountRooms) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<HotelDTO> getByRangeAmountRooms(Integer minRooms, Integer maxRooms) {
		// TODO Auto-generated method stub
		return null;
	}

}
