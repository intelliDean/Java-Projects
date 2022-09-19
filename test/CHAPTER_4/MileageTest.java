//package CHAPTER_4;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MileageTest {
//    /*(Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
//kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//The program should calculate and display the miles per gallon obtained for each trip and print the
//combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
//from the user.*/
//    Mileage trip;
//
//    @BeforeEach
//    void toStartStartAll(){
//    trip = new Mileage();
//    }
//    @Test
//    void toTestTheCalculateMethod(){
//        //Given that
//        trip.setMiles(4);
//        trip.setGallons(5);
//        //when
//        trip.calculateMilesPerGallon();
//        assertEquals(20.0, trip.calculateMilesPerGallon());
//    }
//    @Test
//    void toCalculateAveragePerTrip(){
//        //given that
//        trip.totalMiles();
//        trip.totalGallons();
//    }
//}