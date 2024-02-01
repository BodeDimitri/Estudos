package enteties;

public class Products2 {
	private String Name;
	private double Price;
	private int Quantitiy;
	
	public Products2(String name, double price, int quantity){ //Servem para você não instanciar algo sem valor ou nulo e forçar a inserção de dados
		this.Name = name; //this e usado para diferenciar o atributo do metodo para o do construtor
		this.Price = price;
		this.Quantitiy = quantity;
	}
	
	public Products2(String name, double price){ //Sobrecarga sem a quantidade
		this.Name = name; 
		this.Price = price;
		this.Quantitiy = 0;
	}
	
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
	
	public void setName(String name) {
		this.Name = name;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setPrice(double price) {
		this.Price = price;
	}
	
	public double getPrice() {
		return Price;
	}
	
	public int getQuantity() {
		return Quantitiy;
	}
	
	public String toString() {
		return "Nome do produto: " + this.Name + ", $" + this.Price + ", Unidades:" + this.Quantitiy + ", Total:$" + this.TotalValueInStock(); 
	}
	
	public String UpdatedProducts() {
		return "Atualizado: " + this.Name + ", $" + this.Price + ", " + this.Quantitiy + ", Total:$" + this.TotalValueInStock();
	}
}
