package chapter15.balance;

public enum BalanceType {
    // declare contents of enum type
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);

    private final int value; // current menu option

    private BalanceType(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        BalanceType[] choices = BalanceType.values();
        System.out.println(choices[0]);
    }
}
