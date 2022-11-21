package CHAPTER_4;

import java.util.Arrays;

public class CreditLimit {
    /*(Credit Limit Calculator) Develop a Java application that determines
    whether any of several department-store customers has exceeded the credit
    limit on a charge account. For each customer, the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance
(= beginning balance + charges – credits), display the new balance and determine
whether the new balance exceeds the customer’s credit limit. For those customers
whose credit limit is exceeded, the program should display the message "Credit limit exceeded".*/
    public static void main(String[] args) {
        int [][] a = new int[3][2];
        Arrays.fill(a[2], 6);
        System.out.println(Arrays.toString(a[2]));
    }
}
