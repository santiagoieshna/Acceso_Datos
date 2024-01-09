package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Entity.HotelDTO;

public class HotelMapper implements Mapper<ResultSet, HotelDTO> {

	@Override
	public HotelDTO map(ResultSet rs) {
		HotelDTO hotelDTO = null;
		
        try {
        	hotelDTO = new HotelDTO();
			hotelDTO.setId(rs.getLong("id"));
			hotelDTO.setNombre(rs.getString("nombre"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
       
        return hotelDTO;
	}

}
