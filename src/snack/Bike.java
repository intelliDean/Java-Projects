package snack;

public class Bike {
    //instance variables
    private boolean power;
    private int acceleration;
    private int decceleration;
    private int gearRang;





    //method to put the bike on
    public void setOn(boolean value){

        power = value;
    }
    //method to get the get On
    public boolean getOn() {

        return power;
    }

    //method to the acceleration of the bike
    public void setAcceleration(int gear){
        if (gear == 1)
        {
            acceleration = gear + 1;
        }
        if (gear == 2) {
            acceleration = gear + 2;
        }
         if (gear == 3) {
             acceleration = gear + 3;
         }
         if (gear == 4) {
             acceleration = gear + 4;
                }
    }


    //the method to get acceleration
    public int getAcceleration() {
        return acceleration;
    }

    public void setDeceleration(int gear) {
        if (gear == -4) {
            decceleration = gear + 4;
        }
        if (gear == -3)
        {
            decceleration = gear + 3;
        }
        if (gear == -2)
        {
            decceleration = gear + 2;
        }
        if (gear == -1)
        {
            decceleration = gear + 1;
        }
    }

    public int getDeceleration() {
        return decceleration;
    }

    public void setSpeedRange(int speedRange)
    {
        if (speedRange <= 20)
        {
            gearRang = 1;
        }
        if (speedRange >= 21)
        {
            if (speedRange <= 30)
            {
                gearRang = 2;
            }
        }
        if (speedRange >= 31)
        {
            if (speedRange <= 40)
            {
                gearRang = 3;
            }
        }
        if (speedRange > 40)
        {
            gearRang = 4;
        }
    }

    public int getSpeedRange() {
        return gearRang;
    }
}
