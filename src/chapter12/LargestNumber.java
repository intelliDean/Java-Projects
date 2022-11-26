package chapter12;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45); // Add an integer
        list.add(3445.53); // Add a double
        // Add a BigInteger
        list.add(new BigInteger("3432323234344343238324024029101"));
        // Add a BigDecimal
        list.add(new BigDecimal("2.0909090989091343433344343"));
        list.add((int) 'a');
        list.add((int) 'z');


        System.out.println("The largest number is " + largestOfAnyNumbers(list));

//        Number number = 23;
//
//        Number number1 = 8.89;
//        System.out.println(number1.doubleValue() + number.doubleValue());
//        number = (int) '7';
//        number = (Integer) 98;
//        number = BigDecimal.valueOf(90);
//        number1 = BigInteger.valueOf(8765);


    }

    public static Number largestOfAnyNumbers(ArrayList<Number> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue()) {
                number = list.get(i);
            }
        }
        return number;
    }
}
