package CHAPTER_4.exercise; //8901
                           // 0189
                          //  1098
import java.util.Scanner;

public class CryptoSecurity {
    /*Your application should read a four-digit integer entered by the user and encrypt it as follows:
    Replace each digit with the result of adding 7
to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
encryption scheme) to form the original number*/
    public static void crypto(String sum) {
        int a, b;
        int i = 0;
        String d = "";
        char comp = sum.trim().charAt(0);
        if (sum.length() == 4) {
            while (i < 4) {
                int num = Integer.parseInt(String.valueOf(sum.charAt(i)));
                a = 7 + num;
                b = a % 10;
                i++;
                System.out.print(b);
            }
        } else {
            System.out.println("You no dey hear word? I said 4 digits only!");
        }
    }

    public static void crypto2(String sum) {
        int a, b;
        int i = 0;
        String d = "";
        char temp = sum.trim().charAt(0);
        if (sum.length() == 4) {
            while (i < 4) {
                int num = Integer.parseInt(String.valueOf(sum.charAt(i)));
                if (sum.charAt(i) == '1') {
                    num = 11;
                } else if (sum.charAt(i) == '2') {
                    num = 12;
                }
                a = (num + 3);
                b = a % 10;
                i++;
                System.out.print(b);
            }
        } else {
            System.out.println("You no dey hear word? I said 4 digits only!");
        }
    }
    public static void crypto3(int number) {
        String num = String.valueOf(number);
        if (num.length() == 4) {
            char firstNumber = (char) (num.charAt(0) + 7);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter four digit number only");
        String sum = input.nextLine();
        crypto2(sum);
    }
}
