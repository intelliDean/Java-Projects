package record;

// TODO: 28-Jan-23
//  1.  While defining a record, all the instance fields are written as parameters.
//  2.  The constructor, getter methods, toString(), equals(), and hashCode() are generated
//  by the Java compiler during compile time.
//  3.  One thing to note here is that records do not provide setter methods,
//  as it is expected that the value to instance variables is provided while creating the object*/
public record Person(String name, String id, int age) {
    public Person{
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                throw new IllegalArgumentException("Name cannot contain digits");
            }
        }
        if (Character.isLetter(age)) {
            throw new IllegalArgumentException("Age cannot contain letters");
        }
    }
}

