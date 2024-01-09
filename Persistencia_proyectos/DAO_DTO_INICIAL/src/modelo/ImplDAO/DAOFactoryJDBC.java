package modelo.ImplDAO;

import java.sql.SQLException;

import modelo.AbstractDAO.DaoFactory;
import modelo.AbstractDAO.HotelDAO;
import modelo.AbstractDAO.PersonaDAO;
import modelo.AbstractDAO.ReservaDAO;
import modelo.acceso.AccessJdbc;

public class DAOFactoryJDBC extends DaoFactory {
	AccessJdbc accessJdbc;
	

	public DAOFactoryJDBC() throws ClassNotFoundException, SQLException {
		super();
		//EStos parametros pueden ser pasado por parametros o configurados en otro sitio
		accessJdbc=new AccessJdbc("persistenciaDAO", "root", "");
	}



	@Override
	public PersonaDAO getPersonaDAO() {
		return new PersonaDAOJdbc(accessJdbc);
	}



	public HotelDAO getHotelDAO() {
		
		return new HotelDAOJdbc(accessJdbc);
	}
	
	public ReservaDAO getReservaDAO() {
		return new ReservaDAOJdbc(this.accessJdbc);
	}

}
