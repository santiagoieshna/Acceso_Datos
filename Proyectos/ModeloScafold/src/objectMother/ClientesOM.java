package objectMother;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.data.Cliente;
import utiles.UtilesPersona;

public class ClientesOM {
	
	public static List<Cliente> getClientes(int ammount){
		List<Cliente> clientes = new ArrayList<>();
		for (int i = 0; i < ammount; i++) {
			
			String dni = UtilesPersona.genDNI();
			String nombreCliente = UtilesPersona.genFakeName();
			Boolean descuento= new Random().nextBoolean();
			
			clientes.add(new Cliente(dni,nombreCliente, descuento));
		}

		
		return clientes;
	}

	

	

	
}
