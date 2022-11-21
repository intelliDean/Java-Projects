package assignment.weekend_snack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArraysTest {
    @Test
    void toTestThatArraysReverse() {
        assertArrayEquals(new int[]{5,4,3,2,1}, ReverseArrays.reverse(new int[]{1,2,3,4,5}));
    }
}