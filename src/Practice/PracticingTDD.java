//package Practice;
//
//public class PracticingTDD {
//
//    private final int ARRAY_LENGTH = 100;
//    private String name;
//    private int age;
//    private final int studentID;
//    private String phoneNumber;
//    private final int[] scores;
//    private int scoreCount;
//    private static int studentNumbers;
//
//    public PracticingTDD(String name, int age, int score) {
//        validateAge(age);
//        validatePhoneNumber(phoneNumber);
//        this.name = name;
//        this.age = age;
//        scores = new int[ARRAY_LENGTH];
//        scores[scoreCount] = score;
//        scoreCount++;
//        studentID = ++studentNumbers;
//    }
//    public PracticingTDD(int score) {
//        scores = new int[ARRAY_LENGTH];
//        scores[scoreCount] = score;
//        scoreCount++;
//        studentID = ++studentNumbers;
//    }
//    public PracticingTDD() {
//
//    }
//
//
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        validateAge(age);
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public int getStudentID() {
//        return studentID;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//    private void validatePhoneNumber(String phoneNumber) {
//        if (phoneNumber.length() != 11) throw new IllegalArgumentException("invalid phone number. Number must be 11 digits");
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    private void validateAge(int age) {
//        boolean isInvalid = age < 1;
//        if (isInvalid) throw new IllegalArgumentException("Invalid Age. Age cannot be less than 1");
//    }
//
//    public void getAgeArrays() {
//        if (scoreCount <= ARRAY_LENGTH) {
//        for (int i = 0; i < scoreCount; i++) {
//            System.out.print(scores[i]+", ");
//            if ((i+1) % 5 == 0) {
//                System.out.println();
//            }
//        }
//        System.out.println("\n");
//        }
//
//    }
//    public int getTotalScore() {
//        int total = 0;
//        for (int i = 0; i < scoreCount; i++) {
//
//            total += scores[i];
//
//        }
//        return total;
//    }
//    public void setScores(int scores) {
//        if (scoreCount <= ARRAY_LENGTH) {
//
//        this.scores[scoreCount] = scores;
//        scoreCount++;
//
//        } else {
//            System.out.println("memory full");
//        }
//    }
//
//    public static void main(String[] args) {
//        PracticingTDD hi = new PracticingTDD(4);
//
//        PracticingTDD five = new PracticingTDD(70);
//
//        PracticingTDD dor = new PracticingTDD(5);
//
//
//        System.out.println(hi.getStudentID());
//        System.out.println(five.getStudentID());
//        System.out.println(dor.studentID);
//    }
//}
//
