package lab7;
//LAB 7
//CHANGES ARE REQUIRED IN THIS FILE

//PayableInterfaceTest.java
//Tests interface Payable.

public class PayableInterfaceTest  {
	// why would i not do it like this ??
// 	private static Payable[] payableObjects;
	public static void main(String[] args) {


// TODO: CHANGES ARE REQUIRED HERE.
		
// CREATE ELEMENTS Payable array HERE.
//START CODE
		Payable[] payableObjects;
//END CODE

// TODO: MORE CHANGES ARE REQUIRED HERE.
// POPULATE THE ARRAY YOU CREATED WITH objects that implement Payable
// CHECK THE OUTPUT FILE AND REUSE THE DETAILS SUCH AS FIRST NAME, LAST NAME.
// ALSO REUSE SOCIAL INSURANCE NUMBER, AND OTHER DETAILS STATED FO INVOICE, ETC.
//START CODE
		/**
		 *  each class is a type of payable element
		 */
		Invoice gear = new Invoice("10112","gear", 3, 400.00);
		Invoice steering = new Invoice("31415","steering", 1, 56.99);
		SalariedNurse sNurse = new SalariedNurse("Ngozi", "Chukwu", "123-45-6789", 920.00);
		HourlyNurse hNurse = new HourlyNurse("Gloria", "Goodwill", "101-21-3141", 22.80, 35.00);
		CommissionNurse cNurse = new CommissionNurse("Peace","Udo","516-17-1819", 13100.00, 0.44);
		BasePlusCommissionNurse bpcNurse = new BasePlusCommissionNurse("Chi", "Oma", "202-12-2232", 7000.00, 0.04, 550.00 );
	
		
		// fill payable object array with payable elements
		payableObjects = new Payable[6];
		payableObjects[0] = gear;
		payableObjects[1] = steering;
		payableObjects[2] = sNurse;
		payableObjects[3] = hNurse;
		payableObjects[4] = cNurse;
		payableObjects[5] = bpcNurse;

//END CODE

		System.out.println(
				"Invoices and Nurses processed polymorphically:\n"); 

   // generically process each element in array payableObjects
		for (Payable currentPayable : payableObjects) {
      // output currentPayable and its appropriate payment amount
			System.out.printf("%s\n",currentPayable.toString()); 
			
         
			if (currentPayable instanceof BasePlusCommissionNurse) {
         // downcast Payable reference to 
         // BasePlusCommissionNurse reference
				BasePlusCommissionNurse nurse = 
						(BasePlusCommissionNurse) currentPayable;

				double oldBaseSalary = nurse.getBaseSalary();
				nurse.setBaseSalary(1.10 * oldBaseSalary);
				System.out.printf(
						"new base salary with 10%% increase is: $%,.2f\n",
						nurse.getBaseSalary());
			} 
			
	// nearly done but getting multiple print outs and only one set is doing the calculations the code under needs to be reviewed			
			

// TODO: INSERT YOUR PRINT STATEMENT HERE. 
//ENSURE THAT YOUR OUTPUT FOLLOWS THE SAMPLE OUTPUT PROVIDED
//START CODE
			System.out.printf("%s%.2f %n%n","earned : $",currentPayable.getPaymentAmount());
		
		}	
	}
}

