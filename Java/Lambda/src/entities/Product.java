package entities;

public class Product {
	
	public String product;
	public Double price;
	
	public Product(String product, Double price) {
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
	
	public static boolean staticProductPredicate(Product p) { //Metodo statico funciona com o produto passado para ele
		return p.getPrice() <= 100.00;
	}
	
	public boolean nonstaticProductPredicate() { // acessa o proprio objeto, o this.price
		return price <= 100.00;
	}
	
	@Override
	public String toString() {
		return this.product + ": " + this.price;
	}
}
