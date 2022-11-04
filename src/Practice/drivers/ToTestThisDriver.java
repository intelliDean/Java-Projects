package Practice.drivers;

import Practice.ToTestThis;

public class ToTestThisDriver {
    public static void main(String[] args) {
        ToTestThis test = new ToTestThis(400);
        ToTestThis test2 = new ToTestThis(230);
        ToTestThis test3 = new ToTestThis();
        ToTestThis test4 = new ToTestThis();

        System.out.println(test4.getAmount());
        System.out.println(test2.getAge());
        System.out.println(test3.getAmount());

        System.out.println("The initial amount "+test.getAmount());
        System.out.println("The initial price "+test.getPrice());

        test.setAmount(500);
        ToTestThis.setPrice(450);
        System.out.println();


        System.out.println("The final amount "+test.getAmount());
        System.out.println("The final price "+test.getPrice());
    }
}
