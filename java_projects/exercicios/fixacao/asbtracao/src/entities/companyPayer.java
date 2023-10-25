package entities;

public class companyPayer extends Payer{

	private Double employees;
	
	public companyPayer() {
	}
	
	public companyPayer(String name, double anualIncome, double healthExpenditures, Double employees) {
		super(name, anualIncome, healthExpenditures);
		this.employees = employees;
	}
	
	public Double getEmployees() {
		return employees;
	}

	public void setEmployees(Double employees) {
		this.employees = employees;
	}

	@Override
	public Double taxPaid() {
		double tax = 0;
		if(employees > 10) {
			tax = anualIncome * 0.16;
		}
		else {
			tax = anualIncome * 0.14;
		}
		return tax;
	}
}
