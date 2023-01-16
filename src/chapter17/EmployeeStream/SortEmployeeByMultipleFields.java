package chapter17.EmployeeStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class SortEmployeeByMultipleFields {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        // get List view of the Employees
        List<Employee> list = Arrays.asList(employees);


        // Functions for getting first and last names from an Employee
        Function<Employee, String> byFirstName = Employee :: getFirstName;
        Function<Employee, String> byLastName = Employee :: getLastName;


        // Comparator for comparing Employees by first name then last name
        Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);

        // sort employees by last name, then first name
        System.out.printf("%nEmployees in ascending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst)
                //.sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))        same as sorted above
                .forEach(System.out :: println);

        // sort employees in descending order by last name, then first name
        System.out.printf(
                "%nEmployees in descending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst.reversed())
                .forEach(System.out :: println);
    }
}
