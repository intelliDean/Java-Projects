package chapter14;

public class Play {
    public static void main(String[] args) {
        String some = "Someone to play with";
        char[] check = some.toCharArray();
        char[] another = "God is always right".toCharArray();
        char[] play = new char[17];
        System.out.println(check.length);
        System.out.println(another.length);

//        for (int i = check.length - 1; i >= 0; i--) {
//            System.out.print(check[i]);
//        }
//        System.out.println();
//        for (int i = some.length() - 1; i >= 0 ; i--) {
//            System.out.print(some.charAt(i));
//        }

//        some.getChars(0,4, check, 9);
//        for (char pl : play) {
//            System.out.print(pl);
//        }
//        String one = new String("Measure Man");
//        String two = "measure man";
//
//        if (one.equalsIgnoreCase(two)) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
//        System.out.println(one.compareTo(two));

//        String one = "Hello";
//        String four = "hello";
//        String two = new String("hello");
//        String three = one;
//
//        System.out.println(one == two);
//        System.out.println(one == three);
//        System.out.println(two == "hello");
//
//        System.out.println(one.regionMatches(false,1, two, 1, 4));

//        String[] words = {"one", "two", "three", "four", "five"};
//        for (String word : words) {
//            if (word.startsWith("f"))  {
//                System.out.print(word + " ");
//            }
//        }
//        System.out.println();
//        for (String word : words
//             ) {
//            if (word.endsWith("o")) {
//                System.out.print(word+" ");
//            }
//        }

//        String[] cities = {"London", "Michigan", "Paris", "Lagos"};
//        for (String city : cities) {
//            System.out.print(city.endsWith("a")+ " ");
//        }


//        String[] words = {"one", "two", "three", "four", "five"};
//        String[] cities = {"London", "Michigan", "Paris", "Lagos"};
//        String letters = "abcdefghijklmopqrstuvwxyz";
//        for (String word : words) {
//            System.out.print(word.indexOf("two")+" ");
//        }
//        System.out.println();
//        System.out.println(letters.indexOf('q'));
//        System.out.println(letters.lastIndexOf('z'));

//        String letters = "abcdefghijklmnopqrstuvwxyz";
//        String name = "amaka";
//        System.out.println(letters.substring(2, 5 ));
//        System.out.println(letters.substring(4, 9));
//        System.out.println(letters.substring(9, 21));
//        System.out.println(name.substring(1, 4));
//        System.out.println(words(letters));
//        String word1 = "Mary ";
//        String word2 = "Jones";
//        System.out.println(word1.concat(word2));
//        System.out.println(cont(word1, word2));
//        String one = "come";
//        String two = "HOME";
//        String three = "     nOw";
//
//        System.out.println(three.replace("O", "o"));
//        System.out.println(three);
//
//        System.out.println(one.toUpperCase());
//        System.out.println(two.toLowerCase());
//        System.out.println(three.replace("O", "o").trim().toUpperCase());
//        System.out.println(one.toCharArray());

        char[] deck = {'a', 'b', 'c', 'd'};
        int c = 4;
        boolean d = false;
        long f = 3838838833838L;
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(deck));


    }
    public static String words(String cha) {
        return cha.substring(2, 8)+" "+cha.substring(8,16);
    }
    public static String cont(String word1, String word2) {
        return word1+word2;
    }
}
