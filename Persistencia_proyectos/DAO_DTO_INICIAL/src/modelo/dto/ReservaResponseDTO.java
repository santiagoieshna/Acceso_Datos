package modelo.dto;

import java.sql.Date;
import java.util.Map;

public class ReservaResponseDTO {
	private String nombrePersona;
	private Map<String, Date> hoteles;
	
	
	
	public ReservaResponseDTO() {
		super();
	}
	
	public ReservaResponseDTO(String nombrePersona, Map<String, Date> hoteles) {
		super();
		this.nombrePersona = nombrePersona;
		this.hoteles = hoteles;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public Map<String, Date> getHoteles() {
		return hoteles;
	}
	public void setHoteles(Map<String, Date> hoteles) {
		this.hoteles = hoteles;
	}
	
	
}
