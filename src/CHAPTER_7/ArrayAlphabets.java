package CHAPTER_7;

public class ArrayAlphabets {
    public static void main(String[] args) {

        alphaArray();
        System.out.println("\n");
        printAlpha();
    }
    public static void alphaArray() {
        char[] chArray = new char[26]; //instantiation of second char array
        int index = 0;
        for (char i = 'a'; i <= 'z'; i++) { //Assigning char values to second array using loop
            chArray[index] = i;
            index++;
        }
        for (char ch : chArray) {
            System.out.print(ch+"  ");
            if (ch == 'm') {
                System.out.println();
            }
        }
    }
    public static void printAlpha(){
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i+"  ");
            if (i == 'm'){
                System.out.println();
            }
        }
    }
}
