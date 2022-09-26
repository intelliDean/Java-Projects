package Practice;

public class Diamond {
    public static void main(String [] args) {

//        System.out.println("Enter the number of rows");
//        Scanner input = new Scanner(System.in);
//        n = input.nextInt();
        int row = 7;
        int space = 6;
        int i = 1;
        int j = 1;
        for (j = 1; j <= row; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }

            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
        }
        space = 1;
        for (j = 1; j <= row - 1; j++) {
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            for (i = 1; i <= 2 * (row - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
            space++;
        }
    }
}
