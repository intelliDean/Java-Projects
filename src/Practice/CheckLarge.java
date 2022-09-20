package Practice;

public class CheckLarge {
    /*Take two int values from user and print greatest among them.*/
    public int check(int a, int b){
    int greatest = a;
    if (b > a) {
        greatest = b;
    }
    return greatest;
    }
}
