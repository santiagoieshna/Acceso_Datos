package models;

import java.util.Date;
import java.util.HashMap;

public class Pedido {
	private String referencia;
	private String clienteID;
	private Integer descuento;
	private String asistenteID;
	private Date fecha;
	private HashMap<Articulo, Integer> articulos;

	

	public Pedido(String referencia, String clienteID, Integer descuento, String asistenteID, Date fecha,
			HashMap<Articulo, Integer> articulos) {
		super();
		this.referencia = referencia;
		this.clienteID = clienteID;
		this.descuento = descuento;
		this.asistenteID = asistenteID;
		this.fecha = fecha;
		this.articulos = articulos;
	}

	public String getClienteID() {
		return clienteID;
	}

	public String getAsistenteID() {
		return asistenteID;
	}

	public Float calcularTotal() {
		Integer descuento = getDescuento();
		// totalpedido * ( 1 - descuento/100)
		return 0f;
	};
	
	private Integer getDescuento() {
		
		return descuento;
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
