package Practice;

import java.util.Scanner;
    /*
A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.*/

public class School {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        for (int i = 1; i > 0; i++) {
           System.out.println("\nEnter your grade or 0 to quit");
            int reply = input.nextInt();
            if (reply != 0) {
                if (reply < 25) {
                    System.out.println("Olodo! You failed - F");
                }
                if (reply >= 25 && reply < 45) {
                    System.out.println("Sule! Na small remain, you for fail - E");
                }
                if (reply >= 45 && reply < 50) {
                    System.out.println("You try sha, na D you score");
                }
                if (reply >= 50 && reply < 60) {
                    System.out.println("Big man! You scored C");
                }
                if (reply >= 60 && reply < 80) {
                    System.out.println("Twale! You scored B");
                }
                if (reply >= 80 && reply <= 100) {
                    System.out.println("Agba! OG! A");
                }
            } else break;
        }
    }
}
