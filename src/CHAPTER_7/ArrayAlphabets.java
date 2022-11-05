package CHAPTER_7;

public class ArrayAlphabets {
    public static void main(String[] args) {

        alphArray();
    }
    public static void alphArray() {
        char[] chArray = new char[26]; //instantiation of second char array
        int index = 0;
        for (char i = 'a'; i <= 'z'; i++) { //Assiging char values to second array using loop
            chArray[index] = i;
            index++;
        }
        for (char ch : chArray) {
            System.out.print(ch+"  ");
            if (ch == 'm') {
                System.out.println();
            }
        }
       // return chArray;
    }
}
