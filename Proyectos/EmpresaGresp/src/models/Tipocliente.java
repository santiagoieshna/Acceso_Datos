package models;

public enum Tipocliente {
	ESPORADICO(0), HABITUAL(20), PREMIUM(40);
	
	private Integer descuento;
	
	private Tipocliente(Integer descuento) {
		this.descuento=descuento;
		
	}

	public Integer getDescuento() {
		return descuento;
	}
	
	
	
}
