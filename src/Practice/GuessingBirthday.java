package Practice;

import java.util.Scanner;

public class GuessingBirthday {
    public static void birthdayGuess() {
         String set1 =
                 """                 
                 9 11 13 15
                 17 19 21 23
                 1 3 5 7
                 25 27 29 31""";

         String set2 =
                 """
                 2 3 6 7
                 10 11 14 15
                 26 27 30 31
                 18 19 22 23""";
         String set3 =
                 """                 
                 12 13 14 15
                 20 21 22 23
                 28 29 30 31
                 4 5 6 7""";

         String set4 =
                 """
                 8 9 10 11
                 28 29 30 31
                 12 13 14 15
                 24 25 26 27""";

         String set5 =
                 """                 
                 20 21 22 23
                 24 25 26 27
                 16 17 18 19
                 28 29 30 31""";

         int day = 0;

         // Create a Scanner
         Scanner input = new Scanner(System.in);
        System.out.println("""
                WELCOME TO MY BIRTHDAY GUESSING APP,
                LET ME GUESS YOUR BIRTHDAY CORRECTLY
                
                """);

         // Prompt the user to answer questions
         System.out.print("Is your birthday in Set1?\n");
         System.out.println(set1);
         System.out.println("""
                 
                 0 --> No or 1 --> Yes""");
         int answer = input.nextInt();

         if (answer == 1)
             day += 1;

         // Prompt the user to answer questions
         System.out.print("\nIs your birthday in Set2?\n");
         System.out.println(set2);
        System.out.println("""
                 
                 0 --> No or 1 --> Yes""");
         answer = input.nextInt();

         if (answer == 1)
             day += 2;

         // Prompt the user to answer questions
         System.out.print("\nIs your birthday in Set3?\n");
         System.out.println(set3);
        System.out.println("""
                 
                 0 --> No or 1 --> Yes""");
         answer = input.nextInt();

         if (answer == 1)
             day += 4;

         // Prompt the user to answer questions
         System.out.print("\nIs your birthday in Set4?\n");
         System.out.println(set4);
        System.out.println("""
                 
                 0 --> No or 1 --> Yes""");
         answer = input.nextInt();
         if (answer == 1)
             day += 8;

         // Prompt the user to answer questions
         System.out.println("\nIs your birthday in Set5?\n");
         System.out.println(set5);
        System.out.println("""
                 
                 0 --> No or 1 --> Yes""");
         answer = input.nextInt();

         if (answer == 1)
             day += 16;

         String pos;
         if (day == 1 || day == 21 || day == 31) {
             pos = "st";
         } else if (day == 2 || day == 22) {
             pos = "nd";
         } else {
             pos = "th";
         }
        System.out.printf("%nYour birthday is the %d%s day of the month!%n%n", day, pos);
    }
}

