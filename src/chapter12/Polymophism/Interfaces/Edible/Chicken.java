package chapter12.Polymophism.Interfaces.Edible;

public class Chicken extends Animal implements Edible {


    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";

    }
}
