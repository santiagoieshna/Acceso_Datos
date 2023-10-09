package objectMother;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.data.Dependiente;
import model.data.Ruta;
import model.data.Vendedor;
import utiles.UtilesPersona;

public class VendedorOM {
	public static List<Vendedor> getVendedores(int ammount){
		List<Vendedor> vendedores = new ArrayList<>();
		
		for (int i = 0; i < ammount; i++) {
			
			String dni = UtilesPersona.genDNI();
			String nombreDependiente = UtilesPersona.genFakeName();
			Ruta[] rutaArray= Ruta.values();
			Ruta ruta = rutaArray[new Random().nextInt(rutaArray.length)];
			
			vendedores.add(new Vendedor(dni,nombreDependiente, ruta));
		}

		
		return vendedores;
	}
}

