package SOLID_dependency_inversion;

public class DellMonitor implements Monitor{
    @Override
    public void screen(String screen) {
        System.out.println("HD screen");
    }

    @Override
    public void model(String model) {
        System.out.println("Dell Prosin");
    }
}
