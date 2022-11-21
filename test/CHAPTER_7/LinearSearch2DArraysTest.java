package CHAPTER_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearch2DArraysTest {
    @Test
    void toTestThatMethodSearchIn2DArray() {
        assertArrayEquals(new int[]{1,3},
                LinearSearch2DArrays.linearSearch2D(new int[][]{{23, 56, 89}, {21, 95, 34, 65}, {76, 12}}, 65));
    }
    @Test
    void toTestThatArraysIsNotEmpty() {
        assertArrayEquals(new int[]{-1,-1},
                LinearSearch2DArrays.linearSearch2D(new int[][]{}, 23));
    }


}