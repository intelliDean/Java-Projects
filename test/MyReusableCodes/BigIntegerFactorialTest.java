package MyReusableCodes;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigIntegerFactorialTest {
    @Test
    void toTestThatMethodFactorisesNumber() {
        assertEquals(new BigInteger(String.valueOf(24)), BigIntegerFactorial.factorial(4));
    }
    @Test
    void toTestThatMethodDoesNotTakeZero() {
        assertEquals(new BigInteger(String.valueOf(-1)), BigIntegerFactorial.factorial(0));
    }

}