package enteties;

public class ImportedProduct extends ProductHerance {
	
	private Double customnsFee;
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, Double price, Double customnsFee) {
		super(name, price);
		this.customnsFee = customnsFee;
	}

	public Double getCustomnsFee() {
		return customnsFee;
	}

	public void setCustomnsFee(Double customnsFee) {
		this.customnsFee = customnsFee;
	}
	
	public Double totalPrice(Double price) {
		return price + customnsFee;
	}
	
	@Override
	public String priceTag() {
		return "Nome: " + name +  " " + " Preço: $" + totalPrice(price) + " Taxa: $" + customnsFee;
	}
	
}
