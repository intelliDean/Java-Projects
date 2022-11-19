package CHAPTER_4.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @BeforeEach
    public void setUp() {

    }
    @Test
    public void getFactorial() {
        BigDecimal factorial = Factorial.fact(5);
        assertEquals(BigDecimal.valueOf(120), Factorial.fact(5));
    }

}