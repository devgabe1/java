package entities;

public class individualPayer extends Payer{
	
	private Double healthExpenditures;
	
	public individualPayer() {
	}
	
	public individualPayer(String name, double anualIncome, double healthExpenditures, double healthExpenditures2) {
		super(name, anualIncome, healthExpenditures);
		healthExpenditures = healthExpenditures2;
	}
	
	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double taxPaid() {
		double tax = 0;
		if (anualIncome < 20000) {
			tax = (anualIncome * 0.15) - (healthExpenditures * 0.5);
		}
		else {
			tax = (anualIncome * 0.25) - (healthExpenditures * 0.5);
		}
		return tax;
	}
}
