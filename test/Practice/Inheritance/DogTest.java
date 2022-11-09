package Practice.Inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    @Test
    void toMakeSound() {
        Dog newDog = new Dog();
        System.out.println(newDog.sound("howl howl  "));
    }

}