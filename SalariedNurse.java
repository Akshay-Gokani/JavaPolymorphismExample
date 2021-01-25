package lab7;
//CHANGES ARE REQUIRED IN THIS FILE
//LAB 6 - SalariedNurse.java
// THIS FILE WAS USED IN LAB 6 AND WILL BE REUSED NOW IN LAB 7

//SalariedNurse concrete class extends abstract class Nurse.

public class SalariedNurse extends Nurse  {
	private double weeklySalary;

// constructor
	public SalariedNurse(String firstName, String lastName, 
		String socialSecurityNumber, 
		double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber); 

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
				"Weekly salary must be >= 0.0");
		}

			this.weeklySalary = weeklySalary;
	} 

// set salary
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
				"Weekly salary must be >= 0.0");
		}

			this.weeklySalary = weeklySalary;
	} 

// return salary
	public double getWeeklySalary() {
		return weeklySalary;
	} 

// calculate earnings; override abstract method earnings in Nurse
	@Override
	public double getPaymentAmount() {
		return weeklySalary;
	}                                          

// return String representation of SalariedNurse object   
@Override                                                    
	public String toString() {                                     
		return String.format("salaried nurse: %s%n%s: $%,.2f",
		super.toString(), "weekly salary", getWeeklySalary());
	}


}
