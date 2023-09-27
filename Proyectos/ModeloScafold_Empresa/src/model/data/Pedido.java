package model.data;

import java.time.LocalDate;
import java.util.Map;
import java.util.Map.Entry;

public abstract class Pedido {
	//propiedades
	private long numeroDeSerie;
	private LocalDate fecha;
	private Cliente cliente;
	private Map<Articulo,Integer> lineasPedido;
	
	public void addLinea(Articulo articulo,int cantidad) {
		lineasPedido.put(articulo, cantidad);
	}
	public void deleteLinea(Articulo articulo) {
		//TODO
	}
	
	public float getCuantia() {
		//recorre mapa para retornar total
		float total=0;
		for (Entry<Articulo,Integer> entry : lineasPedido.entrySet()) {
			total+=entry.getValue()*entry.getKey().getPrecio();
		}
		return total;
	}
}
