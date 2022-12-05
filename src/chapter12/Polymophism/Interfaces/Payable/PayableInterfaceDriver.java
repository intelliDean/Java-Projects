package chapter12.Polymophism.Interfaces.Payable;

import chapter12.Polymophism.Employee.Invoice;
import chapter12.Polymophism.Employee.SalariedEmployee;
import chapter12.Polymophism.Interfaces.Payable.Payable;
import chapter8.DatePackage.Date;

public class PayableInterfaceDriver {
    public static void main(String[] args) {
        Date john = new Date(12, 3, 1980);
        Date lisa = new Date(1, 8, 1990);
        // create four-element Payable array
        Payable[] payableObjects = new Payable[] {
                new Invoice("01234", "seat", 2, 375.00),
                 new Invoice("56789", "tire", 4, 79.95),
                 new SalariedEmployee("John", "Smith", "111-11-1111", 800.00, john),
                 new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00, lisa)
                 };
        System.out.println("Invoices and Employees processed polymorphically:");

         // generically process each element in array payableObjects
         for (Payable currentPayable : payableObjects) {
             // output currentPayable and its appropriate payment amount
             System.out.printf("%n%s %npayment due: $%,.2f%n",
                     currentPayable.toString(), // could invoke implicitly
                     currentPayable.getPaymentAmount());
         }
//         SalariedEmployee dean = createNewSalariedObject();  //Testing factory method
    }
//    FACTORY METHOD
//    public static SalariedEmployee createNewSalariedObject() {
//        return new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
//    }
}