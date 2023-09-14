package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String referencia;
	private LocalDate fecha;
	private String cliente_id;
	private String dependiente_id;
	private List<Articulo> articulos;

	public Pedido(String referencia, LocalDate fecha, String cliente_id, String dependiente_id,
			List<Articulo> articulos) {
		super();
		this.referencia = referencia;
		this.fecha = fecha;
		this.cliente_id = cliente_id;
		this.dependiente_id = dependiente_id;
		this.articulos = articulos;
	}

	public Pedido(LocalDate fecha, Cliente cliente) {
		super();
		this.fecha = fecha;
		this.cliente_id = cliente_id;
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

	public String getReferencia() {
		return referencia;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getClienteID() {
		return cliente_id;
	}

	public String getDependiente_id() {
		return dependiente_id;
	}

}
