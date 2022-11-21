package Chapter11.Inheritance.Commission;

public class CommissionBase extends Commission {
    private double baseSalary; // base salary per week

    // five-argument constructor
    public CommissionBase(String firstName, String lastName,
                          String socialSecurityNumber, double grossSales,
                          double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }

    private static void validateBaseSalary(double baseSalary) {
        boolean isInvalid = baseSalary < 0.0;
        if (isInvalid) {
            throw new IllegalArgumentException("Base Salary cannot be negative");
        }
    }


    public void setBaseSalary(double baseSalary) {
        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }

    // return base salary
    public double getBaseSalary() {
        return baseSalary;
    }

    // calculate earnings
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    // return String representation of CommissionEmployee object
    @Override
    public String toString() {
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "base-salaried commission employee"
                , super.getFirstName(), super.getLastName(), "social security number", super.getSocialSecurityNumber(),
                "gross sales", super.getGrossSales(), "commission rate", super.getCommissionRate(), "Base Salary", baseSalary);
    }
}
