package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Entity.ReservaDTO;

public class ReservaMapper implements Mapper<ResultSet, ReservaDTO> {

	@Override
	public ReservaDTO map(ResultSet s) {
		ReservaDTO reservaDTO = null;
		
		try {
			reservaDTO = new ReservaDTO();
			reservaDTO.setIdPersona(s.getLong(1));
			reservaDTO.setIdHotel(s.getLong(2));
			reservaDTO.setFecha(s.getDate(3));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return reservaDTO;
	}

}
