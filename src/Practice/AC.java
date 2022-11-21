package Practice;

public class AC {
    private boolean isOn;
    private int temperature;

    public void setOn(boolean value) {
        isOn = value;
    }
    public boolean getOn() {
        return isOn;
    }

    public void increaseTemperature() {
        temperature = temperature + 1;
    }
    public int getTemperature() {
        return temperature;
    }
}