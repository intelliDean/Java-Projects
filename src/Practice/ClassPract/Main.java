package Practice.ClassPract;

public class Main extends SuperClass implements Inter {
    private Const constant;
    private Human human;

    public Main(String name, int age, String ssn, Const constant, Human human) {
        super(name, age, ssn);
        this.constant = constant;
        this.human = human;
    }

    @Override
    public void salary(int salary) {
        if (getAge() > 0 && getAge() <= 18) {
            human.setSalary(salary + (salary * 0.12));
        } else {
            human.setSalary(salary + (salary * 0.15));
        }
    }

    @Override
    public double getAmount() {
        return human.getSalary();
    }
}
