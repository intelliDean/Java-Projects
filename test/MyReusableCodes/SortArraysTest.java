package MyReusableCodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArraysTest {
    @Test
    void toTestThatMethodSortsArraysAscending() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, SortArrays.sortedAscending(new int[]{3,4,2,1,5}));
    }
    @Test
    void toTestThatMethodDoesNotTakeArrayWithElementsLessThanTwo() {
        assertArrayEquals(new int[]{-1}, SortArrays.sortedAscending(new int[]{6}));
    }
    @Test
    void toTestThatMethodSortsArraysDescending() {
        assertArrayEquals(new int[]{5,4,3,2,1}, SortArrays.sortedDescending(new int[]{2,3,1,4,5}));
    }
    @Test
    void toTestThatMethodDescendingDoesNotTakeArrayWithElementsLessThanTwo() {
        assertArrayEquals(new int[]{-1}, SortArrays.sortedDescending(new int[]{5}));
    }
}