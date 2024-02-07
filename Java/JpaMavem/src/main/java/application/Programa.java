package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Carlos", "carlosmail.com"); // O Id esta nulo pois o proprio banco de dados atribui um valor para elas
		
		
		//Primeiro cria uma Factory e depois criamos um EntityManager
		// Aqui você vai usar o apelido que colocamos anteriormente no arquivo persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		
		em.getTransaction().begin(); //E necessario indicar que estamos começando uma transação
		em.persist(p1); //Chamando o EntityManager e depois usando o persist permite que a objeto seja salvo no banco de dados

		
		Pessoa p = em.find(Pessoa.class, 1); //find e usado para encontrar um objeto,primeiro e informado a classe e depois o id
		
		Pessoa p2 = em.find(Pessoa.class, 2); // Esse objeto vai ser excluido
		
		em.remove(p2); //Para apagar e so usar o remove, mas alem disso o objeto dem de estar instanciado
		
		
		
		em.getTransaction().commit(); //Encerra o envio de informação ao banco de dados
		System.out.println("Encontrado: "+ p);
		System.out.println("Funcionou");
		

		em.close(); //Sempre importante fechar
		emf.close(); 
	}

}
