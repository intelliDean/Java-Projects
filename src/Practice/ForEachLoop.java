package Practice;

import java.security.SecureRandom;
import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {3, 8, 23, 90, 43};
        int[] bro = forEach(arr);
        System.out.println(Arrays.toString(bro));
    }
    public static int[] forEach(int[] arrays) {
        SecureRandom rand = new SecureRandom();
        int[] transferArray = new int[arrays.length];
        int i = 0;
        for(int array : arrays) {
            transferArray[i] = array * rand.nextInt(50);  // for everytime this program I run, it generates a random number that will change the outcome every time
            i++;
        }
        return transferArray;
    }
}