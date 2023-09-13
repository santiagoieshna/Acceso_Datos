package models;

public class Articulo {
	private String id;
	private String description;
	private Float price;

	public Articulo(String id, String description, Float price) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public Float getPrice() {
		return price;
	}

}
