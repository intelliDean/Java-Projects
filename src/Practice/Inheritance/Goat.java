package Practice.Inheritance;

public class Goat extends Animal{
    private String sound;

    public Goat() {

    }
    @Override
    public void sound() {
        System.out.println("bleat");
    }
}
