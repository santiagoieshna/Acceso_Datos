package control.services;

import java.util.List;
import java.util.Optional;

import model.data.Dependiente;
import model.data.Ruta;
import model.data.Vendedor;
<<<<<<< HEAD
import model.repositories.DependienteRepositorio;
import model.repositories.VendedorRepositorio;
import model.repositories.VendedorRepositorioFOM;
=======
import model.repositories.impn.VendedorRepositorioFOM;
import model.repositories.ints.DependienteRepositorio;
import model.repositories.ints.VendedorRepositorio;
>>>>>>> e6e2148c5a9d6b47bb13c176249b1a5f0edb55fb

public class EmpleadosService {
	private DependienteRepositorio dependienteRepositorio;
	private VendedorRepositorio vendedorRepositorio;
	
	public EmpleadosService(VendedorRepositorio vendedorRepositorio) {
		super();
<<<<<<< HEAD
		this.vendedorRepositorio = vendedorRepositorio;
=======
		this.vendedorRepositorio = new Vende
>>>>>>> e6e2148c5a9d6b47bb13c176249b1a5f0edb55fb
	}
	/**
	 * Los dependientes, la lista de todos
	 */
	public List<Dependiente> getDpendientes(){
		return dependienteRepositorio.findAll();
	}
	/**
	 * Los vendedores con una ruta sur o central
	 */
	public List<Vendedor> getVendedoresRutaSurOCentral(){
		return vendedorRepositorio.findByRoutes(Ruta.sur,Ruta.central);
	}
<<<<<<< HEAD
	public Optional<Vendedor> getVendedorById(String idVendedor) {
		// TODO Auto-generated method stub
		return null;
	}
=======
	public Optional<Vendedor> getVendedorById(String dni) {
		// TODO Auto-generated method stub
		return null;
	}
	public void getDependientesActivos() {
		// TODO Auto-generated method stub
		
	}
	
	
>>>>>>> e6e2148c5a9d6b47bb13c176249b1a5f0edb55fb
}
