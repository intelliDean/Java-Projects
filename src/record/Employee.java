package record;

// Java Program Illustrating a Record class
// defining constructors, instance methods
// and static fields

// Record class

public record Employee(String id, String firstName, String lastName) {

    // Instance fields need to be present in the record's
    // parameters but record can define static fields.
    static int empToken;

    // Constructor 1 of this class
    // Compact Constructor
    public Employee {
        if (id.length() < 3 && id.charAt(0) == '0') {
            throw new IllegalArgumentException("Employee Id length cannot be below 3 and ID cannot begin with 0");
        }
        if (id.charAt(0) == '0') {
            throw new IllegalArgumentException("Employee Id cannot begin with 0");
        }
        if (firstName.length() < 2) {
            throw new IllegalArgumentException("First name must be 2 characters or more.");
        }
    }

    // Constructor 2 of this class
    // Alternative Constructor
    public Employee(String id, String firstName) {
        this(id, firstName, null);
    }

    // Instance methods
    public String getFullName() {
        if (lastName == null) {
            return firstName;
            //System.out.println(firstName());
        } else {
            return firstName() + " " + lastName();
            //System.out.println(firstName() + " " + lastName());
        }
    }

    // Static methods
    public static int generateEmployeeToken() {
        return ++empToken;
    }
}
