package chapter5.exercise;

public class TwelveDaysOdChristmas {
    public static void daysOfChristmas(int day) {
        if (day >= 1 && day <= 12) {
            System.out.print("\n𝓞𝓷 𝓽𝓱𝓮 "+ day);

            switch (day) { // enhance switch case
                case 1 ->
                        System.out.print("𝓼𝓽");
                case 2 ->
                        System.out.print("𝓷𝓭");
                case 3 ->
                        System.out.print("𝓻𝓭");
                default ->
                        System.out.print("𝓽𝓱");
            }
            System.out.println(" 𝓭𝓪𝔂 𝓸𝓯 𝓒𝓱𝓻𝓲𝓼𝓽𝓶𝓪𝓼,\n𝓶𝔂 𝓽𝓻𝓾𝓮 𝓵𝓸𝓿𝓮 𝓰𝓪𝓿𝓮 𝓽𝓸 𝓶𝓮");

            switch (day) { //normal switch case
                case 12:
                    System.out.println("𝓣𝔀𝓮𝓵𝓿𝓮 𝓭𝓻𝓾𝓶𝓶𝓮𝓻𝓼 𝓭𝓻𝓾𝓶𝓶𝓲𝓷𝓰, ");
                case 11:
                    System.out.println("𝓔𝓵𝓮𝓿𝓮𝓷 𝓹𝓲𝓹𝓮𝓻𝓼 𝓹𝓲𝓹𝓲𝓷𝓰,");
                case 10:
                    System.out.println("𝓣𝓮𝓷 𝓵𝓸𝓻𝓭𝓼 𝓪 𝓵𝓮𝓪𝓹𝓲𝓷𝓰,");
                case 9:
                    System.out.println("𝓝𝓲𝓷𝓮 𝓵𝓪𝓭𝓲𝓮𝓼 𝓭𝓪𝓷𝓬𝓲𝓷𝓰,");
                case 8:
                    System.out.println("𝓔𝓲𝓰𝓱𝓽 𝓶𝓪𝓲𝓭𝓼 𝓪 𝓶𝓲𝓵𝓴𝓲𝓷𝓰,");
                case 7:
                    System.out.println("𝓢𝓮𝓿𝓮𝓷 𝓼𝔀𝓪𝓷𝓼 𝓪 𝓼𝔀𝓲𝓶𝓶𝓲𝓷𝓰,");
                case 6:
                    System.out.println("𝓢𝓲𝔁 𝓰𝓮𝓮𝓼𝓮 𝓪 𝓵𝓪𝔂𝓲𝓷𝓰,");
                case 5:
                    System.out.println("𝓕𝓲𝓿𝓮 𝓰𝓸𝓵𝓭𝓮𝓷 𝓻𝓲𝓷𝓰𝓼,");
                case 4:
                    System.out.println("𝓕𝓸𝓾𝓻 𝓬𝓪𝓵𝓵𝓲𝓷𝓰 𝓫𝓲𝓻𝓭𝓼,");
                case 3:
                    System.out.println("𝓣𝓱𝓻𝓮𝓮 𝓕𝓻𝓮𝓷𝓬𝓱 𝓱𝓮𝓷𝓼,");
                case 2:
                    System.out.println("𝓣𝔀𝓸 𝓽𝓾𝓻𝓽𝓵𝓮 𝓭𝓸𝓿𝓮𝓼, 𝓪𝓷𝓭");
                default:
                    System.out.println("𝓪 𝓹𝓪𝓻𝓽𝓻𝓲𝓭𝓰𝓮 𝓲𝓷 𝓪 𝓹𝓮𝓪𝓻 𝓽𝓻𝓮𝓮.");
            }
                System.out.println();
        } else
            if (day == -1) {
                System.out.print("");
        } else {
            System.out.printf("%nOde, there's no %d day of Christmas%nChoose between 1 & 12%n%n", day);
        }
    }
}

