package MyReusableCodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleRandomTest {
    @Test
    void toTestThatArraysOfMoreThanOneElementShuffle() {
        assertNotEquals(new int[]{1,2,3,4,5}, ShuffleRandom.shuffle(new int[]{1,2,3,4,5}));
    }
    @Test
    void toTestThatMethodDoesNotTakeArraysWithElementsBelowTwo() {
        assertArrayEquals (new int[]{-1}, ShuffleRandom.shuffle(new int[]{7}));
    }
}