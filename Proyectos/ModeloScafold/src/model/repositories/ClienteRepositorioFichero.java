package model.repositories;

import java.util.List;
import java.util.Optional;

import model.adapters.AdaptadorSerializadoMapeable;
import model.data.Cliente;

public class ClienteRepositorioFichero implements ClienteRepositoriable {
	private String path = "Clientes.dat";
	private String mapaPath = "mapaClientes.dat";
	private AdaptadorSerializadoMapeable<String, Cliente> adapter = new AdaptadorSerializadoMapeable<>(path, mapaPath);
	private List<Cliente> clientes;

	public ClienteRepositorioFichero() {
		clientes = adapter.leerTodos();
	}

	@Override
	public List<Cliente> findClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Cliente> findClienteByDni(String dni) {
		// TODO Auto-generated method stub
		return null;
	}
}
