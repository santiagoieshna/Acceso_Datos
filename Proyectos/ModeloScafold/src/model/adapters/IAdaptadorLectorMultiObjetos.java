package model.adapters;

import java.util.List;

public interface IAdaptadorLectorMultiObjetos<T> {
	
	public T leer(int posicion);
	
	//Nuevo por chaverin
	public List<T> leerTodos();


}
