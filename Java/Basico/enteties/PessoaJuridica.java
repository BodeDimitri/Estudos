package enteties;

public class PessoaJuridica {
	public String nome;
	public Double rendaAnual;
	public Integer nFuncionarios;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer nFuncionarios) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
		this.nFuncionarios = nFuncionarios;
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

	public Integer getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}
	
	public void checarGastosPJ() {
		double conta = 0.0;
		conta = ((16/100) * this.rendaAnual) + this.rendaAnual;
		if (this.nFuncionarios >= 10) {
			conta = ((14/100) * this.rendaAnual) + this.rendaAnual;
		}
		setRendaAnual(conta);
	}
}
