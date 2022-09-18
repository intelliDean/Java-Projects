package assignment;

import java.security.SecureRandom;
import java.util.Scanner;

public class TheCrapsGame {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status {CONTINUE, WON, LOST}
            static Scanner input = new Scanner(System.in);
            public static int game() {
                int die1 = 1 + randomNumbers.nextInt(6);
                int die2 = 1 + randomNumbers.nextInt(6);
                int sum = die1 + die2;
                System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
                return sum;
            }
            public static void play() {
                DiceGame.deposit(-100) ;
                int point = 0;
                int spin;
                Status gameStatus;
                int sumOfDice = game();

                switch (sumOfDice) {
                    case 2, 12 -> {
                        gameStatus = Status.WON;
                        break;
                    }
                    case 5, 6, 9, 10 -> {
                        gameStatus = Status.LOST;
                        break;
                    }
                    default -> {
                        gameStatus = Status.CONTINUE;
                        point = sumOfDice;
                        break;
                    }
                }
                if (gameStatus == Status.CONTINUE) {
                    System.out.println("Your point is: " + point);
                    System.out.println("\nNOW TO WIN YOU HAVE TO ROLL a 2 or a " + point);
                    System.out.print("press 1 to continue or 0 to exit game ->  ");
                    int cont = input.nextInt();
                    if (cont == 0) {
                        System.exit(3);
                    } else {
                        play();
                        if (game() == point || game() == 2) {
                            System.out.println("____JACKPOT!!!____");
                        } else {
                            System.out.println("try again");
                        }
                    }
                }
                else if (gameStatus == Status.LOST) {
                    System.out.println("\n    ____You Loss____   ");
//                    System.out.printf("%nName: %s    Age: %d    Balance: %,.1fNGN%n",
//                            DiceGame.getName(), DiceGame.getAge(), DiceGame.getBalance());
//                        System.out.print("press any key to play again or 0 to exit game ->  ");
//                        int cont = input.nextInt();
//                        if (cont == 0) {
//                            System.exit(2);
//                        } else {
//                            play();
//                        }
                }
                else {
                    System.out.println("\n    ____JACKPOT!!!____    ");
                    DiceGame.deposit(300);
//                    System.out.printf("%nName: %s    Age: %d    Balance: %,.1fNGN%n",
//                            DiceGame.getName(), DiceGame.getAge(), DiceGame.getBalance());
//                        System.out.print("press any key to play again or 0 to exit game ->  ");
//                        int cont = input.nextInt();
//                        if (cont == 0) {
//                            System.exit(1);
//                        }
//                        else {
//                            play();
//                        }
                }
            }
        }

