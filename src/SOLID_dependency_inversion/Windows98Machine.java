package SOLID_dependency_inversion;

public class Windows98Machine {

    private final Keyboard keyboard;    //the composed class is an interface meaning it's implementation is
    // hidden from this class, and it's not tightly coupled, meaning it can be unplugged and another type plugged in
    private final Monitor monitor;  //the composed class is an interface meaning it's implementation is
    // hidden from this class, and it's not tightly coupled, meaning it can be unplugged and another type plugged in

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        String name1;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
