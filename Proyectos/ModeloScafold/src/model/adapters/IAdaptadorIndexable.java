package model.adapters;

import java.util.List;

public interface IAdaptadorIndexable<K,S> {

	public S leer(K k);
	
	public List<S> leerTodos();

	public boolean grabar(S s, K k);
}
