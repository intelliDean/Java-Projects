package chapter12.Polymophism.Interfaces.Payable;

public interface Payable {

    // no implementation
    double getPaymentAmount();
    /*declaring an interface methods with public and abstract keyword is
     redundant because it's both public and abstract method by default*/

//    default BigDecimal getSalary(BigDecimal salary) {
//        if (salary.compareTo(BigDecimal.valueOf(30000)) < 0) {
//            return salary.add(salary.multiply(BigDecimal.valueOf(0.2)));
//        } else if (salary.compareTo(BigDecimal.valueOf(30000)) > 0) {
//            return salary.add(salary.multiply(BigDecimal.valueOf(0.10)));
//        } else {
//            return salary.add(salary.multiply(BigDecimal.valueOf(0.15)));
//        }
//    }
}
