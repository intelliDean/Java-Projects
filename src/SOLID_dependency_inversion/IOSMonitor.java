package SOLID_dependency_inversion;

public class IOSMonitor implements Monitor{
    @Override
    public void screen(String screen) {
        System.out.println("apple screen");
    }

    @Override
    public void model(String model) {
        System.out.println("Apple Mac");
    }
}
