package modelo.ImplDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Collection;

import mapper.PersonaMapper;
import modelo.AbstractDAO.PersonaDAO;
import modelo.Entity.Persona;
import modelo.acceso.AccessJdbc;

public class PersonaDAOJdbc implements PersonaDAO {

	private AccessJdbc accessJdbc;

	public PersonaDAOJdbc(AccessJdbc accessJdbc) {
		super();
		this.accessJdbc = accessJdbc;
	}

	@Override
	public void create(Persona entidad) {
		// TODO Auto-generated method stub
	}

	@Override
	public Collection<Persona> findAll() {
//		String query = "Select * from productos";
//	
//		PreparedStatement ejecutor = this.accessJdbc.prepareStatement(query);
//		ResultSet rs = ejecutor.executeQuery();
	
		
		ResultSet conjuntoResultados = accessJdbc.executeQuery("SELECT * FROM personas");
		Collection<Persona> personas = new ArrayList<>();
		try {
			while (conjuntoResultados.next()) {
				personas.add(new PersonaMapper().map(conjuntoResultados));
			} 
		} catch (Exception e) {
			return null;
		}
		return personas;
	}

	@Override
	public Persona findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
