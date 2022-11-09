package Practice.Inheritance;

public class Dog extends Animal{

    //overridden method sound
    @Override
    public String sound() {
        return String.format("%s", "bark, bark");
    }
    //overloaded method sound
    public String sound(String dogSound) {
        return String.format("%s",dogSound);
    }
}
