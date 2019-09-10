package dk.cngroup.training.java8.labmda;

public class Main {
    public static void main(String[] args) {
        Accountant pavel= new Accountant();
        Accountant walid= new Accountant();
        Accountant pirateOndrej= new Accountant();

        TaxLaw czechLaw= income -> 19*income/100;
        TaxLaw moroccanLaw= income -> 31*income/100;
        TaxLaw pirateLaw= income -> 100*income/100;

        pavel.payTaxes(czechLaw,100);
        walid.payTaxes(moroccanLaw,100);
        pirateOndrej.payTaxes(pirateLaw,100);
        pirateOndrej.payTaxes(income -> 200*income/100,100);
    }
}
