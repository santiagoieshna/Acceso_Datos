package objectMother;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.data.Dependiente;
import utiles.UtilesPersona;

public class DependienteOM {
	
	public static List<Dependiente> getDependientes(int ammount){
		List<Dependiente> dependientes = new ArrayList<>();
		
		for (int i = 0; i < ammount; i++) {
			
			String dni = UtilesPersona.genDNI();
			String nombreDependiente = UtilesPersona.genFakeName();
			Integer mostrador= new Random().nextInt(45);
			
			dependientes.add(new Dependiente(dni,nombreDependiente, mostrador));
		}

		
		return dependientes;
	}
}
