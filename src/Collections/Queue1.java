package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> bank = new PriorityQueue<>();

        bank.add("Samuel");
        bank.add("Kunle");
        bank.add("Taaju");

        System.out.println(bank.peek());
        System.out.println(bank);

        //insertion happens at the back and deletion happens at the front(peak)
        //Though the ordering is natural order however, the toString ordering is not guaranteed

        bank.poll(); // removed from the front(peak) but returns false when queue is empty
        bank.remove(); //removes from the front(peak) but throws exception when queue is empty


    }
}