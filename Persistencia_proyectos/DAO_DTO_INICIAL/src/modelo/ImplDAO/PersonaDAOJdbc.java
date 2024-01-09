package modelo.ImplDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;

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
	
		
		ResultSet conjuntoResultados = accessJdbc.execute("SELECT * FROM personas");
		Collection<Persona> personas = new ArrayList<>();
		try {
			while (conjuntoResultados.next()) {
				personas.add(new PersonaMapper().map(conjuntoResultados));
			} 
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return personas;
	}

	@Override
	public Persona findById(Integer id) {
		String query = "Select nombre from personas WHERE id="+id;
		
		
		
		return null;
	}

	@Override
	public Persona findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
