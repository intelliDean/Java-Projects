package SOLID_dependency_inversion;

public class Main {
    public static void main(String[] args) {
        Windows98Machine windows = new Windows98Machine(new AndroidKeyboard(), new DellMonitor());

        Windows98Machine macWindows = new Windows98Machine(new IOSKeyboard(), new IOSMonitor());

        Windows98Machine hybridWindows = new Windows98Machine(new AndroidKeyboard(), new IOSMonitor());

        //The composed classes are interfaces, meaning it's not tightly coupled
        //when a keyboard is needed, any keyboard can fit it as long as it respects
        // the contract of keyboards as declared in the keyboard interface
    }
}
