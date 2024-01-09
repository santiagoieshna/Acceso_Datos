package principal;

import java.sql.SQLException;
import java.util.Collection;
import modelo.AbstractDAO.DaoFactory;
import modelo.AbstractDAO.HotelDAO;
import modelo.AbstractDAO.PersonaDAO;
import modelo.AbstractDAO.ReservaDAO;
import modelo.Entity.HotelDTO;
import modelo.Entity.Persona;
import modelo.Entity.ReservaDTO;
import modelo.ImplDAO.DAOFactoryJDBC;

public class Principal {

	public static void main(String[] args) {
		try {			
			DaoFactory daoFactory=new DAOFactoryJDBC();
			// PERSONAS
//			PersonaDAO personaDAO=daoFactory.getPersonaDAO();
//			Collection<Persona> findAll = personaDAO.findAll();
//			findAll.stream().forEach((a)->{System.out.println(a);});
			
			// HOTELES
//			HotelDAO hotelDAO = daoFactory.getHotelDAO();
//			Collection<HotelDTO> hoteles = hotelDAO.findAll();
//			hoteles.forEach(h -> System.out.println(h));
			
			// Reservas
			ReservaDAO reservaDAO = daoFactory.getReservaDAO();
			Collection<ReservaDTO> reservas = reservaDAO.findAll();
			
			reservas.forEach(r -> System.out.println(r));
			
			
			System.out.println("acabe");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//mysqldump -u root -p --databases Persistencia1 > "C:\Users\Administrador\Desktop\DAM2\Acceso_Datos\Persistencia_proyectos\DAO_DTO_INICIAL\resource\sql_file"

	}

}
