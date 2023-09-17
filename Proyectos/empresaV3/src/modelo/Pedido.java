package modelo;

import java.util.Date;
import java.util.HashMap;

public class Pedido {
	private String referencia;
	private Cliente cliente;
	private AsistentePedido asistente;
	private Date fecha;
	private HashMap<Articulo, Integer> articulos;

	public Pedido(String referencia, Cliente cliente, AsistentePedido asistente, Date fecha,
			HashMap<Articulo, Integer> articulos) {
		super();
		this.referencia = referencia;
		this.cliente = cliente;
		this.asistente = asistente;
		this.fecha = fecha;
		this.articulos = articulos;
	}

	public Float calcularTotal() {
		Integer descuento = getDescuento();
		// totalpedido * ( 1 - descuento/100)
		return 0f;
	}

	private Integer getDescuento() {
		return cliente.getDescuento();
	};
	
	public String getClienteID() {
		return cliente.getDni();
	}
	public String getAsistenteVentasID() {
		return asistente.getDni();
	}
	
	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public HashMap<Articulo, Integer> getArticulos() {
		return articulos;
	}

	public void setArticulos(HashMap<Articulo, Integer> articulos) {
		this.articulos = articulos;
	}
}
