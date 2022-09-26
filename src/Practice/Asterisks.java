package Practice;

public class Asterisks {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++){
            for(int j = 0; j < i; j++){
                for(int p = 4; p > i; p--){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
//        for(int i = 1; i <= 9; i++){
//            for(int j = 9; j > i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    }
}
