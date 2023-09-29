package control;

import java.util.List;
import java.util.Optional;

import model.data.Articulo;
import model.data.Cliente;
import model.repositories.ArticuloRepositorio;
import model.repositories.ClienteRepositorio;

public class Controller {
	//TODO
	private ClienteRepositorio clienteRepositorio;
	private ArticuloRepositorio articuloRepositorio;
	/**
	 * Necesito la lista completa de clientes
	 */
	public List<Cliente> getClientes(){
		return clienteRepositorio.findClientes();
	}
	/**
	 * necesito un cliente por id
	 */
	public Optional<Cliente> getClienteBydni(String dni){
		return clienteRepositorio.findClienteByDni(dni);
	}
	/**
	 * Todos los articulos 
	 */
	private List<Articulo> getArticulo(){
		return articuloRepositorio.findAll();
	}
	/**
	 * Todos los articulos en un rango de precios
	 */
	private Optional<Articulo> getArticuloById(Integer id){
		return articuloRepositorio.findById(id);
	}
	
}
