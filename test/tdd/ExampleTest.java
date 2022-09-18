package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {
     Example example; // declaration of instance variable "example" so that all methods in this test can access it

    @BeforeEach // @BeforeEach put what's in the method of the @BeforeEach at the beginning of every method implementation in the test
    void startEachTest(){
        example = new Example(); //instantiation of object example of class Example
    }


    @Test
    void exampleExistTest(){
        assertNotNull(example); //to test that object example exist
    }

    @Test
   void sum1Test(){
        //Given that
        int a = 10;
        int b = 20;
        //WHEN
        example.sum(a,b);
        //Expectation
        assertEquals(30, example.sum(a,b));
    }

    @Test
    void sum2Test(){
        //Given that
        int a = 10;
        int b = 20;
        int c = 4;
        //WHEN
        int result = example.sum(a,b,c); // we can either put the method calling in a variable "result" or call the method itself
        //Expectation
        assertEquals(34, result);
    }
    @Test
    void sum3Test() {
        //Given that
        int a = 20;
        int b = 90;
        int c = 23;
        int d = 70;
        //When
        example.sum(a,b,c,d);
        //expectation
        assertEquals(203, example.sum(a,b,c,d));
    }

    @Test
    void booleanTest(){
        assertTrue(example.booleanMethod());
    }


}
