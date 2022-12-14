package Practice.Inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {
    @Test
    void duckTest(){
        F1 f1 = new F1();
        F2 f2 = new F2();
        F3 f3 = new F3();
        Q1 q1 = new Q1();
        Q2 q2 = new Q2();

        Duck mDuck = new Duck(f2, q1);
        Duck rDuck =  new Duck(f3, q2);
        Duck iDuck =  new Duck(f2,q2);

        mDuck.fly();
        mDuck.setFly(f1);
        mDuck.fly();


    }

}