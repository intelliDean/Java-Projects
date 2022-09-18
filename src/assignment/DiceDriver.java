package assignment;

import java.util.Scanner;

public class DiceDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("           THE CRAPS GAME            ");
        System.out.println("REGISTRATION ");

        System.out.print("Player name: ");
        DiceGame.setName(input.nextLine());

        System.out.print("Player age: ");
        DiceGame.setAge(input.nextInt());

        System.out.printf("%nWelcome %s%nYour account balance is: %,.1fNGN%nMake a deposit to play game%n",
                DiceGame.getName(), DiceGame.getBalance());
        System.out.print("deposit: ");
        DiceGame.deposit(input.nextDouble());
        int count = 0;
        while (DiceGame.getBalance() == 0) {
            System.out.println("Minimum amount deposit-able is 200.");
            System.out.println("Try depositing amount above 200.");
            System.out.print("\ndeposit: ");
            DiceGame.deposit(input.nextDouble());
        }
        System.out.printf("%nName: %s    Age: %d    Balance: %,.1fNGN%n",
                DiceGame.getName(), DiceGame.getAge(), DiceGame.getBalance());
        int i;
        for (int a = 0; a<= 3; a++) {
            System.out.print("press 1 to play or 0 to exit  ");
            i = input.nextInt();
            if (i == 1) TheCrapsGame.play();
            else if (i == 0) System.exit(2);
        }
    }
}
