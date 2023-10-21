package model.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.data.Cliente;
import objectMother.ClientesOM;

public class ClienteRepositorio implements ClienteRepositoriable{
	private List<Cliente> lista;
	
	public ClienteRepositorio() {
		lista=new ArrayList<>();
		ClientesOM clientesOM = new ClientesOM();
		lista = clientesOM.getClientes();
	}
	public List<Cliente> findClientes(){
		return lista;
	}

	public Optional<Cliente> findClienteByDni(String dni) {
		return lista.stream().filter(cliente -> cliente.getdNICliente().equals(dni)).findFirst();
	}

}
