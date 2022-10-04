package chapter5;

public class Autopolicy {
    private String accountNumber; // policy account number
    private String makeAndModel; // car that the policy applies to
    private String state; // two-letter state abbreviation
        // constructor
    public Autopolicy(String accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }
         // sets the accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
         // returns the accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }
         // sets the makeAndModel
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }
         // returns the makeAndModel
    public String getMakeAndModel() {
        return makeAndModel;
    }
         // sets the state
    public void setState(String state) {
        if (state.length() == 2) {
        this.state = state;
        } else {
            System.out.println("Enter 2 Uppercase abbrev of the state");
        }
    }
         // returns the state
    public String getState() {
        return state;
    }
    // predicate method returns whether the state has no-fault insurance
    public boolean isNoFaultState() {
        boolean noFaultState; // determine whether state has no-fault auto insurance
        switch (getState()) { // get AutoPolicy object's state abbreviation
            case "MA", "NJ", "NY", "PA"-> {
                noFaultState = true;
            }
            default -> {
                noFaultState = false;
            }
        }
        return noFaultState;
    }


    public static void main(String[] args) {

        Autopolicy policy1 = new Autopolicy("2342345", "Toyota Camry", "NJ");

        Autopolicy policy2 = new Autopolicy("6657346", "Ford Fusion", "ME");

        Autopolicy policy3 = new Autopolicy("868849", "G-Wagon Benz", "MS");

         // display whether each policy is in a no-fault state
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
        policyInNoFaultState(policy3);

        policy1.setState("LA");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
        policyInNoFaultState(policy3);
    }

        // method that displays whether an AutoPolicy
        // is in a state with no-fault auto insurance
    public static void policyInNoFaultState(Autopolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf("Account №: %s; %nCar: %s; %nState %s %s a no-fault state%n%n",
                            policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                            (policy.isNoFaultState() ? "is": "is not"));
    }
}