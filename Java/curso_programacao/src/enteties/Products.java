package enteties;

public class Products {
	public String Name;
	public double Price;
	public int Quantitiy;
	
	public double TotalValueInStock() {
		double result = Price * Quantitiy;
		return result;
	}
	
	public void AddProducts(int quantity) { //Palaver
		this.Quantitiy  = Quantitiy + quantity; //this.Quantity += quantity
	}
	
	public void RemoveProducts(int quantity) {
		this.Quantitiy  = Quantitiy - quantity; //this.Quantity += quantity
	}
	
	
	public String toString() {
		return "Nome do produto: " + this.Name + " $" + this.Price + " Unidades:" + this.Quantitiy + " Total:$ " + this.TotalValueInStock(); 
	}
	
	public String UpdatedProducts() {
		return "Atualizado: " + this.Name + ", $" + this.Price + ", " + this.Quantitiy + ",Total:$ " + this.TotalValueInStock();
	}
}
