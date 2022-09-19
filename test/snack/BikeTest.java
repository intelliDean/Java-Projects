package snack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    Bike myBike;

    @BeforeEach
    void toStartWith(){
        myBike = new Bike();
    }
    @Test
    @DisplayName("To turn bike on")
    void turnOn() {
        //given that
        myBike = new Bike();
        //expectation
       assertNotNull(myBike);
    }

        @Test
        @DisplayName("To turn bike off")
        void turnOff() {
            //There is a bike
            Bike myBike = new Bike();
            //bike is on
            myBike.setOn(true);
            assertEquals(true, myBike.getOn());
            //bike is off
            myBike.setOn(false);
            //check if bike is off
            assertEquals(false, myBike.getOn());
        }

        @Test
        @DisplayName("To accelerate the bike")
        void toAccelearateTheBike() {
            //there is bike
            Bike myBike = new Bike();
            //the bike is on
            myBike.setOn(true);
            //accelerate the bike
            myBike.setAcceleration(1);
            //check that the bike accelerates
            assertEquals(2, myBike.getAcceleration());
        }


        @Test
        @DisplayName("To accelerate on gear 1")
        void toAccelerateOnGear1() {
            //there is bike
            Bike myBike = new Bike();
            //the bike is on
            myBike.setOn(true);
            assertEquals(true, myBike.getOn());
            //the bike can accelerate
            myBike.setAcceleration(1);
            //accelerate bike on gear 1
            myBike.getAcceleration();
            // check if bike accelerates on gear 1
            assertEquals(2, myBike.getAcceleration());
        }

        @Test
        @DisplayName("To accelerate on gear 2")
        void toAccelerateOnGear2() {
            //there is bike
            Bike myBike = new Bike();
            //the bike is on
            myBike.setOn(true);
            assertEquals(true, myBike.getOn());
            //the bike can accelerate
            myBike.setAcceleration(2);
            //accelerate bike on gear 2
            myBike.getAcceleration();
            //check if bike accelerates on gear 2
            assertEquals(4, myBike.getAcceleration());
        }

        @Test
        @DisplayName("To accelerate on gear 3")
        void toAccelerateOnGear3() {
            //there is bike
            Bike myBike = new Bike();
            //the bike is on
            myBike.setOn(true);
            assertEquals(true, myBike.getOn());
            //the bike can accelerate
            myBike.setAcceleration(3);
            //accelerate bike on gear 3
            myBike.getAcceleration();
            //check if bike accelerates on gear 3
            assertEquals(6, myBike.getAcceleration());
        }

        @Test
        @DisplayName("To accelerate on gear 4")
        void toAccelerateOnGear4() {
            //there is a bike
            Bike myBike = new Bike();
            //the bike is on
            myBike.setOn(true);
            //the bike accelerates
            myBike.setAcceleration(4);
            //accelerate bike on gear 4
            myBike.getAcceleration();
            //check if bike accelerates on gear 4
            assertEquals(8, myBike.getAcceleration());
        }

        @Test
        @DisplayName("To decelerate the bike")
        void toDecelerateOnGear4() {
            //there is a bike
            Bike myBike = new Bike();
            //the bike in on
            myBike.setOn(true);
            assertEquals(true, myBike.getOn());
            //the bike is on acceleration
            myBike.setAcceleration(4);
            //decelerate bike on gear 4
            myBike.setDeceleration(4);
            //check that bike decelerate
            assertEquals(0, myBike.getDeceleration());
        }

        @Test
        @DisplayName("to decelerate the bike on gear 3")
        void toDecelerateOnGear3() {
            //there is bike
            Bike myBike = new Bike();
            //the bike is on
            myBike.setOn(true);
            assertEquals(true, myBike.getOn());
            //the bike is on acceleration
            myBike.setAcceleration(3);
            assertEquals(6, myBike.getAcceleration());
            //the bike decelerates on gear 3
            myBike.setDeceleration(3);
            //check that the bike decelerates
            assertEquals(0, myBike.getDeceleration());
        }

        @Test
        @DisplayName("To decelerate the bike on gear 2")
        void toDecelerateOnGear2() {
            //there is bike
            Bike myBike = new Bike();
            //the bike is on
            myBike.setOn(true);
            assertEquals(true, myBike.getOn());
            //the bike is on accelerattion
            myBike.setAcceleration(2);
            assertEquals(4, myBike.getAcceleration());
            //the bike decelerates on gear 2
            myBike.setDeceleration(2);
            //check that the bike decelarates
            assertEquals(0, myBike.getDeceleration());
        }

        @Test
        @DisplayName("To decelerate the bike on gear 1")
        void toDecelerateOnGear1() {
            //there is bike
            Bike myBike = new Bike();
            //the bike is on
            myBike.setOn(true);
            assertEquals(true, myBike.getOn());
            //the bike is on acceleration
            myBike.setAcceleration(1);
            assertEquals(2, myBike.getAcceleration());
            //the bike decelerates on gear 1
            myBike.setDeceleration(1);
            //ckeck that the bike decelerates
            assertEquals(0, myBike.getDeceleration());
        }

        @Test
        @DisplayName("To ckeck the range of gear 1")
        void gearOneRange() {
            //there is a bike
            Bike myBike = new Bike();
            //the bike is on
            myBike.setOn(true);
            assertEquals(true, myBike.getOn());
            //the bike accelerates on gear 1
            myBike.setAcceleration(1);
            assertEquals(2, myBike.getAcceleration());
            //set the speed range
            myBike.setSpeedRange(20);
            //assert that gear 1 maintained its range
            assertEquals(1, myBike.getSpeedRange());
        }

        @Test
        @DisplayName("To check the range of gear 2")
        void gearTwoRange() {
            // there is a bike
            Bike myBike = new Bike();
            // the bike is on
            myBike.setOn(true);
            // the bike accelerates on gear 2
            myBike.setAcceleration(2);
            assertEquals(4, myBike.getAcceleration());
            // set the speed range
            myBike.setSpeedRange(30);
            //asser that gear 2 maintained its limit
            assertEquals(2, myBike.getSpeedRange());
        }
        @Test
        @DisplayName("To check the range of gear 3")
        void gearThreeRange(){
            //there is a bike
            Bike myBike = new Bike();
            //the bike is on
            myBike.setOn(true);
            assertEquals(true, myBike.getOn());
            //the bike accelerates on gear 3
            myBike.setAcceleration(3);
            assertEquals(6, myBike.getAcceleration());
            //set the speed range
            myBike.setSpeedRange(40);
            //assert that gear 3 maintained its limit
            assertEquals(3, myBike.getSpeedRange());
        }
        @Test
        @DisplayName("To check the range of gear 4")
        void gearFourRange(){
            //there is a bike
            Bike myBike = new Bike();
            //the bike is on
            myBike.setOn(true);
            assertEquals(true, myBike.getOn());
            //the bike accelerates on gear 4
            myBike.setAcceleration(4);
            assertEquals(8, myBike.getAcceleration());
            //set the speed range
            myBike.setSpeedRange(89);
            //assert that gear 4 maintained its limit
            assertEquals(4, myBike.getSpeedRange());
        }







    }