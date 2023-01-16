package huge_integer;

import java.math.BigInteger;

public class HugeInt {
    /*(HugeInteger Class) Create a class HugeInteger which uses a 40-element array of digits to
store integers as large as 40 digits each. Provide methods parse, toString, add and subtract.
Method parse should receive a String, extract each digit using method charAt and place the integer
equivalent of each digit into the integer array. For comparing HugeInteger objects, provide the
following methods: isEqualTo, isNotEqualTo, isGreaterThan, isLessThan, isGreaterThanOrEqualTo
and isLessThanOrEqualTo. Each of these is a predicate method that returns true if the relationship
holds between the two HugeInteger objects and returns false if the relationship does not hold.
Provide a predicate method isZero. If you feel ambitious, also provide methods multiply, divide and
remainder. [Note: Primitive boolean values can be output as the word “true” or the word “false” with
format specifier %b.]*/
    private int[] arrays;

    private int size = 0;

    public HugeInt() {
        arrays = new int[40];
    }

    public HugeInt(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) < '0' || number.charAt(i) > '9') {
                throw new IllegalArgumentException("Invalid input");
            }
        }
        arrays = new int[40];
        for (int i = 0; i < number.length(); i++) {
            arrays[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
            size++;

        }
    }

    public BigInteger getValue() {
        BigInteger huge = BigInteger.ZERO;
        for (int i = 0; i < size; i++) {
            huge = huge.multiply(BigInteger.TEN).add(BigInteger.valueOf(arrays[i]));
        }
        return huge;
    }

    @Override
    public String toString() {
        int storage = 0;
        for (int i = 0; i < size; i++) {
            storage = storage * 10 + arrays[i];
        }
        return String.valueOf(storage);
    }


    public static void main(String[] args) {
        HugeInt num = new HugeInt("2345");

        HugeInt num2 = new HugeInt("538974");
        System.out.println(num.getValue());
        System.out.println(num2.getValue());

        System.out.print(num.getValue() + " + " + num2.getValue() + " = ");

        System.out.println(num.getValue().add(num2.getValue()));
    }

    public void parse(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) < '0' || number.charAt(i) > '9') {
                throw new IllegalArgumentException("Invalid input");
            }
        }
        arrays = new int[40];
        for (int i = 0; i < number.length(); i++) {
            arrays[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
            size++;

        }
    }

    public BigInteger add(HugeInt newHuge) {
        return this.getValue().add(newHuge.getValue());
    }
}
