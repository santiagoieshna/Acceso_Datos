package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String id;
	private LocalDate fecha;
	private Cliente cliente;
	private List<Articulo> articulos;

	public Pedido(String id, LocalDate fecha, Cliente cliente, List<Articulo> articulos) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.cliente = cliente;
		this.articulos = articulos;
	}

	public Pedido(LocalDate fecha, Cliente cliente) {
		super();
		this.fecha = fecha;
		this.cliente = cliente;
		this.articulos = new ArrayList<>();
	}

	public Float cuantiaTotal() {
		Float total = 0F;
		if (!articulos.isEmpty()) {
			for (Articulo articulo : articulos) {
				total += articulo.getPrice();
			}
		}
		return total;
	}
	/**
	 * Metodo que inserta un nuevo articulo en lka lista de articulos del pedido
	 * @param articulo
	 * @return true si se inserto correctamente
	 *  False cualquier error no esperado
	 */
	public boolean addArticulo(Articulo articulo) {
		return articulos.add(articulo);
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public String getId() {
		return id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
