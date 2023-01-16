package huge_integer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HugeIntTest {
    HugeInt huge;

    @BeforeEach
    void setUp() {
        huge = new HugeInt();
    }

    @Test
    void parseThroughConstructor() {
        HugeInt newHuge = new HugeInt("23456");
        assertEquals(BigInteger.valueOf(23456), newHuge.getValue());
    }
    @Test
    void parseToMethod() {
        huge.parse("3454");
        assertEquals(BigInteger.valueOf(3454), huge.getValue());
    }

    @Test
    void add() {

        HugeInt huge1 = new HugeInt("2345");
        HugeInt newHuge = new HugeInt("435");



        assertEquals(BigInteger.valueOf(2780), huge.add(newHuge));
    }


}