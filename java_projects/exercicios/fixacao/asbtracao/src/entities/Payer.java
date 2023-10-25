package entities;

public abstract class Payer {
	
	private String name;
	protected Double anualIncome;
	
	public Payer() {
	}

	public Payer(String name, double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public abstract Double taxPaid();
}
