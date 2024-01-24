package enteties;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enteties.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Departament departament; // Worker contem um departamento
	private List<HourContract> contracts = new ArrayList<>(); // Um Worker tem varios contratos e por isso e instanciado com uma lista 
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) { //Lista não são colocadas no constructor, apenas inicia ela vazia
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contract) {
		this.contracts.add(contract); //Adiciona o contrato a lista de contratos
	}
	
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		double sum = this.baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) { //Iterando a lista e retornando o totalValue + baseSalary
			cal.setTime(c.getDate()); //O tempo vamos levar baseado no contrato
			int c_month = cal.get(Calendar.MONTH); //Retorna as informações
			int c_year = cal.get(Calendar.YEAR);
			if(year == c_year && month == c_month) { //Checha se confere com os nossos parâmetros
				sum += c.totalValue(); //Base do salário + totalValue(HourContract)
			}
		}
		return sum;
	}
	
}
