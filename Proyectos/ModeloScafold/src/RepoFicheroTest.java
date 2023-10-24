import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import model.data.Articulo;
import model.repositories.ArticuloRepositorioFichero;

class RepoFicheroTest {

	@Test
	void findAllTest() {
		ArticuloRepositorioFichero repo = new ArticuloRepositorioFichero();
		ArrayList<Articulo> articulos=(ArrayList<Articulo>) repo.findAll();
		for (Articulo articulo : articulos) {
			System.out.println(articulo.getPrecio());
		}
	}

}
