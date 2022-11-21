package CHAPTER_7;

import MyReusableCodes.Count;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitsInAnArrayTest {
    @Test
    void toTestIfMethodReturnsNumberOfEvenNumberedElementsInAnArray() {
        assertEquals(2, EvenDigitsInAnArray.evenDigits(new int[]{12, 5432, 637, 123}));
    }
    @Test
    void toTestThatMethodDoesNotTakeEmptyArrays() {
        assertEquals(-1, EvenDigitsInAnArray.evenDigits(new int[]{}));
    }
    @Test
    void toTestIfMethodCheckIfANumberContainsEvenDigits() {
        assertTrue(EvenDigitsInAnArray.even(34231234));
    }
    @Test
    void toTestThatMethodReturnsCountsDigits() {
        assertEquals(3, Count.digits(234));
    }
    @Test
    void toTestThatMethodCountsANegativeNumbers() {
        assertEquals(5, Count.digits(-23123));
    }
}