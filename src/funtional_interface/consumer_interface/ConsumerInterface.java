package funtional_interface.consumer_interface;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    // Consumer takes a parameter but returns nothing
    public static void main(String[] args) {
        /*Consumer Interface is a functional interface
         * it takes a parameter and consumes it
         * that is, it performs all the operation internally and returns void*/

        //TODO: Consumer with array objects
        Consumer<int[]> array2HundredConsumer = (arrays1)->arrays1[2] = 100;      //it takes an int array and mutate it

        int[] arrays = {33, 54, 78, 89};
        array2HundredConsumer.accept(arrays);
        System.out.println(Arrays.toString(arrays));
//----------------------------------------------------------------------------------------------------------------------

        //TOdo: Consumer with Integer object
        Consumer<Integer> consumer1 = System.out :: println;        //this prints the Integer entered
        consumer1.accept(54);

//----------------------------------------------------------------------------------------------------------------------
        Consumer<List<Integer>> fillList = lists -> {
            SecureRandom random = new SecureRandom();
            for (int i = 0; i < 10; i++) {
                lists.add(random.nextInt(10, 45));
            }
        };

        List<Integer> list = new ArrayList<>();
        fillList.accept(list);
        System.out.println(list);
//----------------------------------------------------------------------------------------------------------------------

    }
}