package CHAPTER_7;

import org.jetbrains.annotations.Contract;

import java.security.SecureRandom;

public class ReversedArray {
    @Contract(pure = true)
    public static int [] reverse(int [] userArray){
        //String rev = Arrays.toString(userArray);
        int[] reversedArray = new int[userArray.length];
        int backwardCount = userArray.length - 1;
        int forwardCount = 0;
        while(backwardCount != -1) {
            reversedArray[forwardCount++] = userArray[backwardCount--];
        }
        return reversedArray;
    }
    public static String reverse(String userString){
        StringBuilder reserve = new StringBuilder();
        int backwardCounter = userString.length() - 1;
        while (backwardCounter != -1) {
            reserve.append(userString.charAt(backwardCounter--));
        }
        return reserve.toString();
    }
    public static String oneLine(String userString) {
        return new StringBuilder(userString).reverse().toString();
    }
    public static String cap(String userInput) {
//        return userInput.substring(0, 1).toUpperCase() + userInput.substring(1);
        String firstLetter = (""+ userInput.charAt(0)).toUpperCase();
        String otherLetters = "";
        for (int i = 1; i < userInput.length(); i++) {
            otherLetters += userInput.charAt(i);
        }
        return firstLetter + otherLetters.toLowerCase();
    }


    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();

//        int[] userInput = new int[1 + (rand.nextInt(7))];
//        for (int i = 0; i <= userInput.length - 1; i++) {
//            userInput[i] =10 * (1 + rand.nextInt(5));
//        }
//        System.out.println(Arrays.toString(userInput));
//        System.out.println();
//        System.out.println(Arrays.toString(reverse(userInput)));
//        System.out.println(oneLine("Adekunle"));
        System.out.println(cap("cOME TO Me"));
    }
}
