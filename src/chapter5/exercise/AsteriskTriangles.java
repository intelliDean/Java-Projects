package chapter5.exercise;

public class AsteriskTriangles {
    /*(Triangle Printing Program) Write an application that displays the following patterns separately,
    one below the other. Use for loops to generate the patterns. All asterisks (*) should be printed by a
    single statement of the form System.out.print('*'); which causes the asterisks to print side
by side. A statement of the form System.out.println(); can be used to move to the next line. A
statement of the form System.out.print(' '); can be used to display a space for the last two patterns.
There should be no other output statements in the program. [Hint: The last two patterns require that each
line begin with an appropriate number of blank spaces.]*/
    public static void rightAngleTriangle() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void invertedRightAngleTriangle() {
        for (int i = 10; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    
    public static void sidedTriangle() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
        }
    }
    public static void invertedSidedTriangle() {
        for (int i = 1; i <= 10; i++) {
            for (int k = 10; k > i; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
    }
//    public static void square(){
//        int space = 6;
//        for (int i = 8; i > 0; i--) {
//            for (int j = 1; j < space; j++) {
//
//            }
//            for (int j = i; j < 8; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 0; j < ; j++) {
//
//            }
//
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {




    }
}
