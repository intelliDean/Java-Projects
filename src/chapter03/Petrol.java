package chapter03;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PetrolPurchase myPurchase = new PetrolPurchase("Ajegunle", "pms", 30, 160.0, 5);

        System.out.println("Enter location");
        String location = input.nextLine();
        myPurchase.setStationLocation(location);

        System.out.println("Enter petrol type");
        String petrolType = input.nextLine();
        myPurchase.setPetrolType(petrolType);

        System.out.println("Enter quantity in litre");
        int quantity = input.nextInt();
        myPurchase.setQuantity(quantity);

        System.out.println("Enter price per litre");
        double price = input.nextDouble();
        myPurchase.setPricePerLitre(price);

        System.out.println("Enter discount in percentage");
        double discount = input.nextDouble();
        myPurchase.setPercentageDiscount(discount);


        System.out.printf("%n%s%n%s%n%d%n%.2f%n%.2f%n%.2f%n%.2f%n%.2f%n",myPurchase.getStationLocation(), myPurchase.getPetrolType(),myPurchase.getQuantity(), myPurchase.getPricePerLitre(),myPurchase.getPercentageDiscount(), myPurchase.actualAmount(), myPurchase.getPurchaseAmount(), myPurchase.discount());
    }
}
