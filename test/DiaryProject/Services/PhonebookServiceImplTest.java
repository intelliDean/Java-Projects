package DiaryProject.Services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookServiceImplTest {
    PhonebookService phoneService;

    @BeforeEach
    void setUp() {
        phoneService = new PhonebookServiceImpl();
    }
    @Test
    void registerUser() {
        phoneService.register("Dean", "0909");

    }

}