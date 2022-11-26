package chapter12.Polymophism.Interfaces.Compares;

import org.jetbrains.annotations.NotNull;

public class Breast implements Comparable<Breast>{
    private int size;
    private String texture;
    private int nippleSize;

    public Breast() {

    }

    public Breast(int size, String texture, int nippleSize) {
        this.size = size;
        this.texture = texture;
        this.nippleSize = nippleSize;
    }

    @Override
    public int compareTo(@NotNull Breast object) {
        if (size > object.size && nippleSize > object.nippleSize ) {
        return -1;
        } else if (size < object.size && nippleSize < object.nippleSize) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args)  {
        Breast breast = new Breast(12, "soft", 3);
        Breast oyan = new Breast(32, "mid-soft", 9);

        int result = breast.compareTo(oyan);

        if (result > 0) {
            System.out.println("Oyan is the best");
        } else if (result == 0) {
            System.out.println("Oyan and breast are the same");
        } else {
            System.out.println("Breast is better");
        }
    }
}
