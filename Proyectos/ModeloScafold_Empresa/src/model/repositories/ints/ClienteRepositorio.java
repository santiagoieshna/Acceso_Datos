package model.repositories.ints;

import java.util.List;
import java.util.Optional;

import model.data.Cliente;

public interface ClienteRepositorio {

	public List<Cliente> findClientes();

	public Optional<Cliente> findClienteByDni(String dni);
	
//	public List<Cliente> findClientes() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	public Optional<Cliente> findClienteByDni(String dni) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
