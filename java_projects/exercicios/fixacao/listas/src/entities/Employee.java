package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;

	
	public int getId() {
		return id;
		
	}
	public Employee() {
	}

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return id + ", " + name + ", " + salary;
	}

	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}
}
