package snack;

import java.security.SecureRandom;

public class CarDisplay {
    public static void main(String[] args) {
        Car car1 = new Car("Aston Martin","2032",230000, 5);
        Car  car2 = new Car("Bra Bus","2023",300000, 7);

       System.out.println(car1.getPurchaseAmount());
        System.out.println(car2.getPurchaseAmount());

        SecureRandom padlock = new SecureRandom();


//        for (int i = 1; i <= 1; i++) {
//            int lock = padlock.nextInt(6);
//            if (lock > 0) {
//            System.out.printf(" %s.%d %s %d %n","No", i, "= ", lock);
//            }
//        }

        double y = Math.floor(5.6) /1;
        System.out.println(y);
    }
}
