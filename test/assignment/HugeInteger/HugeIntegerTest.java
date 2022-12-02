package assignment.HugeInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {

    HugeInteger huge;
    HugeInteger alsoHuge;


    @BeforeEach
    void setUp() {
        huge = new HugeInteger("123");
        alsoHuge = new HugeInteger();
    }
    @Test
    void objectExist() {
        assertNotNull(huge);
        assertNotNull(alsoHuge);
    }
    @Test
    void testThatArrayExist() {
        huge.addInt(559959599);
        assertEquals(1, huge.getSizeOfStorage());
    }
    @Test
    void testTheParseMethodCanOutput1Number() {
        huge.parseTo("2");
        assertEquals(BigInteger.valueOf(2), huge.getValue());
    }
    @Test
    void testThatParseMethodCanOutputMoreThanOneNumber() {
        huge.parseTo("123456789");
        assertEquals(BigInteger.valueOf(123456789), huge.getValue());
    }
    @Test
    void toTestThatObjectCanConvertStringToInteger() {
        assertEquals(BigInteger.valueOf(123), huge.getValue());
    }
    @Test
    void testThatMethodCanAdd() {
        assertEquals(BigInteger.valueOf(123), huge.getValue());
        HugeInteger newHuge = new HugeInteger("324");
        assertEquals(BigInteger.valueOf(324), newHuge.getValue());
        assertEquals(BigInteger.valueOf(447), huge.add(newHuge));
    }
    @Test
    void testThatMethodCanSubtract() {
        assertEquals(BigInteger.valueOf(123), huge.getValue());
        HugeInteger newHuge = new HugeInteger("324");
        assertEquals(BigInteger.valueOf(324), newHuge.getValue());
        assertEquals(BigInteger.valueOf(-201), huge.subtract(newHuge));
    }
    @Test
    void testIsEqualTo() {
        assertEquals(BigInteger.valueOf(123), huge.getValue());
        HugeInteger newHuge = new HugeInteger("123");
        assertEquals(BigInteger.valueOf(123), newHuge.getValue());
        assertTrue(huge.isEqualsTo(newHuge));
    }
    @Test
    void testIsEqualToWorks() {
        assertEquals(BigInteger.valueOf(123), huge.getValue());
        HugeInteger newHuge = new HugeInteger("120");
        assertEquals(BigInteger.valueOf(120), newHuge.getValue());
        assertFalse(huge.isEqualsTo(newHuge));
    }
    @Test
    void testIsGreaterThan() {
        assertEquals(BigInteger.valueOf(123), huge.getValue());
        HugeInteger newHuge = new HugeInteger("120");
        assertEquals(BigInteger.valueOf(120), newHuge.getValue());
        assertTrue( huge.isGreaterThan(newHuge));
    }
    @Test
    void testIsNotEqualsTo() {
        assertEquals(BigInteger.valueOf(123), huge.getValue());
        HugeInteger newHuge = new HugeInteger("125");
        assertEquals(BigInteger.valueOf(125), newHuge.getValue());
        assertTrue(huge.isNotEqualsTo(newHuge));
    }
    @Test
    void testIsLessThan() {
        assertEquals(BigInteger.valueOf(123), huge.getValue());
        HugeInteger newHuge = new HugeInteger("148");
        assertEquals(BigInteger.valueOf(148), newHuge.getValue());
        assertTrue( huge.isLessThan(newHuge));
    }
    @Test
    void isGreaterOrEqualsTo() {
        assertEquals(BigInteger.valueOf(123), huge.getValue());
        HugeInteger newHuge = new HugeInteger("123");
        assertEquals(BigInteger.valueOf(123), newHuge.getValue());
        assertTrue(huge.isGreaterThanOrEqualsTo(newHuge));
    }
    @Test
    void isLessThanOrEqualsTo() {
        assertEquals(BigInteger.valueOf(123), huge.getValue());
        HugeInteger newHuge = new HugeInteger("123");
        assertEquals(BigInteger.valueOf(123), newHuge.getValue());
        assertTrue(huge.isLessThanOrEqualsTo(newHuge));
    }
    @Test
    void isZero() {
        assertEquals(BigInteger.valueOf(123), huge.getValue());
        huge.parseTo("0");
        assertTrue(huge.isZero());
    }
    @Test
    void testThatMethodCanMultiply() {
        assertEquals(BigInteger.valueOf(123), huge.getValue());
        HugeInteger newHuge = new HugeInteger("2345645");
        assertEquals(BigInteger.valueOf(2345645), newHuge.getValue());
        assertEquals(BigInteger.valueOf(288514335), huge.multiply(newHuge));
    }
    @Test
    void testDivide() {
        assertEquals(BigInteger.valueOf(123), huge.getValue());
        HugeInteger newHuge = new HugeInteger("9");
        assertEquals(BigInteger.valueOf(9), newHuge.getValue());
        assertEquals(BigInteger.valueOf(13), huge.divideBY(newHuge));
    }
    @Test
    void testRemainder() {
        assertEquals(BigInteger.valueOf(123), huge.getValue());
        HugeInteger newHuge = new HugeInteger("9");
        assertEquals(BigInteger.valueOf(9), newHuge.getValue());
        assertEquals(BigInteger.valueOf(6), huge.remainder(newHuge));
    }

}