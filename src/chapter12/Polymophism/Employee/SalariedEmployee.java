package chapter12.Polymophism.Employee;

import chapter8.DatePackage.Date;

public class SalariedEmployee extends Employee {
    private double weeklySalary;


    // constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary, Date date) {

        super(firstName, lastName, socialSecurityNumber, date);

        validateWeeklySalary(weeklySalary);
        this.weeklySalary = weeklySalary;
    }
    private static void validateWeeklySalary(double weeklySalary) {
        boolean isInvalid = weeklySalary < 0.0;
        if (isInvalid) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
    }

    // set salary
    public void setWeeklySalary(double weeklySalary) {
        validateWeeklySalary(weeklySalary);
        this.weeklySalary = weeklySalary;
    }

    // return salary
    public double getWeeklySalary() {
        return weeklySalary;
    }
    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        return getWeeklySalary();
    }
    // return String representation of SalariedEmployee object
    @Override
    public String toString() {
        return String.format("Salaried Employee: %s%nWeekly Salary: ₦%,.2f",
        super.toString(), getWeeklySalary());
    }
    @Override
    public double getPaymentAmount() {
        return earnings();
    }

    // Driver method to execute the class
//    public static void main(String[] args) {
//        SalariedEmployee m = new SalariedEmployee("we", "me", "234", 239045.23);
//        System.out.println(m);
//    }
////    @Override
////    public BigDecimal getSalary(BigDecimal salary) {
////        return salary.multiply(BigDecimal.valueOf(2));
////    }
}
