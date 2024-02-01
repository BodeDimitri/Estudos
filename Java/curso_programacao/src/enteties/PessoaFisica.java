package enteties;

public class PessoaFisica {
	public String nome;
	public Double rendaAnual;
	public Double gastosCSaude;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosCSaude) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
		this.gastosCSaude = gastosCSaude;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public Double getGastosCSaude() {
		return gastosCSaude;
	}

	public void setGastosCSaude(Double gastosCSaude) {
		this.gastosCSaude = gastosCSaude;
	}
	
	public void checarGastosPF() {
		double conta = 0.0;
		if(this.rendaAnual <=  20000.00) {
			 conta = ((15 / 100) * this.rendaAnual) + this.rendaAnual;
		}
		if (this.rendaAnual > 20000.00) {
			 conta = ((25 / 100) * this.rendaAnual) + this.rendaAnual;
		}
		setRendaAnual(conta);
		if(this.gastosCSaude > 0) {
			double valorSaude = (50/100) * conta;
			setRendaAnual(valorSaude);
		}
	}
	
}
