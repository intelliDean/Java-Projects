package CHAPTER_7.BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayBinarySearchTest {
    @Test
    void toTestThatMethodSearchesForAnElementInAnIndex() {
        assertEquals(3, ArrayBinarySearch.binarySearch(new int[]{1,2,3,4,5}, 4));
    }
    @Test
    void toTestThatMethodDoesNotTakeEmptyArray() {
        assertEquals(-1, ArrayBinarySearch.binarySearch(new int[]{}, 3));
    }
    @Test
    void methodReturnsMinusOneIfTargetNotFound() {
        assertEquals(-1, ArrayBinarySearch.binarySearch(new int[]{1,2,3,4,5}, 23));
    }
    @Test
    void testThatMethodSearchesAscendingArrays() {
        assertEquals(3, OrderAgnosticBinarySearch.orderAgnosticBS(new int[]{1,2,3,4,5,}, 4));
    }
    @Test
    void testThatMethodSearchesDescendingArrays() {
        assertEquals(2, OrderAgnosticBinarySearch.orderAgnosticBS(new int[]{5,4,3,2,1}, 3));
    }
}