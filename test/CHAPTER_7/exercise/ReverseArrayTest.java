package CHAPTER_7.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {
    @Test
    void toTestAReversedArray() {
        assertArrayEquals(new int[]{1,2,3,4,5}, ReverseArray.reverse(new int[]{5,4,3,2,1}));
    }
    @Test
    void toTestAShuffledArray() {
        assertNotEquals(new int[]{1,2,3,4,5}, ReverseArray.shuffled(new int[]{1,2,3,4,5}));
    }
    @Test
    void toTestASortArray() {
        assertArrayEquals(new int[]{1,2,3,4,5},ReverseArray.sorted(new int[]{2,4,3,5,1}));
    }
}