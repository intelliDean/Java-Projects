package CHAPTER_4;

import CHAPTER_4.TaxCalculator.Citizen;
import CHAPTER_4.TaxCalculator.TaxCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxCalculatorTest {
    private TaxCalculator taxCal;

    private Citizen michael;
    private Citizen dean;
    private Citizen mike;
    private Citizen sule;

    @BeforeEach
    public void setUp() {
        michael = new Citizen();
        michael.setFirstName("Michael");
        michael.setLastName("John");
        michael.setEarnings(new BigDecimal(45000));

        dean = new Citizen("Dean", "Michael");
        dean.setEarnings(BigDecimal.valueOf(54000));

        mike =  new Citizen("Michael", "Dean", BigDecimal.valueOf(24000));

    }
    @Test
    public void calculateTax() {
        BigDecimal michaelTax = TaxCalculator.calculateTax(michael);
        assertEquals(7500, michaelTax.intValue());
    }
    @Test
    public void calculateTaxForDean() {
        BigDecimal deanTax = TaxCalculator.calculateTax(dean);
        assertEquals(9300, deanTax.intValue());
    }
    @Test
    public void calculateTaxForMike() {
        BigDecimal mikeTax = TaxCalculator.calculateTax(mike);
        assertEquals(3600, mikeTax.intValue() );
    }
}