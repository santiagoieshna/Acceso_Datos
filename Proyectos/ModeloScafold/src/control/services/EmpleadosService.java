package control.services;

import java.util.List;
import java.util.Optional;

import model.data.Dependiente;
import model.data.Ruta;
import model.data.Vendedor;
import model.repositories.DependienteRepositoriable;
import model.repositories.DependienteRepositorio;
import model.repositories.VendedorRepositorio;
import model.repositories.VendedorRepositorioFOM;

public class EmpleadosService {
	private DependienteRepositoriable dependienteRepositorio;
	private VendedorRepositorio vendedorRepositorio;
	
	public EmpleadosService(VendedorRepositorio vendedorRepositorio, DependienteRepositoriable dependienteRepositorio) {
		super();
		this.vendedorRepositorio = vendedorRepositorio;
		this.dependienteRepositorio = dependienteRepositorio;
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
	public Optional<Vendedor> getVendedorById(String dni) {
		return vendedorRepositorio.findById(dni);
	}
	
}
