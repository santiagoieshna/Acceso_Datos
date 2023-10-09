package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import model.data.Cliente;
import objectMother.ClientesOM;

class ClientesOMTest {

	@Test
	void testGetClientes() {
		Integer cantidad = 12;
		
		List<Cliente> clientes = ClientesOM.getClientes(cantidad);
		
		clientes.stream().forEach(cliente->{
			System.out.println(cliente.toString());
		});
		assertEquals(cantidad, clientes.size());
	}

}
