package Chapter11.Inheritance.Commission;

public class CommissionBaseComposition {
    /*(Recommended: Using Composition Rather Than Inheritance) Many programs written
with inheritance could be written with composition instead, and vice versa. Rewrite class BasePlusCommissionEmployee (Fig. 9.11) of the CommissionEmployee–BasePlusCommissionEmployee hierarchy so that it contains a reference to a CommissionEmployee object, rather than inheriting from class
CommissionEmployee. Retest BasePlusCommissionEmployee to demonstrate that it still provides the
same functionality.*/
    private Commission commission;
    private double baseSalary;


    public CommissionBaseComposition(String firstName, String lastName,
                                     String socialSecurityNumber, double grossSales,
                                     double commissionRate, double baseSalary) {
        commission = new Commission(firstName, lastName, socialSecurityNumber,grossSales, commissionRate);
        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }
    public CommissionBaseComposition() {}       // no args constructor
    private static void validateBaseSalary(double baseSalary) {
        boolean isInvalid = baseSalary < 0.0;
        if (isInvalid) {
            throw new IllegalArgumentException("Base Salary cannot be negative");
        }
    }
    public String getFirstName() {
        return commission.getFirstName();
    }
    public String getLastName() {
        return commission.getLastName();
    }
    public String getSocialSecurityNumber() {
        return commission.getSocialSecurityNumber();
    }
    public  void setGrossSales(double grossSales) {
        commission.setGrossSales(grossSales);
    }

    // return gross sales amount
    public double getGrossSales() {
        return commission.getGrossSales();
    }

    // set commission rate
    public void setCommissionRate(double commissionRate) {
        commission.setCommissionRate(commissionRate);
    }

    // return commission rate
    public double getCommissionRate() {
        return commission.getCommissionRate();
    }
    public Commission getCommission() {
        return commission;
    }

    public void setCommission(Commission commission) {
        this.commission = commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    // calculate earnings
    public double earnings() {
        return getBaseSalary() + commission.earnings();
    }
    // return String representation of CommissionEmployee object
    // indicates that this method overrides a superclass method
    public String toString() {
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f","base-salaried commission employee"
                , commission.getFirstName(), commission.getLastName(),"social security number", commission.getSocialSecurityNumber(),
                "gross sales", commission.getGrossSales(), "commission rate", commission.getCommissionRate(), "Base Salary", baseSalary);
    }
}
