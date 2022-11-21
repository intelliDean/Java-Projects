package CHAPTER_4.exercise;

public class Mystery {
    public static void condition() {
         int count = 1;
         while (count <= 20) {
             System.out.print(count % 3 == 1 ? "True" : "False ");
             ++count;
         } // end while
    } // end main
// end class Mystery2
public static void main(String[] args) {
    condition();
}
}

