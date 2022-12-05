package CHAPTER_4.exercise;

import java.util.Scanner;

/*All the data is transmitted as four-digit integers. Your application should read a four-digit
integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
encryption scheme) to form the original number. [Optional reading project: Research “public key
cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may
also want to investigate the RSA scheme, which is widely used in industrial-strength applications.*/
public class Cryptography {

    public static String decryption(int number) {
        /*
         swap the second digit with the fourth digit
         swap the first digit with the third
         */
        if (String.valueOf(number).length() == 4) {
            int firstDigit = number / 1000;
            int temp = number % 1000;
            int secondDigit = temp / 100;
            temp = number % 100;
            int thirdDigit = temp / 10;
            int fourthDigit = number % 10;

            firstDigit = validate(firstDigit);
            secondDigit = validate(secondDigit);
            thirdDigit = validate(thirdDigit);
            fourthDigit = validate(fourthDigit);

            temp = firstDigit;
            firstDigit = thirdDigit;
            thirdDigit = temp;
            temp = secondDigit;
            secondDigit = fourthDigit;
            fourthDigit = temp;

            return String.format("%d%d%d%d",firstDigit,secondDigit,thirdDigit,fourthDigit);
        } else {
            return String.format("%s%n","Enter only 4 digits");
        }
    }
    private static int validate(int number) {
        if (number == 7 || number == 8 || number == 9) {
            number -= 7;
        } else {
            number += 3;
        }
        return number;
    }
    public static String encryption(int number) {
        /*
        add 7 to each digits
        get the remainder of dividing each new value by 10
        swap the first digit with the third
        swap the second with the fourth digits
        * */
        String num = String.valueOf(number);
        if (num.length() == 4) {
        int firstDigit = number / 1000 + 7;
        int temp = number % 1000;
        int secondDigit = temp / 100 + 7;
        temp = number % 100;
        int thirdDigit = temp / 10 + 7;
        int fourthDigit = number % 10 + 7;

        firstDigit %= 10;
        secondDigit %= 10;
        thirdDigit %= 10;
        fourthDigit %= 10;

        temp = firstDigit;
        firstDigit = thirdDigit;
        thirdDigit = temp;

        temp = secondDigit;
        secondDigit = fourthDigit;
        fourthDigit = temp;

        return String.format("%d%d%d%d",firstDigit,secondDigit,thirdDigit,fourthDigit);
        } else {
            return String.format("%s%n","Invalid Input! Enter only 4 digits");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 digits only");
        int number =  input.nextInt();

        String result = encryption(number);
        System.out.println("encryption "+result);

        int arg = Integer.parseInt(result);
        System.out.println("decryption "+decryption(arg));

    }
}
