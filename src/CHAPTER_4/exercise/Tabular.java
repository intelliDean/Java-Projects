package CHAPTER_4.exercise;

public class Tabular {
    /*N N2 N3 N4
1 1 1 1
2 4 8 16
3 9 27 81
4 16 64 256
5 25 125 625*/
    public static void table() {
        System.out.printf("%n%s%10s%10s%10s", "N", "N2","N3","N4");
        int i = 1;
        while (i <= 5) {
            System.out.printf("%n%d%10d%10d%10d%n",i, i * i,i*i*i,i*i*i*i);
            i++;
        }
    }

    public static void main(String[] args) {
        table();
    }
}
