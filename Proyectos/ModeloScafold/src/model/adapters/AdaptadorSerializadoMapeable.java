package model.adapters;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AdaptadorSerializadoMapeable<K,T extends Serializable> implements IAdaptadorIndexable<K, T> {
	private AdaptadorMultiobjetoSerializable<T> elementosAdaptador;
	private AdaptadorMonoObjetoSerializable<HashMap<K, Integer>> mapaAdaptador;
	private String pathElementos;
	private String pathMapa;
	private Map<K, Integer> mapa;
	
	public AdaptadorSerializadoMapeable(String pathElementos, String pathMapa) {
		this.pathElementos = pathElementos;
		this.pathMapa = pathMapa;
		inicializarMapa();
		mapa = mapaAdaptador.leer();
		elementosAdaptador=new AdaptadorMultiobjetoSerializable<>(pathElementos);
	}

	private void inicializarMapa() {
		mapaAdaptador=new AdaptadorMonoObjetoSerializable<>(pathMapa);
		if(mapaAdaptador.leer()==null) {
			mapaAdaptador.grabar(new HashMap<K, Integer>());
		}
	}

	@Override
	public T leer(K k) {
		return elementosAdaptador.leer(mapa.get(k));
	}
	
	

	@Override
	public boolean grabar(T s, K k) {
		boolean retorno=elementosAdaptador.grabar(s);
		if(retorno) {
			mapa.put(k, ultimoElemento());
			mapaAdaptador.grabar((HashMap<K, Integer>) mapa);
		}
		return retorno;
	}

	private Integer ultimoElemento() {
		try {
			return mapa.entrySet().stream()
					.mapToInt(Entry::getValue).max().getAsInt()+1;
		}catch (Exception e) {
			return 1;
		}
		
	}
	
	//Esto es nuevo
	@Override
	public List<T> leerTodos() {
		return elementosAdaptador.leerTodos();
	}
	
	
	
	
}
