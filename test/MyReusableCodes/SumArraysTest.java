package MyReusableCodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumArraysTest {
    @Test
    void toTestThatMethodSumsArray() {
        assertEquals(19, SumArrays.sumArray(new int[]{1,2,3,4,9}));
    }
    @Test
    void toTestThatMethodDoesNotTakeArrayBelowTwoElements() {
        assertEquals(-1, SumArrays.sumArray(new int[]{2}));
    }

}