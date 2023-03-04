public class RecordTesting {
    public static void main(String[] args) {
        Man man = new Man("Michael", "Dean", 23, "26, Admiralty way, Lekki");

        System.out.println(man);

    }

    record Man(String firstName, String lastName, int age, String address) {

    }
}
