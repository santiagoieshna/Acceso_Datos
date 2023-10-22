package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import control.services.VentaService;
import model.repositories.ClienteRepositorio;
import model.repositories.PedidoComercialRepositoryFOM;
import model.repositories.PedidoRepositorio;

class PedidoRepositoryFOMTest {

	@Test
	void getPedidoByClienteTest() {
		VentaService ventaService=new VentaService(new PedidoRepositorio(), null, new ClienteRepositorio(), new PedidoComercialRepositoryFOM());
		assertEquals(1, ventaService.getPedidosByClienteDni("34839439").get(0).getNumeroDeSerie());
	}
	
	@Test
	void findPedidosWithArticulo() {
		//TODO
	}

}
