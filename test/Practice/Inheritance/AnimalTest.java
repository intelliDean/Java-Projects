package Practice.Inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    void polymorphismTest() {
        Animal animal = new Dog();
        animal.sound();
    }

}