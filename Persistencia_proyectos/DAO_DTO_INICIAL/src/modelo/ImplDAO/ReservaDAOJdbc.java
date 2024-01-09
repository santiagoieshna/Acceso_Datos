package modelo.ImplDAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import mapper.ReservaMapper;
import modelo.AbstractDAO.ReservaDAO;
import modelo.Entity.ReservaDTO;
import modelo.acceso.AccessJdbc;

public class ReservaDAOJdbc implements ReservaDAO {
	
	private AccessJdbc accesJDBC;

	
	
	public ReservaDAOJdbc(AccessJdbc accesJDBC) {
		super();
		this.accesJDBC = accesJDBC;
	}

	@Override
	public void create(ReservaDTO entidad) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<ReservaDTO> findAll() {
		String query = "SELECT id_persona, id_hotel, fecha FROM reserva";
		Collection<ReservaDTO> reservas= null; 
		try {
			ResultSet resultado = this.accesJDBC.executeQuery(query);
			reservas = new ArrayList<ReservaDTO>();
			while (resultado.next()) {
				reservas.add(new ReservaMapper().map(resultado));
			}
		}catch (Exception e) {
			System.out.println("Error al guardar reservas");
			return null;
		}
		
		return reservas;
	}

	@Override
	public ReservaDTO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ReservaDTO> getReservaByCliente(Long idCliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
