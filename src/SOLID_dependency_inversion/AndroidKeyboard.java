package SOLID_dependency_inversion;

public class AndroidKeyboard implements Keyboard{

    @Override
    public void alphabets(String keypads) {
        System.out.println("I am alphabet keyboard");
    }

    @Override
    public void numbers(String numbers) {
        System.out.println("I am numbers");
    }
}
