package ejercicioacoplamientomal16;

public interface Addressable {

	public String getCalle();
	public String getCiudad();
	public String getEstado();
	public String getCodigoPostal();
	
	public Boolean isSameCalle(Addressable addresable);
	
	
}
