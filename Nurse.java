package lab7;
//LAB 7: STUDENTS ARE REQUIRED TO MAKE CHANGES TO THIS FILE.

//Nurse abstract superclass implements Payable.

public abstract class Nurse implements Payable {
private String firstName;
private String lastName;
private String socialSecurityNumber;

// three-argument constructor
public Nurse(String first, String last, String ssn) {
   firstName = first;
   lastName = last;
   socialSecurityNumber = ssn;
}

//CHANGES ARE REQUIRED HERE
// THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES. IN THIS SECTION OF YOUR CODE, INCLUDE ALL SUCH THAT APPLIES.

//START CODE
public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}
//END CODE
 


// return String representation of Nurse object
@Override
public String toString() {
   return String.format("%s %s\nsocial security number: %s", 
      getFirstName(), getLastName(), getSocialSecurityNumber());
}


// Note: We do not implement Payable method getPaymentAmount here so  
// this class must be declared abstract to avoid a compilation error.
} 

