package entities;

public class TaxPayer {
	
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpeding;
	
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpeding) {
		
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpeding = educationSpeding;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpeding() {
		return educationSpeding;
	}

	public void setEducationSpeding(double educationSpeding) {
		this.educationSpeding = educationSpeding;
	}
	
	public double salaryTax() {
		
		 double sal = salaryIncome/12;
		 
		 if (sal >= 5000.00) {
			 
			 return salaryIncome * 0.2;
			 
		 }else if (sal >= 3000.00) {
			 
			 return salaryIncome * 0.1;
			 
		 }else {
			 
			 return 0.0;
		 }
		 
	}
	
	public double servicesTax() {
		
		if (servicesIncome > 0.0) {
			
			return servicesIncome * 0.15;
			
		}else {
			
			return 0.0;
		}
	}
	
	public double capitalTax() {
		
		if (capitalIncome > 0.0) {
			
			return capitalIncome * 0.2;
		}
		else {
			
			return 0.0;
		}
	}
	
	public double grossTax() {
		
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	public double taxRebate() {
		
		double heEdSpending = educationSpeding + healthSpending;
		double percentageGrossTax = grossTax() * 0.3;
		
		if (heEdSpending >= percentageGrossTax ) {
			
			return percentageGrossTax;
			
		}else {
			
			return heEdSpending;
		}
	}
	
	public double netTax() {
		
		return grossTax() - taxRebate();
	}
	
	
	

}
