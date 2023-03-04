package SOLID_dependency_inversion;

public class IOSKeyboard implements Keyboard{
    @Override
    public void alphabets(String keypads) {
        System.out.println("apple alphabets");
    }

    @Override
    public void numbers(String numbers) {
        System.out.println("apple numbers");
    }
}
