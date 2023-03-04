package class_Optional;

import Practice.Inheritance.Animal;
import Practice.Inheritance.Dog;

import java.util.Optional;

public class ClassOptional {
    public static void main(String[] args) {
        Optional<Animal> animalObject = animalObject();
        if (animalObject.isPresent()) {
            animalObject.get().sound();
        } else {
           Animal animal = animalObject.orElseThrow(() -> new RuntimeException("Animal not found"));
        }


        Optional<Animal> found = getAnimal();
        Animal animal;
        animal = found.orElseThrow(()->new RuntimeException("Animal not found"));
        //animal = found.orElseGet(()->found.orElse(new Animal()));
        animal.sound();

//        if (found.isPresent()) {
//            Animal animal = found.get();
//            animal.sound();
//        }
//        else {
//            Animal animal = found.orElse(new Animal());
//            animal.sound();
//        }

    }
    public static Optional<Animal> getAnimal() {
        Animal animal = null;
         //= new Cat("Boosky", 3);
        //return Optional.of(animal);
        return Optional.ofNullable(animal);

    }
    public static Optional<Animal> animalObject() {
        Animal animal = new Dog();
        return Optional.of(animal);
    }
}
