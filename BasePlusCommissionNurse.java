package lab7;
//CHANGES ARE REQUIRED IN THIS FILE
//LAB 6 - BasePlusCommissionNurse.java
// THIS FILE WAS USED IN LAB 6 AND WILL BE REUSED NOW IN LAB 7

//BasePlusCommissionNurse class extends CommissionNurse.

public class BasePlusCommissionNurse extends CommissionNurse { 
private double baseSalary; // base salary per week

// constructor
public BasePlusCommissionNurse(String firstName, String lastName, 
   String socialSecurityNumber,  
   double grossSales, double commissionRate, double baseSalary) {
   super(firstName, lastName, socialSecurityNumber, 
       grossSales, commissionRate);

   if (baseSalary < 0.0) { // validate baseSalary                  
      throw new IllegalArgumentException("Base salary must be >= 0.0");
   }

   this.baseSalary = baseSalary;                
}

// set base salary
public void setBaseSalary(double baseSalary) {
   if (baseSalary < 0.0) { // validate baseSalary                  
      throw new IllegalArgumentException("Base salary must be >= 0.0");
   }

   this.baseSalary = baseSalary;                
} 

// return base salary
public double getBaseSalary() {
   return baseSalary;
}

// calculate earnings; override method earnings in CommissionNurse
@Override                                                            
public double getPaymentAmount() {                                             
   return getBaseSalary() + super.getPaymentAmount();                        
} 

// return String representation of BasePlusCommissionNurse object
@Override                                                           
public String toString() {                                            
   return String.format("%s %s; %s: $%,.2f",                       
      "base-salaried", super.toString(),                            
      "base salary", getBaseSalary());                             
} 
}

