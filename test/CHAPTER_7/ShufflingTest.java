package CHAPTER_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShufflingTest {
    @Test
    void toTestIfMethodShuffles() {
        assertNotEquals(new int[]{2,4,5,6,1}, Shuffling.shuffle1(new int[]{2,4,5,6,1}));
    }

}