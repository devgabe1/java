package entities;

public class companyPayer extends Payer{

	private int employees;
	
	public companyPayer() {
	}
	
	public companyPayer(String name, double anualIncome, int employees) {
		super(name, anualIncome);
		this.employees = employees;
	}
	
	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	@Override
	public Double taxPaid() {
		double tax = 0;
		if(employees < 10) {
			tax = anualIncome * 0.16;
		}
		else {
			tax = anualIncome * 0.14;
		}
		return tax;
	}
}
