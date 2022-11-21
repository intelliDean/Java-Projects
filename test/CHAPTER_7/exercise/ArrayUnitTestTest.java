package CHAPTER_7.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUnitTestTest {
    @Test
    void toTestForTheSum() {
        assertEquals(6, ArrayUnitTest.addSum(new int[]{2, 4}));
    }
    @Test
    void toTestForMinimum() {
        assertEquals(1, ArrayUnitTest.getMin(new int[]{5,3,1,9}));
    }
    @Test
    void toTestForMaximum(){
        assertEquals(9, ArrayUnitTest.getMax(new int[]{7,4,9,7,3}));
    }
    @Test
    void toTestForAverage() {
        assertEquals(3.0,ArrayUnitTest.getAverage(new int[]{3,3,3}));
    }
    @Test
    void toGetArrayLength(){
        assertEquals(11, ArrayUnitTest.getArrayLength(new int[11]));
    }
    @Test
    void toCopyArray() {
        assertArrayEquals(new int[]{2,3,4,5,6}, ArrayUnitTest.copyArray(new int[]{2,3,4,5,6}));
    }
    @Test
    void toShiftArray() {
        assertArrayEquals(new int[]{32,43,12,78,16}, ArrayUnitTest.toShiftArray(new int[]{16,32,43,12,78}));
    }
    @Test
    void toTestMinimumOfArraySum() {
        assertEquals(10, ArrayUnitTest.min(new int[]{1,2,3,4,5}));
    }
    @Test
    void toTestMaximumOfArraySum(){
        assertEquals(14,ArrayUnitTest.max(new int[]{1,2,3,4,5}));
    }
}