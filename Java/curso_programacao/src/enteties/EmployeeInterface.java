package enteties;

public class EmployeeInterface implements Comparable<EmployeeInterface> {
	private String name;
	private Double salary;
	
	public EmployeeInterface(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(EmployeeInterface o) {
		return name.compareTo(o.getName());
	}
	
}
