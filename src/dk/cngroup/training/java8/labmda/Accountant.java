package dk.cngroup.training.java8.labmda;

public class Accountant {
	void payTaxes (TaxLaw taxLaw, double income){
		System.out.println("You have to pay "+ taxLaw.calculateTaxes(income)+" in taxes.");
	}
}
