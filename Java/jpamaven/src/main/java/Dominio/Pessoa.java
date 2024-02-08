package Dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity; //Mantenha o persistence ao Hibernate
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Pois se trata de uma entidade no nosso banco de dados
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NomeCompleto") //Caso você queira mudar o nome na tabela, não se esqueça que não pode dar espaço
	private String nome;
	private String email;
	
	public Pessoa() {
		
	}

	public Pessoa(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	
	
}
