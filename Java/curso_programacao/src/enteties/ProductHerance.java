package enteties;

public class ProductHerance {

	protected String name;
	protected Double price;
	
	public ProductHerance() {
		
	}

	public ProductHerance(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return "Nome: " + this.name +  " " + " Preço: $" + this.price;
	}
}
