package modelo.AbstractDAO;


import java.util.Collection;

import modelo.Entity.HotelDTO;

public interface HotelDAO extends GenericDAO<HotelDTO, Integer> {

	Collection<HotelDTO> getByName(String name);
	Collection<HotelDTO> getByEstrellas(Integer name);
	Collection<HotelDTO> getSinceAmountRooms(Integer amountRooms);
	Collection<HotelDTO> getByRangeAmountRooms(Integer minRooms , Integer maxRooms);
}
