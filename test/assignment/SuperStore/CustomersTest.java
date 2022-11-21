package assignment.SuperStore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CustomersTest {
    Customers cuz = new Customers();
@Test
    void toTestThatPasswordWorks() {
    cuz.setPassword("@Summer1872!");
    assertEquals("@Summer1872!", cuz.getPassword());
}
@Test
    void toValidateEmails() {
    cuz.setEmail("deanchrist@gmail.com");
    assertEquals("deanchrist@gmail.com", cuz.getEmail());
}
}