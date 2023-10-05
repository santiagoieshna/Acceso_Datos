package model.repositories;

import java.util.List;

import model.data.Dependiente;
import objectMother.DependienteOM;

public class DependienteRepositorioFOM implements DependienteRepositorio {
	List<Dependiente> dependientes;
	
	
	public DependienteRepositorioFOM() {
		super();
		this.dependientes = new DependienteOM().genDependientes();
	}


	@Override
	public List<Dependiente> findAll() {
		return null;
	}

}
