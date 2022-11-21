package snack;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //Create an object of Scanner to call mScanner methods
        Scanner input = new Scanner(System.in); //input is the object name of class Scanner
        for (int i = 1; i <= 1; i++) {
            for (int o = 1; o <= 4; o++) {
                if (o % 2 == 0) {
                    System.out.println(o + " song");
                } //this executes under the condition of the if statement and not the condition of the loop
                for (int j = 1; j <= 10; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
                for (int k = 10; k >= 1; k--) {
                    System.out.print(k + " ");
                }
                System.out.println("\n");
            }
        }

//        for (int i =1; i <= 10; i++) {
//            for (int a = 2; a <= 10; a = a + 1) {
//                if (a % 2 == 0){
//                System.out.printf("%6d", i);
//                }
//            }
//        }


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
            }//Rachel - 09045830013
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
        while (count >= 20); // the while statement
        int num1 = 3; int num2 = 5; int total = 0;
        for (int counter = 1; counter <= 10; counter++) {
            int power = (int) Math.pow(num2,num1); //The loop executes everything in the statement body for as long as the loop continues
            total += power; //variable total gets updated as long as the loop continues
            if (total == 750) continue; // this condition skips the result 750 from the final answer to display
            System.out.printf("%d ",total); // because the print method is inside the statement body, protected by the brace,
                                                        // the value of total will be printed for all the times it repeated.
        }// if the print method had been outside the statement body, the last value of total only would have been printed instead of each value all the way

        int count = 1; //Initialization outside the loop just like the while loop

        do { // after the initialization is the do statement
            System.out.println("Jesus is Lord"); //the loop body coming before the loop condition
            count++; // the loop counter
        } while (count >= 20);// the loop condition coming outside the loop body. because this condition is false, it executed just once and then terminated.

         int total = 0;
        for (int number = 2; number <= 20; total += number, number += 2) {
            ; // empty statement
        }
        System.out.println(total);

                // SWITCH LOOP
        int total = 0; // sum of grades
        int gradeCounter = 0; // number of grades entered
        int aCount = 0; // count of A grades
        int bCount = 0; // count of B grades
        int cCount = 0; // count of C grades
        int dCount = 0; // count of D grades
        int fCount = 0; // count of F grades
        int eCount = 0; // I included this myself
        int grade  = 0;
        System.out.println("Enter integer grades between 1 - 100");
         // loop until user enters the end-of-file indicator
         while (input.hasNext()) {
             System.out.printf("%s%n %s%n",
                     "Enter the integer grades in the range 0-100.",
                     "Type <Ctrl + d> as the end-of-file indicator to terminate input:");
            grade = input.nextInt(); // read grade
            total += grade; // add grade to total
            ++gradeCounter; // increment number of grades
             // increment appropriate letter-grade counter
             switch (grade / 10) {//for the numbers to fit into the case number, the grade integer needs to be manipulated so meet up with the case numbers, e.g, case 9.
                 case 11 ->
                     ++eCount;
                 case 9, 10 -> // grade was between 90 and 100, inclusive
                         ++aCount;
                 // exits switch
                 case 8 -> // grade was between 80 and 89
                         ++bCount;
                 // exits switch
                 case 7 -> // grade was between 70 and 79
                         ++cCount;
                 // exits switch
                 case 6 -> // grade was between 60 and 69
                         ++dCount;
                 // exits switch
                 default -> // grade was less than 60
                         ++fCount;
                 // optional; exits switch anyway
             }
         }// display grade report
        System.out.printf("%nGrade Report:%n");

        // if user entered at least one grade...
        if (gradeCounter != 0) {
            // calculate average of all grades entered
            double average = (double) total / gradeCounter;
            // output summary of results
             System.out.printf("Total of the %d grades entered is %d%n",
                     gradeCounter, total);
             System.out.printf("Class average is %.2f%n", average);
             System.out.printf("%n%s %n%5s%5s %n%s%5d %n%s%5d %n%s%5d %n%s%5d %n%s%5d %n%s%4d%n",
                    "Number of students who received each grade:",
                    "Grade", "Number",
                    "A: ", aCount, // display number of A grades
                    "B: ", bCount, // display number of B grades
                    "C: ", cCount, // display number of C grades
                    "D: ", dCount, // display number of D grades
                    "F: ", fCount, // display number of F grades
                    "A+: ", eCount);
             }
         else { // no grades were entered, so output appropriate message
             System.out.println("No grades were entered");
             }


                    // continue statement terminating an iteration of a for statement.
        for (int count = 1; count <= 10; count++) { // loop 10 times
            if (count == 5) {
                continue; // skip remaining code in loop body if count is 5
                 }
                 System.out.printf("%d ", count);
                 }
                 System.out.printf("%nUsed continue to skip printing 5%n");
        int counter = 0;
        do {
            System.out.print(counter + 2+ " ");
            counter += 2;
        } while (counter < 50);

        System.out.println("Enter number between 1 - 30");
        int number = input.nextInt();
        for (int i = 1; i <= number; i+=1) {
            if (number <= 35)
                System.out.print("*");

        int primeCheckNumber;
        int n = 1;
        int divisibleCount;

        System.out.println("Enter number: ");
        int number = input.nextInt();

        while (n <= number) {
            divisibleCount = 0;
            primeCheckNumber = 2;
            while (primeCheckNumber <= n / 2) {
                if (n % primeCheckNumber == 0) {
                    divisibleCount++;
                    break;
                }
                primeCheckNumber++;
            }
            if (divisibleCount == 0 && n != 1) {
                System.out.printf("%,4d", n);
            }
            n++;
        }


        int total = 1;
        int count = 1;

        System.out.println("Enter Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter Number: ");
        int num2 = input.nextInt();

        for (count = 1; count <= num2; count++){
            total *= num1;
        }
        System.out.printf("%d raised to power %d = %d%n", num1, num2, total);

        switch (grade / 10) {
            case 9: case 10: ++aCount; break; // exits switch
            case 8: ++bCount; break; // exits switch
            case 7: ++cCount; break; // exits switch
            case 6: ++dCount; break; // exits switch
            default: ++fCount; break; // optional; exits switch anyway

       int count = 1; //While loop increment before running but for loop runs before increases.
       while(count <= 10) { // if you initialize in a while loop, the counting starts after the initialization, but it will still complete  it's number of specified counts
          count++;// but if you initialize a for loop, it starts its couunting from the initialization and still complete its specified counts
         //if (count == 5) {
         //continue;
         //}
       System.out.printf("%d ", count);
      }
      System.out.printf("%nUsed continue to skip printing 5%n");*/

//        int count = 1;
//        do{
//            System.out.print(count+ " ");
//            count++;
//        } while (count <= 10);

    }
}
