package snack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionTest {

        @Test
        @DisplayName("Test if method setACOn is working")
        public void turnOnAC (){
            //There is an AC (Precondition)
            AirCondition newAC = new AirCondition();
            //Put the AC On (Precondition)
            newAC.setACOn(true);
            //Assert that the AC is ON (Precondition)
            assertEquals(true,newAC.getACIsOn());
        }
        @Test
        @DisplayName("Test if method setACOff is working")
        void turnOffAC(){
            //There is an AC
            AirCondition newAC = new AirCondition();
            //The AC is on
            newAC.setACOn(true);
            //The AC is put off
            newAC.setACOn(false);
            //Check if the AC is off
            assertEquals(false,newAC.getACIsOn());
        }
        @Test
        @DisplayName("Test to increase the temperature")
        public void toIncreaseTemperature(){
            // There is an AC (Precondition)
            AirCondition newAC = new AirCondition();
            // The AC is ON (Precondition)
            newAC.setACOn(true);
            assertEquals(true, newAC.getACIsOn());
            // The initial temperature is 0 (Precondition)
            newAC.getTemperature();
            assertEquals(0, newAC.getTemperature());
            // Increase Temperature (Action)
            newAC.setIncreaseTemperature();
            // Check that the temperature is 1
            assertEquals(21, newAC.getTemperature());
        }
        @Test
        @DisplayName("To decease the temperature")
        void toDecreaseTemperature(){
            //There is an AC
            AirCondition newAC = new AirCondition();
            //The AC is On
            newAC.setACOn(true);
            assertEquals(true, newAC.getACIsOn());
            //initial temperature
            newAC.setTemperature(17);
            //Decrease temperature
            newAC.setDecreaseTemperature();
            //Assert that temperature decrease by 1
            assertEquals(16, newAC.getTemperature());
        }
        @Test
        @DisplayName("Not to increase temperature beyond 30")
        void temperatureBeyond30(){
            //There is AC
            AirCondition newAC = new AirCondition();
            //The AC is On
            newAC.setACOn(true);
            assertEquals(true,newAC.getACIsOn());
            //initial temperature
            newAC.getTemperature();
            assertEquals(0, newAC.getTemperature());
            //Set maximum temperature to 30
            newAC.setTemperature(30);
            //increase beyond 30
            newAC.setIncreaseTemperature();
            //check if temperature remains at 30
            assertEquals(30, newAC.getTemperature());
        }
        @Test
        @DisplayName("Not decrease beyond 16")
        void temperatureBeyond16(){
            //There is AC
            AirCondition newAc = new AirCondition();
            //The AC is on
            newAc.setACOn(true);
            assertEquals(true, newAc.getACIsOn());
            //initial temperature
            newAc.getTemperature();
            //set minimum temperature
            newAc.setTemperature(27);
            //decrease beyond 16
            newAc.setDecreaseTemperature();
            //assert if temperature remains at 16
            assertEquals(26, newAc.getTemperature());
        }

}