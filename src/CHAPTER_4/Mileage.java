//package CHAPTER_4;
//
//import java.util.Scanner;
//
//public class Mileage {
//    Scanner input = new Scanner(System.in);
//    private int comb;
//    private int miles;
//    private int gallons;
//
//    public double calculateMilesPerGallon() {
//        return getMiles() * getGallons();
//    }
//    public void setMiles(int miles) {
//        this.miles = miles;
//    }
//    public void setGallons(int gallons){
//        this.gallons = gallons;
//    }
//    public int getGallons() {
//        return gallons;
//    }
//
//    public int getMiles() {
//        return miles;
//    }
//
//    public int totalMiles() {
//        int totalm = 0;
//        int totalg = 0;
//        for (int i = 1; i <= 0; i++){
//            System.out.println("enter miles");
//            int miles = input.nextInt();
//            totalm += miles;
//            //setMiles(total);
//            System.out.println("enter gallon");
//            int gallons = input.nextInt();
//            totalg += gallons;
//            //setGallons(gallons++);
//            int perTrip = totalm * totalg;
//            comb = perTrip;
//            System.out.printf("%n%d", perTrip);
//
//            System.out.println("Press 1 to continue");
//            int reply = input.nextInt();
//            if (reply == 1) {
//            } else break;
//            return comb;
//        }
//    }
//    /*(Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
//kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//The program should calculate and display the miles per gallon obtained for each trip and print the
//combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
//from the user.*/
////    private int mile;
////    private int gallon;
////
////    public void setMile(int mile) {
////        this.mile = mile;
////    }
////    public int getMile(){
////        return mile;
////    }
//}
