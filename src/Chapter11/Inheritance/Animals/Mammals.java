package Chapter11.Inheritance.Animals;

import java.math.BigDecimal;

public abstract class Mammals extends Animals{      //an abstract class might not have any abstract method

    private  String name;
    private BigDecimal salary;

    public Mammals(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public Mammals() {

    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
