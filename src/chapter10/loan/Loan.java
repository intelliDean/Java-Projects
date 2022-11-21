package chapter10.loan;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /**
     * Default constructor
     */
    public Loan() {
        this(2.5, 1, 1000);
    }

    // Construct a loan with specified annual interest rate,
   // number of years, and loan amount
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        validateInterestRate(annualInterestRate);
        validateNumberOfYears(numberOfYears);
        validateLoanAmount(loanAmount);
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }
    public static void validateInterestRate(double annualInterestRate) {
        boolean isNotValid = annualInterestRate < 0;
        if (isNotValid) throw new IllegalArgumentException("Invalid Interest rate");
    }
    public static void validateNumberOfYears(int numberOfYears) {
        boolean isNotValid = numberOfYears < 0;
        if (isNotValid) throw new IllegalArgumentException("Invalid number of year");
    }
    public static void validateLoanAmount(double loanAmount) {
        boolean isNotValid = loanAmount < 0;
        if (isNotValid) throw new IllegalArgumentException("Invalid Interest rate");
    }

    /**
     * Return annualInterestRate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Set a new annualInterestRate
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        validateInterestRate(annualInterestRate);
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * Return numberOfYears
     */
    public int getNumberOfYears() {
        return numberOfYears;
    }

    /**
     * Set a new numberOfYears
     */
    public void setNumberOfYears(int numberOfYears) {
        validateNumberOfYears(numberOfYears);
        this.numberOfYears = numberOfYears;
    }

    /**
     * Return loanAmount
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * Set a new loanAmount
     */
    public void setLoanAmount(double loanAmount) {
        validateLoanAmount(loanAmount);
        this.loanAmount = loanAmount;
    }

    /**
     * Find monthly payment
     */
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    }

    /**
     * Find total payment
     */
    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }

    /**
     * Return loan date
     */
    public java.util.Date getLoanDate() {
        return loanDate;
    }
}