package chapter14;

public class PhoneNumber {
    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        char[] numbers = phoneNumber.toCharArray();
        return String.format("(%c%c%c) %c%c%c%c-%c%c%c%c",
                numbers[0], numbers[1], numbers[2],numbers[3], numbers[4], numbers[5],
                numbers[6], numbers[7], numbers[8], numbers[9], numbers[10]);
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber("08095729090");
        System.out.println(phoneNumber);
    }
}
