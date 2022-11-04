package assignment.weekend_snack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraysLargestNumberTest {
@Test
    void toTestForLargestNumberInArrays() {
    assertEquals(9, ArraysLargestNumber.largestNumber(new int[]{1,2,3,4,5,6,7,8,9}));
}
}