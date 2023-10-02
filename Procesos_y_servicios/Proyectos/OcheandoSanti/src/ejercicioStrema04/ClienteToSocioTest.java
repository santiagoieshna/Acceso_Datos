package ejercicioStrema04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class ClienteToSocioTest {

	@Test
	void test() {
		List<Cliente> clientes = ClientesOM.getClientes();
		
		List<Socio> socios = clientes.stream()
		.map(cliente-> new Socio(cliente.getNombre(),(new Random().nextFloat()*1800)))
		.collect(Collectors.toList());
		
		
		
	}

}
