package snack;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


       /* int number = 35;
       System.out.print("Enter number: ");
        int value = input.nextInt();

        int count  = 0;
        while (count < 3)

            {

            if (value < number) {
                System.out.println("Too low");
            }
            if (value > number) {
                System.out.println("Too High");

            }
            if (value == number) {
                System.out.println("This is Correct");
                break;
>=

            }

       count++;
            }

    }
        // while loop
int count = 2;
while (count <= 50) {
    System.out.print(count + " ");
    count = count + 2;
}//  while loop

        int count = 0;
        while (count <= 50) {
            count++;
            if (count % 2 == 0) {
                System.out.print(count + " ");


            }
        }
    }

        FOR LOOP
                for(int count = 0; count <= 10; count ++)
                    System.out.print(count + " ");
        if (number < 35 ) {
            System.out.println("This is not the answer");
        } else if (number > 35) {
            System.out.println("This could not be the answer");
        } else {
            System.out.printf("%d is the answer", number);
        }

        int count = 0  ;
        while (count <=100) {
            count = count + 3;
            System.out.print(count+ " ");
        }

        int total = 0;
        int gradeCounter = -1;
        while (gradeCounter <= 10)
        {
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
             gradeCounter = gradeCounter + 1;
            total = total + grade;
        }

            int average = total / 10;

            System.out.printf("%nTotal of all grades is %d%n", total);
            System.out.printf("Class average is %d%n", average);






   System.out.println("Enter your number: ");
    int sweet = input.nextInt();

    int taste = 0;
    int count = 1;

    while (count <= 100) {
        taste = sweet * 2;
        count = count + 2;
    }

        int total = 0;
        int count = 0;

        System.out.print("Enter the grade: ");
        int grade = input.nextInt();

        while (grade != -1) {
            total = total + grade;
            System.out.print("Enter the grade: ");
            grade = input.nextInt();
            count = count + 1;
        }
        double average = (double) total / count;
        System.out.printf("%nSum of grade %d grades entered is: %d%n", count, total);
        System.out.printf("While average grade is: %.02f%n", average);


        double result = 0;
        int count = 1;

        while (count <= 10) {
            System.out.print("\nEnter your grade: ");
            int grade = input.nextInt();
            if (grade > 70) {
                System.out.println("Pass: 1");
            } else {
                System.out.println("Failed: 2");
            }
            count += 1;
            }Rachel - 09045830013
        for (initialization; loopContinuationCondition; increment) {
 statements
                    ASCENDING LOOP
        for (int count = 1; count <= 20; count = count + 3) {
            System.out.print(count +" ");
            }
                    DESCENDING LOOP
        for (int count = 20; count >= 1; count--) {
            System.out.print(count + " ");
        }



        int sum = 0;
        int even; // normally, I would have declared the variable inside the "for" parenthesis, but I won't be able to use it outside the iteration statement.

        for (even = 2; even <= 20; even +=2) {
            System.out.print(even+ " ");
        }
        sum = sum + even;
        System.out.printf("%n...and their sum is: %d%n", sum);

        int number;
        for (number = 2; number <= 20; int total +=number, number += 2;){
            ; // empty statement
        }

        double amount = 0.0;
        int year;
        double sum = 0.0;
        double principal = 1000.0;
        double rate = 0.05;
        for (year = 1; year <= 10; ++year) {
            // calculate new amount on deposit for specified year
            amount = principal * Math.pow(1.0 + rate, year);
            // display the year and the amount
            System.out.printf("%4d%,20.2f%n", year, amount); //the comma after the % is a separator to make the output readable, e.g, 1,200
            sum = sum + amount;
        }
        System.out.printf("%,14.02f", sum); //the comma after the % is a separator to make the output readable, e.g, 13,000

        // A do...while statement
        //declare variable counter
        int count = 1;
            //initiate the do statement with action as its body
        do {
            System.out.print(count+ " ");
            count++; // the loop increment
        }
        while (count >= 20); // the while statement*/




    }
}





