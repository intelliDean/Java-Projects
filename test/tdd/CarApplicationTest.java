package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import snack.Car;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CarApplicationTest {
    private Car car1;// Create an object of car1
    private Car car2;//Create an object car2

    @BeforeEach
    void startWith(){
        //initilialization of the objects
        car1 = new Car("Aston Martin","2032",230000, 5);
        car2 = new Car("Bra Bus","2023",300000, 7);
    }
    @Test
    void testIfCarExist(){
      car1 = new Car("Aston Martin","2032",230000, 5);// whatever you used to initialize your constructor in a method is peculiar to that method
      car2 = new Car("Bra Bus","2023",300000, 7);
        assertNotNull(car1);
        assertNotNull(car2);
    }
    //@Test
    //void testme(){
      //  Eat skeer = new Eat ("TY","2003",78.0,78);
    //}


    @Test
    void testCar1HasModel(){
        car1.setModel("Aston Martin");
        Assertions.assertEquals("Aston Martin", car1.getModel());
    }
    @Test
    void testCar2HasModel (){
        car2.setModel("Bra Bus");
        Assertions.assertEquals("Bra Bus", car2.getModel());
    }
    @Test
    void testCar1Year(){
        car1.setYear("2032");
        Assertions.assertEquals("2032", car1.getYear());
    }
    @Test
    void testCar2Model(){
        car2.setModel("2023");
        Assertions.assertEquals("2023", car2.getYear());
    }
    @Test
    void testCar1Price(){
        car1.setPrice(230000);
        Assertions.assertEquals(230000, car1.getPrice());
    }
    @Test
    void testCar2Price(){
        car2.setPrice(300000);
        Assertions.assertEquals(300000, car2.getPrice());
    }
    @Test
    void checkForDiscountAmount(){
        car1.getPurchaseAmount();
        Assertions.assertEquals(218500, car1.getPurchaseAmount());
    }


}