package mapper;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelo.Entity.ReservaDTO;
import modelo.dto.ReservaResponseDTO;

public class ReservaResponseMapper implements Mapper<List<ReservaDTO>, ReservaResponseDTO> {

	
	@Override
	public ReservaResponseDTO map(List<ReservaDTO> s) {
		Map<String, Date> hoteles= new HashMap<String, Date>();
		
		for (ReservaDTO reservaDTO : s) {
	//		hoteles.put(reservaDTO.get, null)
		}
		
		
//		ReservaResponseDTO response = new 
		
		return null;
	}

}
