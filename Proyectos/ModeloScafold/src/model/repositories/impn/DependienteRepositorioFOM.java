package model.repositories.impn;

import java.util.List;

import model.data.Dependiente;
import model.repositories.ints.DependienteRepositorio;
import objectMother.DependienteOM;

public class DependienteRepositorioFOM implements DependienteRepositorio {
	
	private List<Dependiente> dependientes;
	
	
	public DependienteRepositorioFOM(List<Dependiente> dependientes) {
		super();
		this.dependientes = DependienteOM.getDependientes();
	}


	@Override
	public List<Dependiente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
