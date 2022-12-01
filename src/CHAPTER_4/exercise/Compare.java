package CHAPTER_4.exercise;

import org.jetbrains.annotations.NotNull;
/*(Creating a Comparator) Write an application that works as a comparator. Your program
should read two numbers from the user and print 0 if they are equal to each other, 1 if the first
number is greater, and –1 if the second number is greater.*/
public class Compare implements Comparable<Compare>{
    private int number;

    public Compare(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override                                       //Overridden method
    public int compareTo(@NotNull Compare o) {
        return Integer.compare(this.number, o.number);
    }

    // Overloaded compareTo method
    public int compareTo(int num1) {
        return Integer.compare(getNumber(), num1);
    }
    @Override
    public boolean equals(Object o) {
        Compare comp = (Compare) o;         //Polymorphism
        return this.number > comp.number;
    }

    public static void main(String[] args) {
        Compare fatherAge = new Compare(8);

        Compare sonsAge = new Compare(8);

        System.out.println(fatherAge.compareTo(sonsAge));

        System.out.println(compare(12, 43));

    }
    public static int compare(int num1, int num2) {
        return num1 < num2 ? -1 : ((num1 == num2) ? 0 : 1);
    }
}
