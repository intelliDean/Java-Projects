package Chapter11.Inheritance.Commission;

public class CommissionBaseCompositionDriver {
    public static void main(String[] args) {
        CommissionBaseComposition comBase = new CommissionBaseComposition(
                "Michael", "Dean", "SVC-13-001",
                0.0, 0.8, 0.0);

        // get commission employee data
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is",
                comBase.getFirstName());
        System.out.printf("%s %s%n", "Last name is",
                comBase.getLastName());
        System.out.printf("%s %s%n", "Social security number is",
                comBase.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is",
                comBase.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", comBase.getCommissionRate());

        comBase.setGrossSales(5000);
        comBase.setCommissionRate(.1);
        System.out.printf("%s %.2f%n", "Base salary is",
                comBase.getBaseSalary());
        comBase.setBaseSalary(1000);


        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString", comBase.toString());
    }
}
