package CHAPTER_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySwapTest {
    @Test
    void toTestArraySwap() {
        assertArrayEquals(new int[]{2,1}, ArraySwap.swap(new int[]{1,2}));
    }

}