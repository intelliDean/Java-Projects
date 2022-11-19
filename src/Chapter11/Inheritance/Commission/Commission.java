package Chapter11.Inheritance.Commission;

public class Commission {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    public Commission(String firstName, String lastName, String socialSecurityNumber) {
        this(firstName, lastName, socialSecurityNumber, 0.0, 0.0);
    }

    // five-argument constructor
    public Commission(String firstName, String lastName,
                      String socialSecurityNumber, double grossSales,
                      double commissionRate) {
        // implicit call to Object's default constructor occurs here

        // if grossSales is invalid throw exception
        validateGrossSales(grossSales);
        // if commissionRate is invalid throw exception
        validateCommissionRate(commissionRate);
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    private static void validateGrossSales(double grossSales) {
        boolean isInvalid = grossSales < 0.0;
        if (isInvalid) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
    }
    private static void validateCommissionRate(double commission) {
        boolean isInvalid = commission <= 0.0 || commission >= 1.0;
        if (isInvalid) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
    }

    // return first name
    public String getFirstName() {
        return firstName;
    }

    // return last name
    public String getLastName() {
        return lastName;
    }

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
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

    // calculate earnings
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    // return String representation of CommissionEmployee object
    @Override // indicates that this method overrides a superclass method
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "Commission employee", firstName, lastName,
                "Social security number", socialSecurityNumber,
                "Gross sales", grossSales,
                "Commission rate", commissionRate);
    }
}