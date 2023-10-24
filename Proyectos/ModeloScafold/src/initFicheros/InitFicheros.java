package initFicheros;

import model.adapters.AdaptadorSerializadoMapeable;
import model.data.Articulo;
import model.data.Cliente;
import objectMother.ArticulosOM;

public class InitFicheros {
	public static void main(String[] args) {
		AdaptadorSerializadoMapeable<Integer,Articulo> adaptador = new AdaptadorSerializadoMapeable("articulos.dat", "mapaArticulos.dat");
		new ArticulosOM().getArticulos().stream().forEach(articulo -> adaptador.grabar(articulo,articulo.getId()));
		AdaptadorSerializadoMapeable<String,Cliente> adaptadorCliente = new AdaptadorSerializadoMapeable("Clientes.dat", "mapaCliente.dat");
	}
	
}
