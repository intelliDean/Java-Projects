package chapter12.Polymophism.Employee;

import chapter8.DatePackage.Date;

public class CommissionEmployee extends Employee {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // constructor
    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber, double grossSales,
                              double commissionRate, Date date) {
        super(firstName, lastName, socialSecurityNumber,date);

        validateCommissionRate(commissionRate);
        validateGrossSales(grossSales);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    private static void validateCommissionRate(double commissionRate) {
        boolean isInvalid = commissionRate <= 0.0 || commissionRate >= 1.0;
        if (isInvalid) { // validate
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        }
    }
    private static void validateGrossSales(double grossSales) {
        boolean isInvalid = grossSales < 0.0;
        if (isInvalid) { // validate
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

    }

    // set gross sales amount
    public void setGrossSales(double grossSales) {
      validateGrossSales(grossSales);
        this.grossSales = grossSales;
    }

    // return gross sales amount
    public double getGrossSales() {
        return grossSales;
    }

    // set commission rate
    public void setCommissionRate(double commissionRate) {
       validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
    }

    // return commission rate
    public double getCommissionRate() {
        return commissionRate;
    }

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    // return String representation of CommissionEmployee object
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %n%s: %.2f",
                "Commission Employee", super.toString(),
                "Gross Sales", getGrossSales(),
                "Commission Rate", getCommissionRate());
    }

    // Driver method to execute the class
//    public static void main(String[] args) {
//        CommissionEmployee com = new CommissionEmployee(
//                "always", "me", "651",
//                231243.78, .2);
//        System.out.println(com);
//    }
}
