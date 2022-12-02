package assignment.HugeInteger;

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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class HugeInteger {

    private List<Integer> storage;


    public HugeInteger(String number) {
        storage = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            storage.add(Integer.parseInt(String.valueOf(number.charAt(i))));
        }
    }
    public HugeInteger() {
        storage = new ArrayList<>();
    }

    public void addInt(long digit) {
        storage = new ArrayList<>();
        storage.add((int) digit);
    }

    public int getSizeOfStorage() {
        return storage.size();
    }

    public void parseTo(String number) {
        storage = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            storage.add(Integer.parseInt(String.valueOf(number.charAt(i))));
        }
    }

    public BigInteger getValue() {
        int result = 0;
        for (int i = 0; i < getSizeOfStorage(); i++) {
            result = result * 10 + storage.get(i);
        }
        return new BigInteger(String.valueOf(result));
    }

    public BigInteger add(HugeInteger newHuge) {
        return this.getValue().add(newHuge.getValue());
    }


    public BigInteger subtract(HugeInteger newHuge) {
        return this.getValue().subtract(newHuge.getValue());
    }

    public boolean isEqualsTo(HugeInteger newHuge) {
       return this.getValue().equals(newHuge.getValue());
    }

    public boolean isNotEqualsTo(HugeInteger newHuge) {
        return !this.getValue().equals(newHuge.getValue());
    }

    public boolean isGreaterThan(HugeInteger newHuge) {
        return this.getValue().compareTo(newHuge.getValue()) > 0;
    }

    public boolean isLessThan(HugeInteger newHuge) {
        return this.getValue().compareTo(newHuge.getValue()) < 0;
    }

    public boolean isGreaterThanOrEqualsTo(HugeInteger newHuge) {
        return (this.getValue().compareTo(newHuge.getValue()) > 0
                || this.getValue().equals(newHuge.getValue()));
    }

    public boolean isLessThanOrEqualsTo(HugeInteger newHuge) {
        return this.getValue().compareTo(newHuge.getValue()) < 0
                || this.getValue().equals(newHuge.getValue());
    }

    public boolean isZero() {
        return this.getValue().equals(BigInteger.valueOf(0));
    }

    public BigInteger multiply(HugeInteger newHuge) {
        return this.getValue().multiply(newHuge.getValue());
    }

    public BigInteger divideBY(HugeInteger newHuge) {
        return this.getValue().divide(newHuge.getValue());

    }

    public BigInteger remainder(HugeInteger newHuge) {
        return this.getValue().remainder(newHuge.getValue());
    }
}