package CHAPTER_7.exercise;

import java.util.Arrays;

public class NestedArray {
    public static void nestedArray() {
        int[][][] array = {{{87, 45}, {96,37}, {70,13}},            // 10 by 3 by 2 array
                            {{68, 34}, {87,49}, {90,27}},
                             {{94, 26}, {100,21}, {90,89}},
                             {{100, 43}, {81,39}, {82,23}},
                             {{83, 61}, {65,54}, {85,32}},
                            {{78, 45}, {87,51}, {65,21}},
                             {{85, 23}, {75,13}, {83,28}},
                             {{91, 32}, {94,78}, {100,27}},
                            {{43, 54}, {83,63}, {54,2}},
                            {{78, 65}, {57,87}, {54,23}}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k]/10; l++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
    }

    public static void main(String[] args) {
        nestedArray();
    }
}
