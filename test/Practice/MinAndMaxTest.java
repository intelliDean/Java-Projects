package Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinAndMaxTest {
    @Test
    void testForMinimumAndMaximum() {
        assertArrayEquals(new int[]{5,1}, MinAndMax.maxim(new int[]{1,2,3,4,5}));
    }
    @Test
    void testThatItDoesNotTakeLessThanZeroAndMoreThanHundred() {
        assertArrayEquals(new int[]{120,23},MinAndMax.maxim(new int[]{90,120,34,54,76,23,}));
    }

}