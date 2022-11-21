package MyReusableCodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArraysTest {
    @Test
    void ToTestThatMethodReversesArrays() {
        assertArrayEquals(new int[]{5,4,3,2,1}, ReverseArrays.reverseMain(new int[]{1,2,3,4,5}));
    }
    @Test
    void toTestThatMethodDoesNotTakeArraysWithElementBelowTwo() {
        assertArrayEquals(new int[]{-1}, ReverseArrays.reverseMain(new int[]{7}));
    }
    @Test
    void ToTestThatMethodCreateReversesArrays() {
        assertArrayEquals(new int[]{4,2,6,5,3}, ReverseArrays.reverseNewCreate(new int[]{3,5,6,2,4}));
    }
    @Test
    void toTestThatMethodCreatesDoesNotTakeArraysWithElementBelowTwo() {
        assertArrayEquals(new int[]{-1}, ReverseArrays.reverseNewCreate(new int[]{}));
    }

}