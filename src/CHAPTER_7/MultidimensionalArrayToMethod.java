package CHAPTER_7;

public class MultidimensionalArrayToMethod {
    public static void main(String[] args) {
         double[][] arrays = generateArray(); // generateArray() is a method that generates
        // a multidimensional Array and pass it into another array created

         // Display sum of elements
         System.out.printf("%nSum of all elements is %.2f%n", sumArray(arrays)); // sumArray() is a method that gives
                                                                                    // the sum of total array elements
    }

    public static double[][] generateArray() {
          // Array creation
        double[][] gen = new double[3][4];
        for (int i = 0; i < gen.length; i++) {
            for (int j = 0; j < gen[i].length; j++) {
                gen[i][j] =  (Math.random() * 100);
            }
        }
        return gen;
    }

    public static double sumArray(double[][] arrays) {
        double total = 0;
        for (double[] array : arrays) {
            for (double arr : array) {
                total += arr;
            }
        }
        return total;
    }
}
