package chapter8.DatePackage;

public class EmployeeDriver {
    public static void main(String[] args) {
         Date birth = new Date(24, 7, 1949);
         Date hire = new Date(12, 3, 1988);
         Employee employee = new Employee("Bob", "Blue", birth, hire);
        System.out.println(employee);
    }
}
