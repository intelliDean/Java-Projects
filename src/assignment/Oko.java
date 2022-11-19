package assignment;

import java.security.SecureRandom;
import java.util.Scanner;

public class Oko {
        private static final SecureRandom randomNumbers = new SecureRandom();
       private enum Status {CONTINUE, WON, LOST};
        private static final int DON = 2;
        private static final int TREY = 3;
        private static final int SEVEN =7;
        private static final int YO_LEVEN = 11;
        private static final int JACKPOT = 12;

        public static void main(String[] args) {
            OkoClass player = new OkoClass();
            Scanner input = new Scanner(System.in);

            //Prompt for player to input name
            System.out.println("Enter name to continue");
            String name = input.nextLine();
            //Setting name, using the object to call the method.
            player.setName(name);
            System.out.println("Enter age to continue");
            int age = input.nextInt();
            //Setting the age, using the object go call the method
            player.setAge(age);

            //The age condition
            if(age >= 18) {
                System.out.println("""
                        \t\t\t\t\t\t\t\tGAME INSTRUCTION\s
                        You roll two dice. Each die has six faces, which contain one, two, three, four, five and
                        six spots, respectively. After the dice have come to rest, the sum of the spots on the two
                        upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum
                        is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the
                        sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
                        you must continue rolling the dice until you “make your point” (i.e., roll that same
                        point value). You lose by rolling a 7 before making your point. You have 3 chances after the tie.
                        Good luck!
                        """);

                //Prompt to know if player would like to continue
                System.out.println("\nPress 1 to continue or any number to exit");
                int cont = input.nextInt();

                if(cont == 1) {
                    System.out.println("\nMake deposit to continue. Minimum of #500");
                    double money = input.nextDouble();
                    player.deposit(money);
                    double win = money * 3;

                    if (money >= 500) {
                    int myPoint = 0;
                    Status gameStatus;
                    int sumOfDice = rollDice();


                        switch (sumOfDice) {
                            case TREY, JACKPOT -> {
                                gameStatus = Status.WON;
                                break;
                            }
                            case SEVEN, DON, YO_LEVEN -> {
                                gameStatus = Status.LOST;
                                break;
                            }
                            default -> {
                                gameStatus = Status.CONTINUE;
                                myPoint = sumOfDice;
                                System.out.printf("Point is %d%n", myPoint);
                                break;
                            }
                        }
                        for (int i = 1; i <= 3; i++) {
                            System.out.println("\nPress 1 to try once more or any other number to exit");
                            int reply = input.nextInt();
                            if (reply == 1) {
                                sumOfDice = rollDice();
                                if (sumOfDice == myPoint) {
                                    gameStatus = Status.WON;
                                    break;
                                }
                                if (sumOfDice == SEVEN) {
                                    gameStatus = Status.LOST;
                                    break;
                                } else {
                                    System.out.printf("Point is %d%n", sumOfDice);
                                }
                            }
                        }
                        if (gameStatus == Status.WON) {

                            System.out.printf("%nCongratulations %s. You won!", name);
                            System.out.printf("%nYou won ₦%.2f%n", win);
                        } else {
                            System.out.printf("%nSorry %s. %nYou lost!%n", name);
                            System.out.println("\nDeposit to play again");
                        }
                    }
                }
            }
        }

        public static int rollDice() {
            int die1 = 1 + randomNumbers.nextInt(6);
            int die2 = 1 + randomNumbers.nextInt(6);
            int sum = die1 + die2;
            System.out.printf("%nYour first die was %d %nYour second die was %d", die1, die2);
            System.out.printf("%nTherefore, you rolled %d + %d = %d%n", die1, die2, sum);
            return sum;
        }
    }

