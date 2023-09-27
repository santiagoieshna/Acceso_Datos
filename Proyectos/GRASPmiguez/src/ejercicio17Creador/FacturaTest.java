package ejercicio17Creador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacturaTest {

	@Test
	void test() {
		Cliente cliente = new Cliente("Roberto");
		Pedido pedido = new Pedido("id123", "Factura pruebas",
				cliente,null);
		
		
	}

}
