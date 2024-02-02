package entities;

public class Product2 {
	
	public String product;
	public Double price;
	
	public Product2(String product, Double price) {
		this.product = product;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonstaticPriceUpdate() {
		price = price * 1.1;
	}
	
	@Override
	public String toString() {
		return this.product + ": " + String.format("%.2f", price);
	}
}