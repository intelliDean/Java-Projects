package Chapter6;

public class PackingCharges {
    /*6.8 (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts. It should use the method calculateCharges to
determine the charge for each customer.*/

public void calculateCharge(int hoursUsed) {
    double firstCharge = 2;
    double extraHours = 0.5;
    double fullDay = 10;
    double charges;
    double currentCharges = fullDay + firstCharge;
         if (hoursUsed <= 3) {
              charges = firstCharge;
              System.out.println(charges);
         } else
         if (hoursUsed <= 19) {
              for (int i = 3; i <= hoursUsed; i++) {
                  if (i > 3) {
                       firstCharge += extraHours;
                  }
              }
                   charges = firstCharge;
             System.out.printf("%nYou packed for %dhours, your charges = $%.2f%n", hoursUsed,charges);
         }
         if (hoursUsed > 19 && hoursUsed <= 24) {
                   charges = fullDay;
             System.out.printf("%nYou packed for %dhours, your charges = $%.2f%n", hoursUsed,charges);
         }
         if (hoursUsed > 24 && hoursUsed <= 27) {
                   charges = fullDay + firstCharge;
             System.out.printf("%nYou packed for %dhours, your charges = $%.2f%n", hoursUsed,charges);
         }
         if (hoursUsed > 27){
              for (int i = 27; i <= hoursUsed; i++) {
              if (i > 27) {
                   currentCharges += extraHours;
              }
         }
         charges = currentCharges;
             System.out.printf("%nYou packed for %dhours, your charges = $%.2f%n", hoursUsed,charges);
         }
    }
}
