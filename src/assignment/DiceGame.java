package assignment;

public class DiceGame {
    private static String name;
    private static int age;
    private static double balance;

    public static void setName(String name) {
        DiceGame.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void setAge(int age) {
        if (age >= 18) {
            DiceGame.age = age;
        } else {
            System.out.print("You are below 18");
            System.exit(0);
        }
    }

    public static int getAge() {
        return age;
    }

    public static void deposit(double amount) {
        if (amount >= 200) {
            balance += amount;
        }
    }

    public static double getBalance() {
        return balance;
    }

    public static void withdraw(double amount) {
        if (balance >= 1000 && amount <= (balance - 200)) {
            balance -= amount;
        } else {
            System.out.print("Error!.");
        }
    }
}
