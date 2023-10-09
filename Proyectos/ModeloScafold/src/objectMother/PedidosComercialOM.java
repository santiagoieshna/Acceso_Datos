package objectMother;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import model.data.Cliente;
import model.data.LineaPedido;
import model.data.PedidoComercial;
import model.data.Vendedor;

public class PedidosComercialOM {
	public ArrayList<PedidoComercial> getPedidosComerciales(){
		ArrayList<PedidoComercial> listaPedidosComerciales = new ArrayList();
		
		for(int i=0; i<=27; i++) {
			
			listaPedidosComerciales.add(new PedidoComercial(i, generateLocaldate(), getRandomCliente(), getRandomLineaPedido(), getRandomVendedor()));
		}
		return listaPedidosComerciales;
	}
	public HashSet<LineaPedido> getRandomLineaPedido() {
		return (HashSet<LineaPedido>) new LineaPedidoOM().genRandomLineas();
	}
	
	public LocalDate generateLocaldate() {
		return LocalDate.of(new Random().nextInt(24)+2000, new Random().nextInt(12), new Random().nextInt(27));
	}
	
	public Vendedor getRandomVendedor() {
		VendedorOM vendedorOM = new VendedorOM();
		ArrayList<Vendedor> listaVendedor= (ArrayList<Vendedor>) vendedorOM.getVendedores();
		return listaVendedor.get(new Random().nextInt(listaVendedor.size()));
	}
	
	public Cliente getRandomCliente() {
		ClientesOM clienteOM = new ClientesOM();
		ArrayList<Cliente> listaCliente = (ArrayList<Cliente>) clienteOM.getClientes();
		return listaCliente.get(new Random().nextInt(listaCliente.size()));
		
	}

}
