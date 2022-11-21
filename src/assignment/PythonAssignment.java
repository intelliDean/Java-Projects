package assignment;

public class PythonAssignment {
    /*(Eggs per Box) Typically 6 eggs fit in one box. Write a script to calculate the number of boxes a farmer
needs to store 28 eggs. The script will also determine how many eggs are placed in the last uncompleted box,
and how many additional eggs are needed to fill this last box.*/
    public static void egg_crates() {
        int box = 6;
        int eggs = 28;
        double numberOfBoxes = (eggs / box) + 1;
        int rem = eggs % box;
        System.out.printf("%nYou need %.1f boxes to store %d eggs.%nHowever, the last box had only 2 eggs in it,%nremaining %d to complete it%n",numberOfBoxes,eggs,rem);
    }
    /*3. (Table with Number of Bacteria) Starting with 200 bacteria, the growth in the
number of bacteria after n hours is calculated as follows: B = 200 × 2n. Print the number
of bacteria after 0, 5, 10, and 15 hours in table format as shown below. Use the tab escape
sequence to achieve the two-column output.
Hour     Number of Bacteria
   0 				200
   5 			     6400
  10 			   204800
  15 			  6553600*/

    public static void bacteria_growth() {
        int bacteria = 200;
        int i = 0;
        int number_of_growth;
        System.out.printf("%n%3s%18s%n", "Hour", "№ of bacteria");
        while (i <= 15) {
            number_of_growth = (bacteria * (2 * i));
            if (i % 5 == 0) {
                if (i == 0) {
                    number_of_growth = 200;
                }
                System.out.printf("%3d%15d%n", i, number_of_growth);
            }
            i++;
        }
    }
    public static void grade_print(int grade) {
    /*1. (Fill in the missing code) Replace *** in the following code with a statement that
will print a message like 'Congratulations! Your grade of 91 earns you an A in this
course'. Your statement should print the value stored in the variable grade:
if grade >= 90:
 ****/
        if (grade > 90) {
            System.out.printf("%nCongratulations! Your grade of %d earns you an A in this course", grade);
        } else {
            System.out.printf("%nYour grade of %d couldn't earn you an A but you can do better next time", grade);
        }

    }
    public static void  wage_calculator() {
    /*(Hourly Wage Calculator) Every year, if an employee receives a good job performance
review, they get a raise of 3% on their wages. In turn, if they receive a suboptimal performance
review, their wages are deducted by 3%. Consider an employee starting with an hourly wage
of $10. Calculate how much this employee is earning after 5 years of consistent good reviews
and after 2 years of bad reviews. Use the following formula to calculate these wages:
w = o((1 + p)**n)
where
w is the new hourly wage,
o is the original hourly wage,
p is the percentage increase or decrease, and
n is the number of years with an increase or decrease in hourly wage.*/
        int i = 1;
        double wig = 0;
        int wage = 10;
        double good_job = 0;
        while (i <= 5) {
            double temp = 10 * 0.03;
            wig = wage * Math.pow(1 + temp,i);
            good_job += wig;
            System.out.printf("%n%.2f", good_job);
            i++;
        }
        System.out.println();
        double wag = 0;
        int j = 1;
        double bad_job = 0;
        while (j <= 2){
            double temp = 10 * 0.03;
            wag = wage * Math.pow(1 - temp,i);
            bad_job += wag;
            System.out.printf("%n%.2f", bad_job);
            j++;
        }
        System.out.println();
        System.out.printf("%n%.2f", good_job - bad_job);
    }
    public static void fibonacci() {
        /*(Challenge: Fibonacci Sequence) In the Fibonacci sequence, each number is the
sum of the two preceding ones. The first 10 Fibonacci numbers are as follows:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, …
Write a script where a user inputs a position (a number) and the number in that position
in the Fibonacci Sequence is displayed.*/
        int i = 1;
        int temp = 0;
        int a;
        int total = 0;
        while (i <= 10) {
            temp += i;
            a = temp;
            total = a + i;
            i++;
        }
    }
    public static void main(String[] args) {
       wage_calculator();
    }
}
