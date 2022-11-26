package chapter12.Polymophism.Employee;

import chapter8.DatePackage.Date;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // base salary per week

    // constructor
    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary, Date date) {
        super(firstName, lastName, socialSecurityNumber,
                grossSales, commissionRate, date);

        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }
    private static void validateBaseSalary(double baseSalary) {
        boolean isInvalid = baseSalary < 0.0;
        if (isInvalid) { // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
    }

    // set base salary
    public void setBaseSalary(double baseSalary) {
      validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }

    // return base salary
    public double getBaseSalary() {
        return baseSalary;
    }

    // calculate earnings; override method earnings in CommissionEmployee
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    // return String representation of BasePlusCommissionEmployee object
    @Override
    public String toString() {
        return String.format("%s %s; %n%s: $%,.2f",
                "Base-salaried", super.toString(),
                "Base salary", getBaseSalary());
    }

    // Driver method to execute the class
//    public static void main(String[] args) {
//        BasePlusCommissionEmployee base = new BasePlusCommissionEmployee(
//                "good", "boy", "112",
//                233123, .9, 221232);
//
//        System.out.println(base);
//    }
}
