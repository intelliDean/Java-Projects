package CHAPTER_4;

import CHAPTER_4.exercise.Compare;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTest {

    Compare compare;

    @BeforeEach
    void setUp() {
        compare = new Compare(7);
    }
    @Test
    void objectExist() {
        assertNotNull(compare);
    }
    @Test
    void methodCanCompareTwoObjects() {
        Compare newCompare = new Compare(4);
        assertEquals(1, compare.compareTo(newCompare));
    }
    @Test
    void methodCanCompareIntegers() {
        Compare newCompare = new Compare(4);
        int number = newCompare.getNumber();
        assertEquals(1, compare.compareTo(number));
    }
    @Test
    void checkEqualsMethod() {
        Compare newCompare = new Compare(4);
        assertTrue(compare.equals(newCompare));
    }

}