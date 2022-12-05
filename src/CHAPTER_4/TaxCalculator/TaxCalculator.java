package CHAPTER_4.TaxCalculator;

import java.math.BigDecimal;

public class TaxCalculator {
    private static  final BigDecimal MINIMUM_EARNINGS = BigDecimal.valueOf(30000);
    private static final BigDecimal BASE_TAX_RATE = BigDecimal.valueOf(0.15);
    private static final BigDecimal ADDITIONAL_TAX_RATE = BigDecimal.valueOf(0.2);


    public static BigDecimal calculateTax(Citizen citizen) {
        BigDecimal taxAmount = BigDecimal.ZERO;

        if (citizen.getEarnings().compareTo(MINIMUM_EARNINGS) > 0) {
            BigDecimal two = citizen.getEarnings().subtract(MINIMUM_EARNINGS);

            BigDecimal newEarning = two.multiply(ADDITIONAL_TAX_RATE);
            BigDecimal oldEarning = MINIMUM_EARNINGS.multiply(BASE_TAX_RATE);

            taxAmount = oldEarning.add(newEarning);
        } else {
            taxAmount = citizen.getEarnings().multiply(BASE_TAX_RATE);
        }
        return taxAmount;

    }
}
