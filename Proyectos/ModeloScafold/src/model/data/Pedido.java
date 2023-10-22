package model.data;

import java.time.LocalDate;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class Pedido {
	//propiedades
	private long numeroDeSerie;
	private LocalDate fecha;
	private Cliente cliente;
	private Set<LineaPedido> lineasPedido;
	
	public Pedido(long numeroDeSerie, LocalDate fecha, Cliente cliente, Set<LineaPedido> lineasPedido) {
		this.numeroDeSerie = numeroDeSerie;
		this.fecha = fecha;
		this.cliente = cliente;
		this.lineasPedido = lineasPedido;
	}
	
	public void addLinea(Articulo articulo,int cantidad) {
		lineasPedido.add(new LineaPedido(articulo, cantidad));
	}
	public void deleteLinea(Articulo articulo) {
		//TODO
	}
	
	public float getCuantia() {
		//recorre mapa para retornar total
		float total=0;
		for (LineaPedido linea : lineasPedido) {
			total+=linea.getSubTotal();
		}
		return total;
	}
	public boolean contains(Articulo articulo) {
		return lineasPedido.stream().anyMatch((linea)->{
			return linea.getArticulo().equals(articulo);
		});
	}

	public long getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public Set<LineaPedido> getLineas(){
		return lineasPedido;
	}
	
	
	
	
}
