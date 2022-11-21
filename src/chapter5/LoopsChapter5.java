package chapter5;

import static CHAPTER_4.exercise.LargestNumber.input;

public class LoopsChapter5 {
    public static void loopUsingWhile(){
        int i = 1;
        while(i <= 10) {
            if(i % 2 == 0) {
                System.out.print(i);
            }
            System.out.print(i+" ");
            i++;
        }
        System.out.println("\n");
    }
    public static void loopUsingFor() {
        for (int j = 10; j >= 1; j--) {
            if (j % 3 == 0) {
                System.out.print(j+" ");
            }
            System.out.print(j);
        }
    }
    public static void loopUsingForWith5Increment() {
        for (int j = 340; j >= 123; j-= 5) {
            if (j % 2 == 0) {
            System.out.print(j+" ");
            }
        }
    }
    public static void sumWithWhileLoop() {
        int i = 1;
        int total = 0;
        while (i <= 10) {
            total += i;
            i++;
        }
        System.out.println(total);
    }
    public static void forLoopWithBodyInTheHeader() {
        for (int i = 1; i <= 10; System.out.println(i), i++) {
            //the body is empty
            // the body is separated from the increment by comma and not semicolon
        }
    }
    public static void sumWithForLoop() {
        int total = 0;
        for (int i = 1; i <= 25; i++) {
            total += i;
        }
        System.out.print(total);
    }
    public static void calculateInterestRate() {
        double principal = 1000;
        double interestRate = 0.05;
        double a = 0;
        System.out.printf("%n%s%11s%12s", "Year", "Interest", "Deposit");
        for (int year = 1; year <= 10; year++) {
            a = principal * Math.pow(1 + interestRate, year);
            System.out.printf("%n%2d%11.2f%,15.2f", year, interestRate, a);
        }
    }
    public static void loopWithDoWhile() {
        int counter = 1;
        do{
            System.out.print(counter+" ");
            counter++;
        } while (counter <= 10);
    }

    public static void sumWithDoWhileLoop() {
        int total = 0;
        int counter = 1;
        do {
        total += counter;
        counter++;
        }while (counter <= 15);
        System.out.print(total+" ");
    }
    public static void sentinelLoopWithDoWhile() { //this takes unspecified numbers from users until the sentinel is input
        int num;
        int total = 0;
        System.out.println("Input numbers. Press -1 when done");
        do{
            num = input.nextInt(); // this keep to capture the input from the user irrespective of the message outside the loop
            total += num;
        }while (num != -1);
        System.out.println(total);
    }
    public static void nestedDoWhile() {
        int i = 0;
        int o;
        do{
            int j = 0;
            do {
                System.out.print(j+"\t");
                j++;
            }while(j <= 9);
            System.out.println();
            int k = 1;
            do{
                System.out.println(k+"\t\t\t\t\t\t\t\t\t "+ k);
                k++;
            }while(k <= 9);
//            System.out.println();
            i++;
        } while (i <= 3);
    }
    public static void switchGrade() {
        int total = 0;
        int gradeCounter = 1;
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0, eCount = 0, fCount = 0;
        System.out.println("""
                
                Enter the integer grades in the range 0-100.
                Type the end-of-file indicator to terminate input
                On UNIX/Linux/macOS type <Ctrl> d then press Enter
                On Windows type <Ctrl> z then press Enter.""");
        while (input.hasNext()) {
            int grade = input.nextInt();
            total += grade;
            gradeCounter++;
            switch (grade/10) {
                case 9,10-> {
                    aCount++;
                }
                case 8->{
                    bCount++;
                }
                case 7->{
                    cCount++;
                }
                case 6->{
                    dCount++;
                }
                case 5->{
                    eCount++;
                }
                case 4, 3, 2 , 1  ->{
                    fCount++;
                }
                default -> {
                    System.out.println("Invalid grade");
                }
            }
        }
        if (gradeCounter != 0) {
          // calculate average of all grades entered
             double average = (double) total / gradeCounter;
        System.out.printf("%n%s%d%s%d%n %s%.2f%n %n%s%n %s:%d%n %s:%d%n %s:%d%n %s:%d%n %s:%d%n %s:%d%n", "Total of ", gradeCounter, " grades entered is ", total, "Class average is ", average, "Grades Number", "A", aCount, "B", bCount, "C", cCount, "D", dCount, "E", eCount, "F", fCount);
        } else { // no grades were entered, so output appropriate message
            System.out.println("No grades were entered");
        }
    }
    public static void breakTest() {
        int count; // control variable also used after loop terminates
         for (count = 1; count <= 10; count++) { // loop 10 times
             if (count == 5) {
                break; // terminates loop if count is 5
             }
             System.out.printf("%d ", count);
         }
         System.out.printf("%nBroke out of loop at count = %d%n", count);
    }
    public static void continueTest() {
         for (int count = 1; count <= 20; count++) { // loop 10 times
             if (count == 10 | count == 17) {
                 System.out.println();
                 continue;
             }
             System.out.printf("%d ", count);
         }
         System.out.printf("%nUsed continue to skip printing odd numbers%n");
    }
    public static void testTotal() { // another way to count 1 - 100
        int total = 0;
        int i = 1;

        while (total < 100) {
            total += i;
            System.out.print(total+" ");
        }
    }
    public static void printBoolean() {
        // create truth table for && (conditional AND) operator
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Conditional AND (&&)",
                "false && false", (false && false),
                "false && true", (false && true),
                "true && false", (true && false),
                "true && true", (true && true));
    }
    public static void printNegative() {
        System.out.println("Enter number");
        int value = input.nextInt();
        if (value < 0) {
            System.out.println("Negative");
        } else
            if (value == 0) {
                System.out.println("Zero");
        } else {
                System.out.println("Positive");
        }
    }
    public static void countingWithDoubleLoop() {
        for (int i = 1; i < 3; i++) {
           for (int j = 1; j < 5; j++) //inner loop is without brace and still execute
             System.out.print('*');
           System.out.println("\n#####");
        } // end outer for loop
        // end main
    }   // end class Counting



    public static void main(String[] args) {
        calculateInterestRate();

    }

}
