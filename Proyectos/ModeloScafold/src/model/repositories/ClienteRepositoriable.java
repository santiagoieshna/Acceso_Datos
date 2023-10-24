package model.repositories;

import java.util.List;
import java.util.Optional;

import model.data.Cliente;

public interface ClienteRepositoriable {
	public List<Cliente> findClientes();
	public Optional<Cliente> findClienteByDni(String dni);
}
