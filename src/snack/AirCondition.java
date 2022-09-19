package snack;

public class AirCondition {

    //Instance Variables
    private boolean power;
    private int temperature;

    //Method to set method ON
    public void setACOn(boolean value) {
        power = value;
    }

    //Method to get method ON
    public boolean getACIsOn() {
        return power;
    }

    //Method to get temperature
    public int getTemperature() {
        return temperature;
    }

    //Method to increase temperature
    public void setIncreaseTemperature() {
        if (temperature < 30) {
            temperature = temperature + 1;
        }
    }

    //method to decrease temperature
    public void setDecreaseTemperature() {
        if (temperature > 16) {
            temperature = temperature - 1;
        }
    }
    //method to set temperature
    public void setTemperature(int degree) {
            temperature = degree;
        }

    }

