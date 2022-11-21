package Practice.Inheritance;

public class Dog extends Animal implements Movable {

    //overridden method sound
    @Override
    public void sound(){
        System.out.println("bark");
    }

    //overloaded method sound
    public String sound(String dogSound) {
        return String.format("%s",dogSound);
    }
    public void eatBone() {
        System.out.println("Eat bone");
    }



    @Override
    public void move() {
        System.out.println("dog steps");
    }
}
