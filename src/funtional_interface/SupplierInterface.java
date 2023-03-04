package funtional_interface;

import org.jetbrains.annotations.NotNull;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierInterface {
    //TODO: Suppliers takes no parameter but returns a value specifies in the generics
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new SecureRandom().nextInt(6, 78);       //takes nothing but returns value

        for (int i = 0; i < 20; i++) {
            System.out.print(supplier.get()+" ");
        }
        System.out.println();

    //==================================================================================================================

    Supplier<int[]> arrays = () -> createArrays();      //SupplierInterface :: createArrays;

        System.out.println(Arrays.toString(arrays.get()));

    //==================================================================================================================
    }
    @NotNull
    private static int[] createArrays() {
        Scanner input = new Scanner(System.in);
        int[] intArrays = new int[5];
        System.out.print("Enter 5 numbers\n-> ");
        for (int i = 0; i < intArrays.length; i++) {
            intArrays[i] = input.nextInt();
            if (i <= 3) {
                System.out.print("-> ");
            }

        }
        return intArrays;
    }
}
