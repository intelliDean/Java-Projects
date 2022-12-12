package student_grade;

public class Student {
    private final String name;
    private final String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("""
                %s (%s): """, name, id);

    }
}
