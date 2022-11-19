package Chapter11.Inheritance.Animals;

public class Living {
    private boolean isLiving;
    public Living() {
        isLiving = true;
    }

    public void alive() {
        isLiving = true;
    }

    public boolean isAlive() {
        return isLiving;
    }
    public void dead() {
        isLiving = false;
    }
}
