package record;

public class Main {
    public static void main(String[] args) {
//        RecordClasses.FirstObjectDTO first = new RecordClasses.FirstObjectDTO("Michael Dean", "2413", 23);
//        RecordClasses.SecondObjectDTO second = new RecordClasses.SecondObjectDTO("Mike", "1423", 12);
//        RecordClasses.ThirdObjectDTO third = new RecordClasses.ThirdObjectDTO("Sule", "0990", 19);
//
//
//        System.out.println(first.age());

        try {
            Person person = new Person("Michael3 Dean", "1423", 23);
            System.out.println("Person's age:: " + person.age());
            System.out.println("Person's name:: " + person.name());
            System.out.println("Person's id:: " + person.id());

            System.out.println("Person's object\n" + person);

            System.out.println("hashcode:: " + person.hashCode());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }


//        Employee employee = new Employee("9090", "Michael", "Dean");
//
//        System.out.println(employee.getFullName());
//
//        Employee employee1 = new Employee("1201", "Michael", "Dean" );
//        System.out.println(Employee.generateEmployeeToken());
//        System.out.println(Employee.empToken);
    }
}
