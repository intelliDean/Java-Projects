package assignment;

public class NaturalNumbers {
    public static void main(String[] args) {
        int count = 1;
        int total = 0;
        for (count = 1; count <= 10; count++){
            total+=count;
            System.out.print(count+ " ");
        }
        System.out.printf("%nThe sum of these natural numbers is %d%n", total);
    }

}
