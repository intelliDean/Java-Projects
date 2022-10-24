package CHAPTER_7.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {
    @Test
    void toTestThatArraySortsAscending() {
        assertArrayEquals(new int[]{2,3,4,5}, SortArray.bubbleSortingAscending(new int[]{5,3,4,2}));
    }
    @Test
    void toTestThatArraySortsDescending() {
        assertArrayEquals(new int[]{5,4,3,2,1}, SortArray.bubbleSortingDescending(new int[]{4,2,5,3,1}));
    }
    @Test
    void toTestThatAshuffledArrayIsNotEqualToTheOriginalArray() {
        assertNotEquals(new int[]{5,2,3,1,4}, ArrayShuffling.shuffling(new int[]{1,2,3,4,5}));
    }
}