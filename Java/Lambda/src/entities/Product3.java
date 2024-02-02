package entities;

public class Product3 {
	
	public String product;
	public Double price;
	
	public Product3(String product, Double price) {
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
	
	public static String staticUpperCaseName(Product3 p) {
		return p.getProduct().toUpperCase();
	}
	
	public String nonstaticUpperCaseName() {
		 return product.toUpperCase();
	}
	
	@Override
	public String toString() {
		return this.product + ": " + this.price;
	}
		
}
