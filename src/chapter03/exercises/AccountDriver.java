package chapter03.exercises;

import java.util.Scanner;

public class AccountDriver {
    public static void main(String[] args) {
        Account myAccount = new Account("Michael Dean", 2000);

        Scanner input = new Scanner(System.in);

        System.out.println("input name");
        String name = input.nextLine();
        myAccount.setName(name);

        System.out.println("\nHow much do you want to deposit?");
        double deposit = input.nextDouble();
        myAccount.deposit(deposit);
        System.out.printf("%n%s, your balance: ₦%,.2f%n", name, myAccount.getBalance());

        System.out.println("\nWithdrawal amount");
        double withdraw = input.nextDouble();
        myAccount.withdraw(withdraw);
        System.out.printf("%n%s, your new Balance: ₦%,.2f%n", name, myAccount.getBalance());
    }
}
