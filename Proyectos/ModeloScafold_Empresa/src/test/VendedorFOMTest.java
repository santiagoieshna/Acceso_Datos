package test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import control.services.ClienteService;
import control.services.EmpleadosService;
import model.data.Ruta;
import model.data.Vendedor;
import model.repositories.impn.VendedorRepositorioFOM;
import objectMother.VendedorOM;

class VendedorFOMTest {

	@Test
	void test() {
		List<Vendedor> vendedores = new VendedorOM().getVendedores();
		List<Vendedor> centralysur = List.of(vendedores.get(0),vendedores.get(2));
		VendedorRepositorioFOM vendedorRepositorio=new VendedorRepositorioFOM();
		List<Vendedor> findByRoutes = vendedorRepositorio.findByRoutes(Ruta.sur,Ruta.central);
		assertTrue(centralysur.containsAll(findByRoutes));
		assertTrue(findByRoutes.containsAll(vendedorRepositorio.findByRoutesDos(Ruta.sur,Ruta.central)));
	}

	@Test
	void otro(){
		//getPedidosByVendedor
		ClienteService clienteService=new ClienteService();
		EmpleadosService empleadosService=new EmpleadosService(new VendedorRepositorioFOM());
		
		String dni = "1";
		clienteService.getPedidosByVendedor(empleadosService.getVendedorById(dni));
	}
}
