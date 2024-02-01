package enteties;


public class UsedProducts extends ProductHerance {
	
	private String manufacturedDate;
	
	public UsedProducts() {
		
	}

	public UsedProducts(String name, Double price, String manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public String getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(String manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	@Override
	public String priceTag() {
		return "Nome: " + this.name +  " (Usado) " + " Preço: $" + this.price + " Data de fabricação: " + manufacturedDate;
	}

}
