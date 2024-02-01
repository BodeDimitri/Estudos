package enteties;

public class FileReaderProducts {
	public String nome;
	public Double preco;
	public Double quantidade;
	
	public FileReaderProducts() {
		
	}

	public FileReaderProducts(String nome, Double preco, Double quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getTotal() {
		return this.preco * this.quantidade;
	}
	
}
