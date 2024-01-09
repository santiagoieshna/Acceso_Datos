package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Entity.Persona;

public class PersonaMapper implements Mapper<ResultSet, Persona> {

	@Override
	public Persona map(ResultSet s) {
		try {
			Object object1 = s.getObject(1);
			// Salta eeror ClassCastException
//			 Long object2 = (long)object1;
			Long object2 = Long.parseLong(object1.toString());
			Object object3 = s.getObject(2);
			String object4 = (String) object3;
		
			return new Persona(object2, object4);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
